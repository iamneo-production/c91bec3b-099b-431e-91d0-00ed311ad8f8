package com.examly.springapp.UserModel;


@Entity
@Table(name = "hall")
public class Hall {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String hallprice,halltype,company_id,company_companyname;

	long eventdate;
	public long getEventdate() {
		return eventdate;
	}
	public void setEventdate(long eventdate) {
		this.eventdate = eventdate;
	}
	
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	public String getCompany_companyname() {
		return company_companyname;
	}
	public void setCompany_companyname(String company_companyname) {
		this.company_companyname = company_companyname;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getHallprice() {
		return hallprice;
	}
	public void setHallprice(String hallprice) {
		this.hallprice = hallprice;
	}
	public String getHalltype() {
		return halltype;
	}
	public void setHalltype(String halltype) {
		this.halltype = halltype;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	boolean status;
	
}
