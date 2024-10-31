import java.util.Scanner;
public class Spal 
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		String str1,str2;
		int i,flag=0;
		System.out.println ("Enter the string: ");
		str1 = input.nextLine();
		str2 = "";
		
		for (i=str1.length()-1; i>=0; i--)
		{
			str2=str2+str1.charAt(i);
		}

		for (i=0; i<str1.length();i++)
		{ 
			if (str1.charAt(i)!=str2.charAt(i)) 
			{
				flag++;
				System.out.println (str1+" is not palindrome");
				break;
			}
		}

			if (flag==0)
				System.out.println (str1+" is palindrome ");
		

				

	}

}
