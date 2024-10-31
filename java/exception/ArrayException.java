import java.util.Scanner;
import java.io.*;
public class ArrayException {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter a limit: ");
		int n = input.nextInt();

		int [] a = new int [n];
		try {
			for (int i=0; i<=n; i++) 
				a[i]=input.nextInt();
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println ("Array Exception occured !!!");
		}
	}
}
