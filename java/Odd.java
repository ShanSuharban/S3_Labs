import java.util.Scanner;
public class Odd {
	public static void main (String[] args) {
		int n;
		Scanner input = new Scanner (System.in);
		System.out.println("\nEnter number: ");
		n = input.nextInt();
		
		if (n%2==0)
			System.out.println("\nNumber "+n+" is even");
		else
			System.out.println("\nNumber "+n+" is odd");
}
}

