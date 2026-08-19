package in.co.oop.encapsulation;

import java.util.Date;

public class Person {
	private String name;
	private String address;
	private Date dob;
	public int AVG_AGE=27;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;

	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return this.dob;

	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public int getAge(Date dob)
	{
		Date d = new Date();
		int age = d.getYear()-dob.getYear();
		return age;
		
	}
}
