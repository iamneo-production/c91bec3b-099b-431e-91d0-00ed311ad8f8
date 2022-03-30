package com.examly.springapp.UserModel;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="company")
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String companyname;
	String companyaddress;
	String companyemailid;
	public String getCompanyemailid() {
		return companyemailid;
	}
	public void setCompanyemailid(String companyemailid) {
		this.companyemailid = companyemailid;
	}
	long mobilenumber;
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanyaddress() {
		return companyaddress;
	}
	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyname;
	}
	public void setCompanyName(String companyname) {
		this.companyname = companyname;
	}
	
		
}

