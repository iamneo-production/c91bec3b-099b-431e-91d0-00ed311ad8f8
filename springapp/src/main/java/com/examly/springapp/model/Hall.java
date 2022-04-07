package com.examly.springapp.model;

import javax.persistence.*;

@Entity
@Table(name = "hall")
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String eventdate;
    private double hallprice;
    private String halltype;
    private String description;
    private String addedOn;
    private String companyId;
    private String bookuser;
    private boolean status;
    

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventdate() {
        return eventdate;
    }

    public void setEventdate(String eventdate) {
        this.eventdate = eventdate;
    }

    public double getHallprice() {
        return hallprice;
    }

    public void setHallprice(double hallprice) {
        this.hallprice = hallprice;
    }

    public String getHalltype() {
        return halltype;
    }

    public void setHalltype(String halltype) {
        this.halltype = halltype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(String addedOn) {
        this.addedOn = addedOn;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getBookuser() {
        return bookuser;
    }

    public void setBookuser(String bookuser) {
        this.bookuser = bookuser;
    }
}



