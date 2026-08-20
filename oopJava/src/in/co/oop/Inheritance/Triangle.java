package in.co.oop.Inheritance;

public class Triangle extends Shape{

	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public void Area() {
		double area = 0.5*this.base*this.height;
		System.out.println("Area of Triangle = "+area);
	}

}
