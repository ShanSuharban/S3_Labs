import java.util.Scanner;
public class Pos {
	public static void main (String[] args) {
		int n;
		Scanner input = new Scanner (System.in);
	        System.out.println("\nEnter number: ");
		n=input.nextInt();
		
		if (n>0)
	       		System.out.println("\nNumber "+n+" is positive");
		else if (n<0)
			System.out.println("\nNumber "+n+" is negative");
		else
			System.out.println ("\nNumber "+n+" is zero");


}
}
