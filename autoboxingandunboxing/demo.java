package autoboxingandunboxing;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Converting Primitives into Wrapper Class is Auto Boxing ");
		int i=10;
		Integer j=i;
		//Same as above 
		
		Integer k=Integer.valueOf(i);
		System.out.println("The Value of j and k :"+j+" "+k);
		
		System.out.println("Converting Wrapper Class into primitives is Auto Unboxing");
		
		Integer x=30;
		int y=x;
		//Same as above
		int z =x.intValue();
		System.out.println("The Value of y and z :"+y+" "+z);
	}

}
