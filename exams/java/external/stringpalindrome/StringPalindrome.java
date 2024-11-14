import java.util.Scanner;
import java.io.*;
public class StringPalindrome 
{
	public static boolean  checkPalindrome (String str)
	{
		String rev=""; int flag=0;
		for (int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i)!=rev.charAt(i))
				flag++;
		}

		if (flag==0)
			return true;
		else
			return false;

	}

	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);	
		String stri, line="pal.txt";
		boolean result; 
		int count=0;
		System.out.println ("Enter the string: ");
		stri=input.nextLine();
		result=checkPalindrome(stri);

		if (result)
		{
			try(FileWriter wt = new FileWriter(line))
			{
				wt.write(stri);
				System.out.println("File written Succesfully!!!");
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}

		else
		{
			for (int i=0;i<stri.length();i++)
			{
				if (stri.charAt(i)=='a' || stri.charAt(i)=='e' || stri.charAt(i)=='i' || stri.charAt(i)=='o' || stri.charAt(i)=='u' || stri.charAt(i)=='A' || stri.charAt(i)=='E' || stri.charAt(i)=='I' || stri.charAt(i)=='O' || stri.charAt(i)=='U')
					count++;
			}
			System.out.println ("number of vowels: "+count);

		}


		
	}

}
