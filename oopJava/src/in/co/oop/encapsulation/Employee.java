package in.co.oop.encapsulation;

import java.util.Date;

public class Employee {

	private long employeeId;
	private String name;
	private String Designation;
	private double salary;
	private Date joinDate;

	public Long getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(long id) {
		this.employeeId = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return this.Designation;
	}

	public void setDesignation(String designation) {
		this.Designation = designation;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return this.joinDate;
	}

	public void setDate(Date joinDate) {
		this.joinDate = joinDate;
	}

}
