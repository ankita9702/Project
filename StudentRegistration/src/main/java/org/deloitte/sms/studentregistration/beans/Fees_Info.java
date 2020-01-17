package org.deloitte.sms.studentregistration.beans;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Entity
@Table(name="FEES_INFO")
@Component
public class Fees_Info implements Serializable{
	@Id
    private String standard;
    @Column(length=2)
	private int age;
    @Column(length=8,precision=2)
    private double stdFees;
    @Column(length=8,precision=2)
    private double transport_Fee;
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getStdFees() {
		return stdFees;
	}
	public void setStdFees(double stdFees) {
		this.stdFees = stdFees;
	}
	public double getTransport_Fee() {
		return transport_Fee;
	}
	public void setTransport_Fee(double transport_Fee) {
		this.transport_Fee = transport_Fee;
	}  
}
