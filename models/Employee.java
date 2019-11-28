package models;

import java.sql.Date;

public class Employee{

	private int employee_id;

	private String firstname;
	private String lastname;
	
	private Date date_of_birth;
	private int age;
	
	private String address;
	private String email;

	private long phone_number;
	private String password;
	
	private int position_code;
	private String position_title;
	
	private int status_code;
	private String status_name;
	private String clearance_lvl;
	
	public Employee() {
		
		
	}
	
	public Employee(int id, String firstname, String lastname, Date date_of_birth, int age, String address, String email, long phone_number, String password, int position_code, int status_code) {
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.employee_id = id;
		this.date_of_birth = date_of_birth;
		this.age = age;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phone_number = phone_number;
		this.position_code = position_code;
		this.status_code = status_code;
		
	}
	
	public Employee(int id, String firstname, String lastname, Date date_of_birth, int age, String address, String email, long phone_number, String password, String position_title, String status_name, String clearance_lvl) {
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.employee_id = id;
		this.date_of_birth = date_of_birth;
		this.age = age;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phone_number = phone_number;
		this.position_title = position_title;
		this.status_name = status_name;
		this.clearance_lvl = clearance_lvl;
		
	}
	
	public Employee(String firstname, String lastname, Date date_of_birth, int age, String address, String email, long phone_number, String password, int position_code, int status_code) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.date_of_birth = date_of_birth;
		this.age = age;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phone_number = phone_number;
		this.position_code = position_code;
		this.status_code = status_code;
		
	}
	
	
	public String getClearance_lvl() {
		return clearance_lvl;
	}

	public void setClearance_lvl(String clearance_lvl) {
		this.clearance_lvl = clearance_lvl;
	}

	public int getPosition_code() {
		return position_code;
	}

	public void setPosition_code(int position_code) {
		this.position_code = position_code;
	}

	public int getStatus_code() {
		return status_code;
	}

	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}

	public String getPosition_title() {
		return position_title;
	}

	public void setPosition_title(String position_title) {
		this.position_title = position_title;
	}

	public String getStatus_name() {
		return status_name;
	}

	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}

	public int getEmployeeId() {
		return this.employee_id;
	}
	
	public void setEmployeeId(int employee_id) {
		this.employee_id = employee_id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_number() {
		return phone_number;
	}
	
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
