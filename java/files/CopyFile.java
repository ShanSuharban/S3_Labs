import java.io.*;
public class CopyFile
{
	public static void main (String[] args)
	{
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream ("source.txt");
			fos = new FileOutputStream ("destination.txt");

			int i;
			while ((i=fis.read()) !=-1 )
				fos.write(i);

			System.out.println ("File content copied successfully ");
		}

		catch (IOException e ) {
			System.out.println ("An error occured: "+ e.getMessage());
		}

		finally {
			try {
				if (fis!=null)
					fis.close();
				if (fos!=null)
					fos.close();
			}

			catch (IOException e ) {
				System.out.println ("Failed to close streams ");
			}
			
		}
	}
}
