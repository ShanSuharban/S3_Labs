import java.io.*;
public class TestWrite
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			FileOutputStream f = new FileOutputStream("/home/s3bcs17/oops/Test.txt");
			f.write(17);
			f.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
