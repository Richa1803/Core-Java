package in.co.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEmployee {
	
	public static void main(String[] args) throws ParseException {
		
		Employee e = new Employee();
		e.setEmployeeId(20102026);
		e.setName("Hema");
		e.setDesignation("pune");
		e.setSalary(60000);
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Date d = f.parse("20/08/2026");
		//String str =f.format(d);
		e.setDate(d);
		
		System.out.println("ID = "+e.getEmployeeId());
		System.out.println("Name = "+e.getName());
		System.out.println("Designation = "+e.getDesignation());
		System.out.println("Salary = "+e.getSalary());
		System.out.println("Date of joining = "+e.getDate());
	}

}
