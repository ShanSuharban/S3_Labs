import java.io.*;
public class ReadCopyChar
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			FileInputStream f = new FileInputStream("TestDemo.txt");
			System.out.println(f.read());
			f.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
