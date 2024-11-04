import java.lang.Thread;
public class ThreadClassEg extends Thread
{
	public void run ()
	{
		System.out.println ("Thread started running... ");	
	}

	public static void main (String [] args)
	{
		ThreadClassEg th = new ThreadClassEg ();
		th.start();
	}
}
