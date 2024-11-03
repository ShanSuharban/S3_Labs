import java.io.*;
public class CopyChar
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream f = new FileInputStream("Test.txt"); // to read the character file ,we want to copy
			FileOutputStream f1 = new FileOutputStream("TestDemo.txt"); // output copied character file 
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
