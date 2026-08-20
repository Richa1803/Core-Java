package in.co.oop.encapsulation;

public class TestStudent {
	public static void main(String[] args) {

		Student s = new Student();
		s.setStudentId(101);
		s.setName("Riya");
		s.setEmail("riya@gmail.com");
		s.setMobileNo("7548963330");
		s.setCourse("Java");

		System.out.println("ID = " + s.getStudentId());
		System.out.println("Name = " + s.getName());
		System.out.println("Email = " + s.getEmail());
		System.out.println("Mobile = " + s.getMobileNo());
		System.out.println("course = " + s.getCourse());
	}

}
