import java.util.Scanner;
public class MatrixAdd
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

                if (m!=p ||  n!=q)
                {
                        System.out.println ("Matrix addition is not possible ");
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
                                      c[i][j]  = a[i][j] + b[i][j];
                                }
                        }

                         System.out.println ("Added Matrix: ");
                         for (i=0;i<p;i++)
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
