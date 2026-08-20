package in.co.oop.Inheritance;

public class Circle extends Shape{

	private double radius;

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void area() {
	double	area = Math.PI*this.radius*this.radius;
		System.out.println("area of circle = "+area);
	}
}
