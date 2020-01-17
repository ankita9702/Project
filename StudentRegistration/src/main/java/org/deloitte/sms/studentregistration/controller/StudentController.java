package org.deloitte.sms.studentregistration.controller;

import org.deloitte.sms.studentregistration.beans.Student_Info;
import org.deloitte.sms.studentregistration.dao.StudentDao;
import org.deloitte.sms.studentregistration.utils.BusinessException;
import org.deloitte.sms.studentregistration.utils.RegistrationBO;
import org.deloitte.sms.studentregistration.utils.StudentAge;
/*import org.deloitte.sms.studentregistration.utils.BusinessException;
import org.deloitte.sms.studentregistration.utils.RegistrationBO;
import org.deloitte.sms.studentregistration.utils.StudentAge;*/
import org.deloitte.sms.studentregistration.utils.StudentCountryID;
import org.deloitte.sms.studentregistration.utils.StudentID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	@Autowired
	StudentDao dao;
	
	@RequestMapping(value="/addstudent", method=RequestMethod.GET)
	public String ShowRegdStudentForm(){
		return "StudentRegistrationForm";
	}
	@RequestMapping(value="/errormsg", method=RequestMethod.GET)
	public String ShowErrorPage(){
		return "ErrorPage";
	}
	@RequestMapping(value="/addstudent", method=RequestMethod.POST)
	public ModelAndView registerStudent(@ModelAttribute("student_Info") Student_Info student, 
			@RequestParam("date_Of_Joining") String date_Of_Joining,
			@RequestParam("country_Name") String country,
			@RequestParam("state_Name") String state){
		ModelAndView mav = new ModelAndView();
		try{
			if(!(RegistrationBO.registerStudentVContact(student.getContact_No())))
					throw new BusinessException("ERROR CODE 506:Invalid Contact No");	
			if(!(RegistrationBO.registerStudentVName(student.getStudent_Name())))
					throw new BusinessException("ERROR CODE 501:Invalid Student Name");	
			if(!RegistrationBO.registerStudentVDOB(student.getDate_Of_Birth().toString()))
				throw new BusinessException("ERROR CODE 504:Invalid DOB");
			if(!RegistrationBO.registerStudentVDOJ(date_Of_Joining))
				throw new BusinessException("ERROR CODE 505:Invalid DOJ");
			if(!RegistrationBO.registerStudentVAge(StudentAge.getAge(student.getDate_Of_Birth().toString()), student.getStandard()))
				throw new BusinessException("ERROR CODE 503:Student Age is not suitable for the selected Standard");
		}
		catch(BusinessException e){
			System.out.println(e.getMessage());
			mav.addObject("Error", e.getMessage());
			mav.setViewName("redirect:errormsg");
			return mav;
		}
		student.setStudent_ID(StudentID.generateStudentID(10));
		student.setCountry_ID(StudentCountryID.getCountryID(country, state));
		dao.insertStudent(student);
		mav.setViewName("SucessPage");
		return mav;
	}
}
