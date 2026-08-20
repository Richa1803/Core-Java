package in.co.oop.encapsulation;

public class Automobile {

	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS =5;
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color =color;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return this.make;
	}
	public void setMake(String make) {
		this.make =make;
	}
	public void changeGear(int gear) {
		switch(gear){
			case 1:
				speed=10;
				System.out.println("gear no. 1 = "+speed);
				break;
			case 2:
				speed=30;
				System.out.println("gear no. 2 = "+speed);
				break;
			case 3:
				speed=50;
				System.out.println("gear no. 3 = "+speed);
				break;
			case 4:
			    speed=80;
			    System.out.println("gear no. 4 = "+speed);
			    break;
			case 5:
				speed=120;
				System.out.println("gear no. 5 = "+speed);
				break;
				
				default:
				System.out.println("over speed");
		}
	
	}
	public void accelerator() {
		this.speed = speed+10;
		System.out.println("accelerator speed = "+speed);
		
	}
	public void breakV() {
		this.speed = this.speed-10;
		if(this.speed==0) {
			System.out.println("vehical stop");
		}else {
			System.out.println("vehical stop apply break");
		}
	}
}
