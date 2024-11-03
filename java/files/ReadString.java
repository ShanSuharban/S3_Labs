import java.io.*;
public class ReadString {

	public static void main (String[] args)
	{
		try {
			String text;
			InputStreamReader isr = new InputStreamReader (System.in);
			BufferedReader br = new BufferedReader (isr);
			text=br.readLine();
			System.out.println (text);
		}

		catch (IOException e ){
			System.out.println ("Exception occured ");
		}

	}



	
}
