import java.io.*;
public class ReadChar
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream f = new FileInputStream("Test.txt"); // provide path here 
			System.out.println(f.read());
			f.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
