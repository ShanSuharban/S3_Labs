import java .util.Scanner;
class Matrix
{
        int [][]a = new int[100][100];
        //int [][]b = new int[100][100];
        int m,n,i,j;
        void read()
        {
                System.out.println("Enter the rows and columns of the 2*2  Matrix");
                Scanner input = new Scanner(System.in);
                m = input.nextInt();
                n = input.nextInt();
                System.out.println("Enter the elements");
                for(int i=0;i<n;i++)
                {
                        for(int j=0;j<n;j++)
                        {
                                Scanner in = new Scanner(System.in);
                                a[i][j] = in.nextInt();
                        }
                }
        }
        Matrix calc(Matrix n2)
        {
                Matrix o = new Matrix();
                if(this.m==n2.m && this.n==n2.n)
                {
                        for(i=0;i<m;i++)
                        {
                                for(j=0;j<n;j++)
                                {
                                        o.a[i][j] = this.a[i][j]+n2.a[i][j];
                                }
                        }
                }

                /** for(int i=0;i<this.m;i++)
                {
                        for(int j=0;j<this.n;j++)
                        {
                                System.out.print(" "+o.a[i][j]+" ");
                        }
                System.out.println(" ");
                }**/

                return o;

        }

        void display(Matrix m3)
        {
                System.out.println("The matrix is");
                for(int i=0;i<2;i++)
                {
                        for(int j=0;j<2;j++)
                        {
                                System.out.print("   "+m3.a[i][j]+" ");
                        }
                System.out.println(" ");
                }
        }
}
public class MatrixAdd
{
        public static void main(String []args)
        {
                Matrix m1 = new Matrix();
                m1.read();
                Matrix m2 = new Matrix();
                m2.read();
                Matrix m3 = new Matrix();
                m3 = m1.calc(m2);
                m3.display(m3);
        }
}
