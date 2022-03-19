package com.examly.springapp.UserModel;

@Entity
@Table(name="book")
public class Book {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String booking_id,payment_type,name,email,book_date;
	public String getBook_date() {
		return book_date;
	}
	public void setBook_date(String book_date) {
		this.book_date = book_date;
	}
	long user_id,mobile;
	double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name ="halldetails_id")
	HallDetails halldetails;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public HallDetails getHalldetails() {
		return halldetails;
	}
	public void setHalldetails(HallDetails halldetails) {
		this.halldetails = halldetails;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(String booking_id) {
		this.booking_id = booking_id;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	
    
}
