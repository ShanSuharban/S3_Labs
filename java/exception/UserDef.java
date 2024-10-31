
import java.util.Scanner;
import java.io.*;
class ThrowException {
	
	int c;

	 void check (int x, int y) {
                        if (x==0 || y==0) {
                                throw new ArithmeticException ("Division Problem !!! ");
                        }
                        else { 
                                System.out.println ("continued Normal division");
                               // ThrowException th = new ThrowException ();
                                c = x/y;
	                        System.out.println ("div: "+c);

                        }
         }

}

public class UserDef {
	public static void main (String[] args) {

		int a,b;
                Scanner input = new Scanner (System.in);
                System.out.println ("Enter two numbers: ");
                a=input.nextInt();
                b=input.nextInt();
 
		ThrowException th = new ThrowException ();

		try {
			th.check(a,b);		
		}
		catch (ArithmeticException e) {
			 System.out.println (e);
			//System.out.println ("Arithmetic Exception occured"); 
		}
	}
}

