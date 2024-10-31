import java.util.Scanner;
public class Arm 
{
	public static void main (String[] args) 
	{
		int n,d,t,s=0;

		Scanner input = new Scanner (System.in);
		System.out.println("\nEnter number: ");
		n=input.nextInt();
			
		t=n;
		while (n!=0) 
		{
			d = n%10;
			s = s + (d*d*d);
			n = n/10;

      		}
		if (s==t)
			System.out.println(t+" is armstrong ");
		else
			System.out.println(t+" is not armstrong ");
		
	}
}
