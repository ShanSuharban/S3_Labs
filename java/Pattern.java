import java.util.Scanner;
public class Pattern 
{
	public static void main (String[] args) 
	{
		int r=1,i,j,n;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter no: ");
		n = input.nextInt();
		
		for (i=1;i<=4;i++)
		{
			for (j=1;j<=i;j++)
			{
				System.out.print(r+"\t");
				r++;	
			}
			System.out.println();
		}

		
	}
}
