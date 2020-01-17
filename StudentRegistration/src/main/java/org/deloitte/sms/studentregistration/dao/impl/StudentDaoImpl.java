package org.deloitte.sms.studentregistration.dao.impl;

import java.util.List;

import org.deloitte.sms.studentregistration.beans.Fees_Info;
import org.deloitte.sms.studentregistration.beans.Student_Info;
import org.deloitte.sms.studentregistration.dao.StudentDao;
import org.deloitte.sms.studentregistration.utils.CalculateNetFees;
import org.deloitte.sms.studentregistration.utils.StudentID;
import org.deloitte.sms.studentregistration.utils.StudentStandardCategory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	SessionFactory sessionFactory;
	
	
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	@Override
	public Fees_Info retrieveFees(String standard) {
		Session session = sessionFactory.getCurrentSession();
		Fees_Info fees_Info = (Fees_Info) session.get(Fees_Info.class, standard);
		return fees_Info;
	}

	@Override
	public int retrieveTotalRegistrations() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Student_Info> studentList = session.createQuery("from Student_Info").list();
		if(studentList==null)
			return 0;
		return studentList.size();
		
	}

	@Override
	public void insertStudent(Student_Info student) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
	//	int totalRegds = retrieveTotalRegistrations();
		@SuppressWarnings("unchecked")
		List<Student_Info> studentList = session.createQuery("from Student_Info").list();
		student.setStudent_ID(StudentID.generateStudentID(studentList.size()));
		student.setStandard_Category(StudentStandardCategory.getStandardCategory(student.getStandard()));
       
		double trans_Fee=1200.0;
		double std_fees=0.0;
		switch(student.getStandard()){
		case "I":	std_fees=18000.0;break;
		case "II": std_fees=20000.0;break;
		case "III":std_fees=22000.0;break;
		case "IV":std_fees=24000.0;break;
		case "V":std_fees=26000.0;break;
		case "VI":std_fees=28000.0;break;
		case "VII":std_fees=30000.0;break;
		case "VIII":std_fees=32000.0;break;
		case "IX":std_fees=34000.0;break;
		case "X":std_fees=40000.0;break;
		case "XI":std_fees=45000.0;break;
		case "XII":std_fees=50000.0;break;
		}	
		student.setNet_Fees(CalculateNetFees.calculateNetFees(std_fees,trans_Fee, student.getTransport()));
		System.out.println(student.getStudent_ID());
		System.out.println(student.getStudent_Name());
		System.out.println(student.getDate_Of_Birth());
		System.out.println(student.getGuardian_Type());
		System.out.println(student.getGuardian_Name());
		System.out.println(student.getAddress());
		System.out.println(student.getCountry_ID());
		System.out.println(student.getContact_No());
		System.out.println(student.getMail_ID());
		System.out.println(student.getGender());
		System.out.println(student.getStandard());
		System.out.println(StudentStandardCategory.getStandardCategory(student.getStandard()));
		System.out.println(student.getTransport());
		System.out.println(student.getNet_Fees());
		session.save(student);
		tx.commit();
		session.close();
	}
}
