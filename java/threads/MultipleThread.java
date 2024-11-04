import java.lang.Thread;
class A extends Thread
{
	public void run ()
	{
		try 
		{
			for (int i=0;i<=10;i++)
			{
				System.out.println ("hello ");
				Thread.sleep(500);
			}
		}
		catch (Exception e )
		{
			System.out.println ("Exception occured : "+e.getMessage());
		}
	}
}

class B extends Thread
{
	 public void run ()
        {
                try
                {
                        for (int i=0;i<=10;i++)
                        {
                                System.out.println ("World!!! ");
                                Thread.sleep(500);
                        }
                }
                catch (Exception e )
                {
                        System.out.println ("Exception occured : "+e.getMessage());
                }
        }
}

public class MultipleThread
{
	public static void main (String[] args)
	{
		A obj1 = new A();
		B obj2 = new B();
		obj1.start();
		obj2.start();
	}
}
