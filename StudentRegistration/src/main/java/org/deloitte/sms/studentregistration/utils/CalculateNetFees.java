package org.deloitte.sms.studentregistration.utils;



public class CalculateNetFees {
	public static double calculateNetFees(double std_Fees,double transport_Fees,char transport){
		if(transport=='N')
			return (std_Fees);
		else return(std_Fees+transport_Fees);
	}
}
