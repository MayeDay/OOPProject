package controller;

import java.sql.Date;
import java.util.LinkedList;

import database.Database;
import models.Assets;
import models.Employee;

public class Maincontroller {
	
	private static Maincontroller maincontroller = null;
	private Database database;
	private Employee employee = null;
	private Assets assets = null;
	
	private Maincontroller() {
		
		database = Database.getDatabase();
		//addAsset("Matches", 1, 3);
	}
	
	public static Maincontroller getMaincontroller() {
		
		if(maincontroller == null)
			maincontroller = new Maincontroller();
		
		return maincontroller;
	}
	
	public boolean verifyLogin(String email, String password) {
		
		boolean login = false;
		
		if(database.loginVerification(email, password) != null) {
			employee = database.loginVerification(email, password);
			login = true;
		}
		
		System.out.println(login);
		return login;
	}
	
	public boolean addEmployee(String firstname, String lastname, Date dob, int age, String address, String email, long phonenumber, String password, int position_code, int status_code ) {
		
		return database.addEmployee(new Employee(firstname, lastname, dob, age, address, email, phonenumber, password, position_code, status_code));
	}
	
	public boolean addAsset(String name, String status, String location, String firstname, String lastname) {
		
		boolean added = false;
		this.assets = new Assets(name, status, location, firstname, lastname);
		
		if(database.addAsset(assets)) {
			added = true;

		}
		
		return added;
		
	}
	
	public LinkedList<Employee> getEmployeeList(){
		
		return database.getEmployeeList();
	}
	
	public Employee getLoggedInEmployee() {
		return this.employee;
	}
	
	public boolean changeLocation(int x) {

		boolean change = false;
		
		if(database.changeAssetLocation(x))
			change = true;
		
		return change;		
	}
	
	/////////////////////////////// FINISH GETTING ASSETS LIST////////////////////////////
	
	public LinkedList<Assets> getAssets(){
		return database.getAsset();
	}
	
	public LinkedList<Assets>getGPAssets(){
		return database.getGPAssets();
	}
	
	public LinkedList<Assets> getLvAssets(){
		return database.getLvAssets();
	}
	
	public LinkedList<Assets>getBorrowed(){
		return database.getBorrowed();
	}
	
	public LinkedList<Assets>getReturned(){
		return database.getReturned();
	}
	
	public LinkedList<Assets>getAvailable(){
		return database.getAvailable();
	}
	
	/**public static void main(String args[]) {
		
		Maincontroller mc = new Maincontroller();
	}**/
	
}



