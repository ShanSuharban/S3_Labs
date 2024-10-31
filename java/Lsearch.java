import java.util.Scanner;
public class Lsearch 
{
	public static void main (String[] args)
	{
		int i,n,key,flag=0;
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter array limit: ");
		n=input.nextInt();
		
		int []a = new int [n];
		System.out.println ("Enter array elements: ");
		for (i=0;i<n;i++) 
		{
			a[i]=input.nextInt();
		}

		System.out.println ("Enter the key: ");
		key=input.nextInt();

		for (i=0;i<n;i++)
		{
			if (a[i]==key) 
			{
				System.out.println ("Element found in "+(i+1)+" position");
				flag++;
				break;
			}
		}
		
		if (flag==0)
			System.out.println("Key is not found");
	}
}

