import java.io.*;
public class TestCopy
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream f = new FileInputStream("/home/s3bcs17/oops/Test.txt");
			FileOutputStream f1 = new FileOutputStream("/home/s3bcs17/oops/TestDemo.txt");
			f1.write(f.read());
			f.close();
			f1.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
