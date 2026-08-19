package in.co.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		Person p = new Person();
		p.setName("Hemant Singh");
		p.setAddress("DPS nipnia");
		SimpleDateFormat da = new SimpleDateFormat("dd/MM/yyyy");
		Date de = da.parse("19/10/1993");
		//String s = da.format(p);
		p.setDob(de);
		
		System.out.println("Name = "+p.getName());
		System.out.println("Address = "+p.getAddress());
		System.out.println("Date of birth = "+p.getDob());
		System.out.println("Age = "+p.getAge(p.getDob()));
		
	}

}
