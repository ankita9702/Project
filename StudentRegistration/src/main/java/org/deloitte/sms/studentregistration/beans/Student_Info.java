package org.deloitte.sms.studentregistration.beans;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Entity
@Table(name="STUDENT_INFO")
@Component
public class Student_Info implements Serializable{
	@Id
    @Column(length=5)
	private String student_ID;
    @Column(length=30)
	private String student_Name;
    @Column(length=30)
	private String date_Of_Birth;
    @Column
	private char guardian_Type;
    @Column(length=30)
	private String guardian_Name;
    @Column(length=50)
	private String address;
   /* @OneToOne(targetEntity=Country_Info.class,cascade=CascadeType.ALL)
	@JoinColumn(name="country_ID",referencedColumnName="country_ID")*/
    @Column(length=10)
   	private String country_ID;
    @Column(length=10)
	private String contact_No;
    @Column(length=30)
	private String mail_ID;
	@Column
    private char gender;
	@Column(length=10)
    private String standard;
	@Column
	private char standard_Category;
	@Column
	private char transport;
	@Column(length=7,precision=2)
	private double net_Fees;
	public String getStudent_ID() {
		return student_ID;
	}
	public void setStudent_ID(String student_ID) {
		this.student_ID = student_ID;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getDate_Of_Birth() {
		return date_Of_Birth;
	}
	public void setDate_Of_Birth(String date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}
	public char getGuardian_Type() {
		return guardian_Type;
	}
	public void setGuardian_Type(char guardian_Type) {
		this.guardian_Type = guardian_Type;
	}
	public String getGuardian_Name() {
		return guardian_Name;
	}
	public void setGuardian_Name(String guardian_Name) {
		this.guardian_Name = guardian_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry_ID() {
		return country_ID;
	}
	public void setCountry_ID(String country_ID) {
		this.country_ID = country_ID;
	}
	public String getContact_No() {
		return contact_No;
	}
	public void setContact_No(String contact_No) {
		this.contact_No = contact_No;
	}
	public String getMail_ID() {
		return mail_ID;
	}
	public void setMail_ID(String mail_ID) {
		this.mail_ID = mail_ID;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public char getTransport() {
		return transport;
	}
	public void setTransport(char transport) {
		this.transport = transport;
	}
	public double getNet_Fees() {
		return net_Fees;
	}
	public void setNet_Fees(double net_Fees) {
		this.net_Fees = net_Fees;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getStandard_Category() {
		return standard_Category;
	}
	public void setStandard_Category(char standard_Category) {
		this.standard_Category = standard_Category;
	}
}
