package aggregation;

public class Rectangle {
	
	private double length;
	private double breadth;
	
	// Parameterized Constructor
	public Rectangle(double l,double b)
	{
		length=l;
		breadth=b;
	}
	
	//Default Constructor
	public Rectangle()
	{
		length=5;
		breadth=10;
	}
	public double getArea() {
		return length*breadth;
	}
	
}
