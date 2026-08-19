package in.co.oop.encapsulation;

public class TestCourse {
	
	public static void main(String[] args) {
		
		Course c = new Course();
		c.setCourseId(101L);
		c.setCourseName("Basic Java");
		c.setDuration("Two weeks");
		c.setFees(25000.00);
		c.setTrainerName("Kanak Maam");
		
		System.out.println("ID = "+c.getCourseId());
		System.out.println("Course = "+c.getCourseName());
		System.out.println("Duration = "+c.getDuration());
		System.out.println("Fees = "+c.getFees());
		System.out.println("Trainer name = "+c.getTrainerName());
	}

}
