package org.deloitte.sms.studentregistration.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class RegistrationBO {

	private RegistrationBO() {
		
	}
	
//	Name validation
	public static boolean registerStudentVName(String student_Name) {
		char tempValue;
		int tempLength=student_Name.length();
		boolean tempBoolean=true;
			for(int i=0;i<tempLength;i++) {
				tempValue=student_Name.charAt(i);
				if(!((tempValue>64&&tempValue<91)||(tempValue>96&&tempValue<123)||tempValue==32)){
					tempBoolean=false;
					return tempBoolean;
				}
			}
		return tempBoolean;	
	}
	
//	Email Validation
	public static boolean registerStudentVMail(String mail_Id) {
		char tempValue;
		int tempLength=mail_Id.length();
		boolean tempBoollean=false;
		for(int i=0;i<tempLength;i++) {
			tempValue=mail_Id.charAt(i);
			if(tempValue==64)
				for(i+=1;i<tempLength;i++) {
					tempValue=mail_Id.charAt(i);
					if(tempValue==46) tempBoollean=true;
				}
			}
		return tempBoollean;
	}
//	contact validation
	public static boolean registerStudentVContact(String contact_No) {
		char tempValue;
		int tempLength=contact_No.length();
		boolean tempBoollean=true;
		if(tempLength!=10){
			tempBoollean=false;
			return tempBoollean;
		}
		for(int i=0;i<10;i++){
			tempValue=contact_No.charAt(i);
			if(tempValue<48||tempValue>57){
				tempBoollean=false;
				return tempBoollean;
			}
		}
		return tempBoollean;	
	} 
	
//	DOB Validation
	public static boolean registerStudentVDOB(String dob){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try {
			d = sdf.parse(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		LocalDate dateEntered = LocalDate.of(year, month, date);
		LocalDate now = LocalDate.now();
		Period period = Period.between(dateEntered,now);
		int difference = period.getYears();
		if(difference>=0){
			System.out.println(difference+" years");
			return true;
		}
		else{
			System.out.println(difference+" years");
			return false;
		}
	}
//	DOJ Validation
	public static boolean registerStudentVDOJ(String doj){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try {
			d = sdf.parse(doj);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		LocalDate dateEntered = LocalDate.of(year, month, date);
		LocalDate now = LocalDate.now();
		Period period = Period.between(dateEntered,now);
		int difference = period.getYears();
		System.out.println(difference+" years");
		if(difference<=0)
			return true;
		else
			return false;
	}
	
//  age validation	
	public static boolean registerStudentVAge(int age,String standard){
		int reqAge=0;
		switch(standard){
		case "I": reqAge=5;
					break;
		case "II": reqAge=6;
					break;
		case "III": reqAge=7;
					break;
		case "IV": reqAge=8;
					break;
		case "V": reqAge=9;
					break;
		case "VI": reqAge=10;
					break;
		case "VII": reqAge=11;
					break;
		case "VIII": reqAge=12;
					break;
		case "IX": reqAge=13;
					break;
		case "X": reqAge=14;
					break;
		case "XI": reqAge=15;
					break;
		case "XII": reqAge=16;
					break;
		}
		if(age>=reqAge)
			return true;
		
		return false;
	}
}