import java.util.Scanner;
public class Factorial {
	public static void main (String [] args) {
		int fact=1,n,i;
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter a number: ");
		n=input.nextInt ();
		
		for (i=1;i<=n;i++) {
			fact=fact*i;
		} 	
		System.out.println ("Factorial of "+ n +": "+ fact);	

	}


}
