package org.deloitte.sms.studentregistration.utils;

public class StudentCountryID {
	public static String getCountryID(String country, String state){
		if(country.equals("India") && state.equals("TamilNadu"))
			return "C01";
		else if(country.equals("India") && state.equals("Kerala"))
			return "C02";
		else if(country.equals("India") && state.equals("Karnataka"))
			return "C03";
		else if(country.equals("India") && state.equals("Andhra Pradesh"))
			return "C04";
		else if(country.equals("UK") && state.equals("Scotland"))
			return "C05";
		else if(country.equals("USA") && state.equals("New Jersey"))
			return "C06";
		else if(country.equals("Italy") && state.equals("Rome"))
			return "C07";
		else
			return "invalid";
	}
}
