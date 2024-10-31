import java.util.Scanner;
import java.io.*;
class Throws {
	public void divide (int a, int b) throws ArithmeticException {
		try {
                        int c = a/b;
                        System.out.println ("div: "+c);
                }
                catch (ArithmeticException e) {
                        System.out.println ("Arithmetic Exception founded !!");
                }
		finally {
			System.out.println ("This work regardless of exception ");
		}

	}
}


public class ThrowsException {
	public static void main (String [] args) {
		int a,b;
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter two numbers: ");
		a=input.nextInt();
		b=input.nextInt();

		Throws thr =  new Throws ();
		thr.divide (a,b);

	}
}
