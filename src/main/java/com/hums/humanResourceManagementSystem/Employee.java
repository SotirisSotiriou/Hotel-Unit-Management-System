package com.hums.humanResourceManagementSystem;

public class Employee {
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private String address;
	private String ssn;
	private EmpType type;
	private Salary salary;
	private Schedule schedule;
	
	public Employee(String firstname, String lastname, String email, String phone, String address, String ssn, EmpType type) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.ssn = ssn;
		this.type = type;
	}
	
	public Employee(String firstname, String lastname, String email, String phone, String address, String ssn, EmpType type, double price, Schedule schedule) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.ssn = ssn;
		this.type = type;
		this.schedule = schedule;
		Salary salary = new Salary(this.type);
		this.salary = salary;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public EmpType getType() {
		return type;
	}

	public void setType(EmpType type) {
		this.type = type;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	
}