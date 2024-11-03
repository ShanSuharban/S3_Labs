import java.io.*;
public class WriteChar
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			FileOutputStream f = new FileOutputStream("TestDemo.txt"); //provide file path here
			f.write(17);
			f.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
