import java.util.Scanner;
public class Sumr {
	public static void main (String[] args) {
		int num1,num2,sum;
		Scanner input = new Scanner (System.in);
		System.out.println("\nEnter number 1: ");
		num1=input.nextInt();
                System.out.println("Enter number 2: ");
		num2=input.nextInt();

		sum=num1+num2;
		System.out.println("\nSum: "+sum);

		
}
}
