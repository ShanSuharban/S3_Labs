import java.io.*;
public class TestCopyRead
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			FileInputStream f = new FileInputStream("/home/s3bcs17/oops/TestDemo.txt");
			System.out.println(f.read());
			f.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
