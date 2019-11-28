package sampleprograms;

public class Singleton {
	
	public static Singleton instance = null;
	
	public String s;
	
	public Singleton()
	{
		s= "hI kiRaN";
	}
	
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}

}
