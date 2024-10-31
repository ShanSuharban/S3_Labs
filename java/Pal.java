import java.util.Scanner;
public class Pal 
{
	public static void main (String[] args)
	{
		int n,i,t,d,s=0;
		Scanner input = new Scanner (System.in);
		System.out.println("\nEnter number: ");
		n = input.nextInt();
		
		t = n;
		
		while (n!=0)
		{
			d = n%10;
			s = (s*10)+d;
			n = n/10;
		 }
		
		if (t == s)
			System.out.println(t+" is palindrome");
		else 
			System.out.println(t+" is not palindrome");

	}
}
