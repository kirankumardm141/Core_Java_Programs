package instanceOf;

public class Containsdemo {
	
	public void calculate(Object obj)
	{
		if(obj instanceof Integer)
		{
			Integer i=(Integer)obj;
			System.out.println("Multiplication of two Integers : "+i*i);
		}
		else if(obj instanceof Float)
		{
			Float f= (Float)obj;
			System.out.println("Multiplication of two Floats : "+f*f);
		}
		else if(obj instanceof Double)
		{
			Double d= (Double)obj;
			System.out.println("Multiplication of two Double : "+d*d);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Containsdemo obj = new Containsdemo();
		obj.calculate(7);
		obj.calculate(7.5f);
		obj.calculate(8.5d);

	}

}
