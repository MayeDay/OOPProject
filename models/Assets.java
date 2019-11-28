package models;

public class Assets {

	private String name;
	private String stats;
	private String location;
	private String firstname;
	private String lastname;
	
	public Assets(String name, String stats, String location, String firstname, String lastname) {
		
		this.name = name;
		this.stats = stats;
		this.location = location;
		this.firstname = firstname;
		this.lastname = lastname;
			
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStats() {
		return stats;
	}

	public void setStats(String stats) {
		this.stats = stats;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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
}
