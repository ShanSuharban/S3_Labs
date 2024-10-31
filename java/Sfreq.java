import java.util.Scanner;
public class Sfreq
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		String str1;
		char ch;
		int i,count=0;
		System.out.println ("Enter the string: ");
		str1 = input.nextLine();
		System.out.println ("Enter the character: ");
		ch=input.nextLine().charAt(0);
		

		for (i=0; i<str1.length();i++)
		{ 
			if (str1.charAt(i)==ch) 
			{
				count++;
			}
		}
		
		System.out.println ("Frequency of letter "+ch +" in "+str1+" is "+count);			

	}

}
