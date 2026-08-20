package in.co.oop.Inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	
	public static void main(String[] args) throws Exception {
		
		SimpleDateFormat sd =new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("----------Businessman---------");
		Businessman b = new Businessman();
		b.setName("Hari");
		b.setAddress("Apolo DB Indore ");
		//SimpleDateFormat sd =new SimpleDateFormat("dd/MM/yyyy");
		Date da = sd.parse("10/03/1996");
		b.setDateOfBirth(da);
		b.setIncome(60000);
		
		System.out.println("Name : "+b.getName());
		System.out.println("Address : "+b.getAddress());
		System.out.println("Date Of Birth : "+b.getDateOfBirth());
		System.out.println("Income : "+b.getIncome());

		
		System.out.println("--------Doctor---------");
		Doctor doc = new Doctor();
		doc.setName("dr. mathur");
		doc.setAddress("Bombay Hospital");
	    da = sd.parse("18/03/1994");
		doc.setDateOfBirth(da);
		doc.setRegistrationNo("BOM12033");
		
		System.out.println("Name : "+doc.getName());
		System.out.println("Address : "+doc.getAddress());
		System.out.println("Date Of Birth : "+doc.getDateOfBirth());
		System.out.println("RegistrationNo : "+doc.getRegistrationNo());
		
		
		System.out.println("---------Student-----------");
		Student s = new Student();
		s.setName("Mahi");
		da = sd.parse("19/08/1999");
		s.setDateOfBirth(da);
		s.setAddress("Bhopal");
		s.setRollNo("10000123");
		s.setMarks(65);
		
		System.out.println("Name : "+s.getName());
		System.out.println("Address : "+s.getAddress());
		System.out.println("Date Of Birth : "+s.getDateOfBirth());
		System.out.println("RegistrationNo : "+s.getRollNo());
		System.out.println("Marks : "+s.getMarks());
		
		
	}

}
