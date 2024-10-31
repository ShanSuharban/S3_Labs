import java.util.Scanner;
public class Area {
	public static void main (String[] args) {
		int a,l,b;
		Scanner input = new Scanner (System.in);
	        System.out.println("\nEnter length: ");
		l=input.nextInt();
	        System.out.println("Enter breadth: ");
		b=input.nextInt();
		
		a = l*b;
		System.out.println("\nArea: "+a+"m^2");



}
}
