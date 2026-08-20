package in.co.oop.encapsulation;

public class TestAutomobile {

	public static void main(String[] args) {
		Automobile a = new Automobile();
		a.setColor("red");
		a.setSpeed(80);
		a.setMake("TATA");
		
		System.out.println("color = "+a.getColor());
		System.out.println("Speed = "+a.getSpeed());
		System.out.println("Make = "+a.getMake());
		
		a.changeGear(5);
		a.accelerator();
		a.breakV();
		
	}
}
