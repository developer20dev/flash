package com.cp.pojo;

public class EmployeePojo {

	private String id;
	private String firstName;
	private String lastName;
	private String contact;
	private String address;

	public EmployeePojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeePojo(String id, String firstName, String lastName, String contact, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", contact=" + contact
				+ ", address=" + address + "]";
	}

}
