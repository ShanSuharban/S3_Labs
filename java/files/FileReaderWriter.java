import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter
{
	public static void main (String[] args)
	{
		FileReader filereader=null;
		FileWriter filewriter=null;
		try
		{
			filereader = new FileReader ("reader.txt");
			filewriter = new FileWriter ("writer.txt");
			int i;
			while ((i=filereader.read())!=-1)
				filewriter.write(i);
			System.out.println ("File Copied Successfully...");
		}
		catch (IOException e)
		{
			System.out.println ("ERROR: "+e.getMessage());
		}

		finally
		{
			try
			{
				if (filereader!=null)
					filereader.close();
				if (filewriter!=null)
					filewriter.close();
			}
			catch (IOException e)
			{
				System.out.println ("Error closing files : "+e.getMessage());
			}
		}
	}
}
