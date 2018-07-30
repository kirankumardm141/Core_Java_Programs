package aggregation;

public class Rectangle {
	
	private double length;
	private double breadth;
	public Rectangle(double l,double b)
	{
		length=l;
		breadth=b;
	}
	public double getArea() {
		return length*breadth;
	}
	
}
