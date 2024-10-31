import java.util.Scanner;
import java.io.*;
public class NPointerException {
	public static void main (String[] args) {
		String str=null;
		Scanner input = new Scanner (System.in);

		  


		try {
			System.out.println ("string length: "+str.length());
		}
		catch (Exception e) {
			System.out.println ("snull pointer exception");
		}
	}
}
