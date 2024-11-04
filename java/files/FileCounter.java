import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCounter
{
	public static void main (String[] args)
	{
		int charCount=0;
		int wordCount=0;
		int lineCount=0;

		try 
		{
			BufferedReader br = new BufferedReader (new FileReader("words.txt"));
			String line;
			while ((line=br.readLine())!=null )
			{
				lineCount++;
				charCount+=line.length();
				String [] words = line.split("\\s+");
				wordCount+=words.length;
			}

			System.out.println ("Number of Characters: "+charCount);
			System.out.println ("Number of Words: "+wordCount);
			System.out.println ("Number of Lines: "+lineCount);
		}

		catch (IOException e )
		{
			System.out.println ("An error occured : "+e.getMessage());
		}
	}
}
