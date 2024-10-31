import java.util.Scanner;
public class Bsort 
{
	public static void main (String[] args)
	{
		int i,j,n,t;
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter array limit: ");
		n=input.nextInt();
		
		int []a = new int [n];
		System.out.println ("Enter array elements: ");
		for (i=0;i<n;i++) 
		{
			a[i]=input.nextInt();
		}

		for (i=0;i<n-1;i++)
		{
			for (j=0;j<n-1-i;j++) 
			{
				if (a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}

		System.out.println ("Sorted array: ");
		for (i=0;i<n;i++)
		{
			System.out.print (a[i]+"\t");
		}
	}

}

