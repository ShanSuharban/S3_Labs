import java.util.Scanner;
public class Fibonacci {
	public static void main (String [] args) {
		int f=0, s=1,t,n,i;
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter number: ");
		n=input.nextInt ();
		System.out.println ();		
		
		for (i=1; i<=n; i++) {
			t=f+s;	
			System.out.println (f+"\t");
			f=s;
			s=t;
		
		}

	}

}
