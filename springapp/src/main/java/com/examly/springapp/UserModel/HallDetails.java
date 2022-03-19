package com.examly.springapp.UserModel;

@Entity
@Table(name="halldetails")
public class HallDetails {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String description;
	String hall_id,hall_eventdate,hall_halltype,hall_hallprice;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHall_id() {
		return hall_id;
	}
	public void setHall_id(String hall_id) {
		this.hall_id = hall_id;
	}
	public String getHall_eventdate() {
		return hall_eventdate;
	}
	public void setHall_eventdate(String hall_eventdate) {
		this.hall_eventdate = hall_eventdate;
	}
	public String getHall_halltype() {
		return hall_halltype;
	}
	public void setHall_halltype(String hall_halltype) {
		this.hall_halltype = hall_halltype;
	}
	public String getHall_hallprice() {
		return hall_hallprice;
	}
	public void setHall_hallprice(String hall_hallprice) {
		this.hall_hallprice = hall_hallprice;
	}
    
}
