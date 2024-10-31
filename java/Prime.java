import java.util.Scanner;
public class Prime {
	public static void main (String [] args) {
		int n,i,flag=0;
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter a number: ");
		n=input.nextInt ();
		for (i=2; i<=n/2; i++) {
			if (n%i==0) {
				System.out.println ("Number "+n+" is not prime ");
				flag++;
				break;
			}
		}

		if (flag==0)
			System.out.println ("Number "+n+" is a prime number ");

		
		
	}


}
