package com.examly.springapp.UserModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="hall")
public class Hall {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String hallname,halltype,price,eventdate,added_on;
    long company_id;
	public long getCompany_id() {
		return company_id;
	}
	public void setCompany_id(long company_id) {
		this.company_id = company_id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getHallname() {
		return hallname;
	}
	public void setHallname(String hallname) {
		this.hallname = hallname;
	}

	public String getEventdate() {
		return eventdate;
	}
	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}
	public String getAdded_on() {
		return added_on;
	}
	public void setAdded_on(String added_on) {
		this.added_on = added_on;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getHalltype() {
		return halltype;
	}
	public void setHalltype(String halltype) {
		this.halltype = halltype;
	}

	

}
