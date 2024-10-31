import java.util.Scanner;
import java.io.*;
public class Finally {
	public static void main (String [] args) {
		int a,b;
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter two numbers: ");
		a=input.nextInt();
		b=input.nextInt();

		int sum = a + b;
		System.out.println ("sum: "+sum);

		

		try {
			int c = a/b;
			System.out.println ("div: "+c);
		}
		catch (ArithmeticException e) {
			System.out.println ("Arithmetic Exception founded !!");
		}

		finally {
			System.out.println ("Im executed even after Exception");
		}

	}
}
