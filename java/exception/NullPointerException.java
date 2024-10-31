import java.util.Scanner;
import java.io.*;
public class NullPointerException {
	public static void main (String[] args) {
		String str;
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter a string: ");
		str=input.nextLine();
		str=null;

		try {
			System.out.println ("string length: "+str.length());
		}
		catch (Exception e) {
			System.out.println ("Null pointer Exception found !!!");
		}
	}
}
