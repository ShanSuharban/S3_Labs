import java.lang.Thread;
class ThreadId extends Thread
{
		// display the thread that is running
		public void run ()
		{
			try 
			{
				System.out.println ("Thread "+Thread.currentThread().getId()+" is running ...");
			}
	
			catch (Exception e )
			{
				System.out.println ("Exception is caught : "+e.getMessage());	
			}
		}
}
public class ThreadIdDemo 
{
	public static void main (String[] args)
	{
		int n=10; // no of threads
		for (int i=1;i<=n;i++)
		{
			ThreadId th = new ThreadId ();
			th.start();			
		}
	}
}
