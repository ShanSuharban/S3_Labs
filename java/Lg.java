import java.util.Scanner;
public class Lg {
	public static void main (String[] args) {
		int n1,n2,result;
		Scanner input = new Scanner (System.in);
	        System.out.println("\nEnter number 1: ");
		n1 = input.nextInt();
                System.out.println("Enter number 2: ");
		n2 = input.nextInt();

		//result = (n1>n2)?(System.out.println(n1+" is greater than "+n2)):(System.out.println(n2+"is greater than "+n1));
		System.out.println ((n1>n2)? (n1+" is greater than "+n2): (n2+" is greater than "+n1));
}
}
