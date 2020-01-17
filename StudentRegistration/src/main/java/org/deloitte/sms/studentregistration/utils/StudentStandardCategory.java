package org.deloitte.sms.studentregistration.utils;



public class StudentStandardCategory {
	public static char getStandardCategory(String standard){
		char standardCategory = 'I';
		switch (standard) {
		case "I":
		case "II":
		case "III":
		case "IV":
		case "V":
			standardCategory='P';
			break;
		case "VI":
		case "VII":
		case "VIII":
		case "IX":
		case "X":
			standardCategory='S';
			break;
		case "XI":
		case "XII":
			standardCategory='H';
		}
		return standardCategory;
	}
}
