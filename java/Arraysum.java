import java.util.Scanner;
public class Arraysum 
{
	public static void main (String[] args)
	{
		int i,n,sum=0;
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter array limit: ");
		n=input.nextInt();
		
		int []a = new int [n];
		System.out.println ("Enter array elements: ");
		for (i=0;i<n;i++) 
		{
			a[i]=input.nextInt();
			sum+=a[i];
		}

		System.out.println ("Sum of array: "+sum);
	}
}
