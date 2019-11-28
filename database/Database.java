package database;
import java.util.LinkedList;

import models.Assets;
import models.Employee;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Database {

	private Connection connect = null;
	private CallableStatement cs = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	private LinkedList<Employee> employee_list = null;
	private LinkedList<Assets> asset_list = null;
	private static Database database = null;
	private Employee employee = null;
	private Assets assets = null;
	
	private Database(){
		
		employee_list = new LinkedList<Employee>();
		asset_list = new LinkedList<Assets>();
		
		init();
	}
	
	public static Database getDatabase() {
		
		if(database == null)
			database = new Database();
		
		return database;
	}
	
	private void init() {
		
		String url = "jdbc:mysql://localhost/analyst_moniter";
		String username = "root";
		String password ="J@m3sM@y36094";

		try {	
			connect = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established");	
			
			reInitializeList();
			
		
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	private void reInitializeList() {
		
		employee_list.clear();
		
		try {
			
			cs = connect.prepareCall("{call mergeEmployeeList()}");
			
			rs = cs.executeQuery();
			
			while(rs.next()) {
				employee_list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getLong(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12)));
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public Employee loginVerification(String email, String password) {
		
		
		try {
			cs = connect.prepareCall("{call loginVerification(?,?)}");
		
			cs.setString(1, email);
			cs.setString(2, password);
			
			cs.execute();
			
			rs = cs.executeQuery();
			
			while(rs.next()) {
				
				if(rs.getString(7).contentEquals(email) && rs.getString(9).contentEquals(password)) {
					System.out.println(rs.getString(1));
					for(Employee ee: employee_list)
						if(ee.getEmail().contentEquals(email) && ee.getPassword().contentEquals(password))
							employee = ee;
							break;
				}
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	public boolean addEmployee(Employee employee) {
		
		boolean exists = false;
		
		try {
			
			cs = connect.prepareCall("{call addEmployee(?,?,?,?,?,?,?,?,?,?)}");
			
			cs.setString(1, employee.getFirstname());
			cs.setString(2, employee.getLastname());
			cs.setDate(3, employee.getDate_of_birth());
			cs.setInt(4, employee.getAge());
			cs.setString(5, employee.getAddress());
			cs.setString(6, employee.getEmail());
			cs.setLong(7, employee.getPhone_number());
			cs.setString(8, employee.getPassword());
			cs.setInt(9, employee.getPosition_code());
			cs.setInt(10, employee.getStatus_code());

	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		for(Employee em: employee_list) {
			
			if(em.getEmail().equals(employee.getEmail())) {
				exists = true;
				break;
			}
		}
		
		if(exists == false) {
			employee_list.add(employee);
		}
		
		reInitializeList();
		
		return exists;
	}
	
	public Employee getEmployee(int id) {
		
		for(Employee em: employee_list) {
			
			if(em.getEmployee_id() == id)
				 em = employee;
		}
		
		return employee;
	}
	
	public LinkedList<Employee> getEmployeeList(){
		reInitializeList();
		
		return employee_list;
	}
	
	public boolean addAsset(Assets assets) {
		
		boolean added = false;
		try {
			cs = connect.prepareCall("{call addAsset(?,?)}");
			
			cs.setString(1, assets.getName());
			cs.setString(2, assets.getLocation());
			
			cs.executeQuery();
			

			added = true;

			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		getAsset();
		
		return added;
	}
	
	public LinkedList<Assets> getAsset() {
		
		asset_list.clear();
		
		try {
			cs = connect.prepareCall("{call assetList()}");
			
			cs.execute();
			
			rs = cs.executeQuery();
			
			while(rs.next()) {
				
				asset_list.add(new Assets(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return asset_list;
	}
	
	public LinkedList<Assets> getGPAssets(){
		
		asset_list.clear();

		
		try {
			cs = connect.prepareCall("{call getGPAssets()}");
			
			cs.execute();
			
			rs = cs.executeQuery();
			
			while(rs.next()) {
				
				asset_list.add(new Assets(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return asset_list;
	}
	
	public LinkedList<Assets> getLvAssets(){
		
		asset_list.clear();

		try {
			cs = connect.prepareCall("{call getLVAssets()}");
			
			cs.execute();
			
			rs = cs.executeQuery();
			
			while(rs.next()) {
				
				asset_list.add(new Assets(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return asset_list;
	}
	
	public LinkedList<Assets> getReturned(){
		
		LinkedList<Assets> temps = new LinkedList<Assets>();
		
		try {
			cs = connect.prepareCall("{call getReturned()}");
			
			cs.execute();
			
			rs = cs.executeQuery();
			
			while(rs.next()) {
				
				temps.add(new Assets(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return temps;
	}

	public LinkedList<Assets> getBorrowed(){
	
		LinkedList<Assets> temps = new LinkedList<Assets>();
		
		try {
			cs = connect.prepareCall("{call getBorrowed()}");
			
			cs.execute();
			
			rs = cs.executeQuery();
			
			while(rs.next()) {
				
				temps.add(new Assets(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return temps;
	}

	public LinkedList<Assets> getAvailable(){
	
		LinkedList<Assets> temps = new LinkedList<Assets>();
		
		try {
			cs = connect.prepareCall("{call getAvailable()}");
			
			cs.execute();
			
			rs = cs.executeQuery();
			
			while(rs.next()) {
				
				temps.add(new Assets(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
		return temps;
	}
	
	public boolean changeAssetLocation(int x) {
		
		boolean change = false;
		
		try {
			cs = connect.prepareCall("{call changeLocation(?)}");
			cs.setInt(1, x);
			
			cs.execute();
			
			rs = cs.executeQuery();
			change = true;

			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return change;
	}

	
}
