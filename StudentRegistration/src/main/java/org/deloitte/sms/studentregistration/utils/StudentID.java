package org.deloitte.sms.studentregistration.utils;




public class StudentID {
	public static String generateStudentID(int totalRegds){
		String start = "R-";
		
		totalRegds++;
		String regdno; 
		if(totalRegds<10)
			regdno = start+"00"+totalRegds;
		else if(totalRegds<100)
			regdno = start+"0"+totalRegds;
		else
			regdno = start+totalRegds;
		return regdno;
	}
}
