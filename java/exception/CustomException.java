class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
             super(str);  
    }  
}  
class TestCustomException 
{  
     void validate (int age) throws InvalidAgeException
     {    
       if(age < 18)
       {  
          throw new InvalidAgeException("age is not valid to vote ");    
        }  
       else {   
        System.out.println("welcome to vote");   
        }
     }  
}

public class CustomException {
	public static void main (String [] args)
	{

		TestCustomException t = new TestCustomException ();
	try {
		t.validate (17);
	}
	catch (InvalidAgeException ex)
	{
            System.out.println("Caught the exception");  
            System.out.println("Exception occured: " + ex);  
	}

	}
}

