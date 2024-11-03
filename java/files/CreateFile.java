import java.io.File;
import java.io.IOException;
public class CreateFile
{
	public static void main(String[] args)
	{
		try
		{
			File f = new File("Test.txt");
			boolean value = f.createNewFile();
			if(value)
				System.out.println("File created successfully");
			else
				System.out.println("File not created");
			System.out.println("Filepath: "+f.getAbsolutePath());
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}

