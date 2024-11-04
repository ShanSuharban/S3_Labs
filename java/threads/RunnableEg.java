import java.lang.Thread;
public class RunnableEg implements Runnable
{
	public void run () // here inside the function, define your thread program
	{
		System.out.println ("My thread is running state ...");
	}
	public static void main (String[] args)
	{
		RunnableEg robj = new RunnableEg ();
		Thread tobj = new Thread (robj);
		tobj.start (); //  start() method in thread class auto start the run () method
		
	}
}
