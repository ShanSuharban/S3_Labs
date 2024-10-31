import java.util.Scanner;
public class Matrixmult
{
	public static void main (String[] args)
	{
		int i,j,m,n,p,q;
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter the row and col of matrix1 ");
		m=input.nextInt();
		n=input.nextInt();
		System.out.println ("Enter the row and col of matrix2: ");
		p=input.nextInt();
		q=input.nextInt();

		if (n!=p)
		{
			System.out.println ("Matrix multiplication is not possible ");
		}

		else 
		{
			
			int [][] a = new int [m][n];
			int [][] b = new int [p][q];
		        int [][] c = new int [m][q];
			System.out.println ("Enter matrix1 elements: ");
			for (i=0;i<m;i++)
			{
				for (j=0;j<q;j++) 
				{
					a[i][j] = input.nextInt();
				}

			}

			System.out.println ("Enter matrix2 elements: ");
			for (i=0;i<p;i++)
			{
				for (j=0;j<q;j++)
				{
					b[i][j] = input.nextInt();
				}
			}		
			
			 for (i=0;i<m;i++)
                        {
                                for (j=0;j<q;j++)
                                {
                                        c[i][j]  = 0;
					
					for (int k=0;k<n;k++) 
					{
						c[i][j] = c [i][j] +  a[i][k] * b [k][j];
					}		
                                }
                        }
		
			 System.out.println ("Multiplied Matrix: ");                        
			 for (i=0;i<m;i++)
                        {
                                for (j=0;j<q;j++)
                                {
                                        System.out.print (c[i][j]+"\t");
                                }
				System.out.println ();
                        }
                        


		}
	}
}

