package in.co.oop.Inheritance;

public class TestSape {
	public static void main(String[] args) {
	
		System.out.println("---------Circle-----------");
	    Circle c = new Circle();
	    c.setRadius(2);
	    c.setColor("Pink");
	    c.setBorderWidth(1);
	    System.out.println("Radius = "+c.getRadius());
	    System.out.println("Color = "+c.getColor());
	    System.out.println("Border Width = "+c.getBorderWidth());
	    c.area();
	   // System.out.println(" area circle = "+c.area);
	
	    System.out.println("---------Rectangle-----------");
	    Rectangle r = new Rectangle();
	    r.setLength(5);
	    r.setWidth(3);
	    r.setColor("Green");
	    r.setBorderWidth(1);
	    System.out.println("Length = "+r.getLength());
	    System.out.println("width = "+r.getWidth());
	    System.out.println("colour = "+r.getColor());
	    System.out.println("Border width = "+r.getBorderWidth());
	    r.Area();
	    
	    System.out.println("---------Triangle-----------");
	    Triangle t = new Triangle();
	    t.setBase(1);
	    t.setHeight(3);
	    t.setColor("Red");
	    t.setBorderWidth(0);
	    System.out.println("Base = "+t.getBase());
	    System.out.println("Height = "+t.getHeight());
	    System.out.println("colour = "+t.getColor());
	    System.out.println("Border width = "+t.getBorderWidth());
	    t.Area();
	
	}

}
