import java.time.LocalDate;
import java.util.*; 

public class Internship {
	
	private String companyName,position,location,status; 
	private LocalDate applicationDate; 
	private double salary; 
	
	public Internship(String companyName,String position,String location,
			String status,LocalDate applicationDate, double salary) {
		
			this.companyName=companyName; 
			this.position = position; 
			this.location = location; 
			this.status = status; 
			this.applicationDate = applicationDate; 
			this.salary = salary; 
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString () {
		return "Company: " + companyName + 
		"\nPosition: "+ position + 
		"\nLocation: " + location +
        "\nApplication Date: " + applicationDate +
        "\nStatus: " + status +
        "\nSalary: $" + salary;

	}
	

}
