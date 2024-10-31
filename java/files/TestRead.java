import java.io.*;
public class TestRead
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream f = new FileInputStream("/home/s3bcs17/oops/Test.txt");
			System.out.println(f.read());
			f.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
