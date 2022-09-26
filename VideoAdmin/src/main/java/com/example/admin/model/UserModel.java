package com.example.admin.model;


public class UserModel {

	int customer_id;
	String customer_name;
	String contact_no;
	String contact_address;
	String date_of_registration;
	int age;
	
	public UserModel() {
		
	}
	

	public UserModel(int customer_id, String customer_name, String contact_no, String contact_address,
			String date_of_registration, int age) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.contact_no = contact_no;
		this.contact_address = contact_address;
		this.date_of_registration = date_of_registration;
		this.age = age;
	}



	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getContact_address() {
		return contact_address;
	}

	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
	}

	public String getDate_of_registration() {
		return date_of_registration;
	}

	public void setDate_of_registration(String date_of_registration) {
		this.date_of_registration = date_of_registration;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
