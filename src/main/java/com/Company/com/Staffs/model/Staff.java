package com.Company.com.Staffs.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="staff_details")

public class Staff {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private long id;
	
	@Column(name="Name")
	private String staffname;
	
	@Column(name="Staff_address")
	private String address;
	
	@Column(name="Email")
	private String email;


	public Staff() {


	}
	public Staff(String staffname, String address, String email) {
		super();
		this.staffname = staffname;
		this.address = address;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}








}
