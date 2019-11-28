package customexceptions;

public class ValidateUser{

	// Default Scope
	static void Validate(String uname, String pwd) throws InvalidLoginException {
		if((uname.equalsIgnoreCase("Kiran")) && (pwd.equals("kdm")))
		{
//			System.out.println("Valid User");
				try {
					throw new ValidLoginException("Valid User :)");
				} catch (ValidLoginException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		else {
//			System.out.println("InValid User");
			throw new InvalidLoginException("Invalid User :(");
		}
	}

}
