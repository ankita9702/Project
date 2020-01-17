package org.deloitte.sms.studentregistration.dao;

import org.deloitte.sms.studentregistration.beans.Fees_Info;
import org.deloitte.sms.studentregistration.beans.Student_Info;

public interface StudentDao {
	public int retrieveTotalRegistrations();
	public void insertStudent(Student_Info student);
	public Fees_Info retrieveFees(String standard);
}
