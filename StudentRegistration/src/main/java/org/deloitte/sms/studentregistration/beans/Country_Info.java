package org.deloitte.sms.studentregistration.beans;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Entity
@Table(name="COUNTRY_INFO")
@Component
public class Country_Info implements Serializable{
	@Id
    private String country_ID;
	@Column(length=25)
    private String country_Name;
	@Column(length=25)
    private String state_Name;
	public String getCountry_ID() {
		return country_ID;
	}
	public void setCountry_ID(String country_ID) {
		this.country_ID = country_ID;
	}
	public String getCountry_Name() {
		return country_Name;
	}
	public void setCountry_Name(String country_Name) {
		this.country_Name = country_Name;
	}
	public String getState_Name() {
		return state_Name;
	}
	public void setState_Name(String state_Name) {
		this.state_Name = state_Name;
	}
}
