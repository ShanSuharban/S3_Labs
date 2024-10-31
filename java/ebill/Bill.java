import java.util.Scanner;
class Bill
{
	public static void main(String[] args)
	{
		String name,type;
		double pmr,cmr,amount,unitconsumed;
		int consumerno;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Consumer name ");
		name = input.nextLine();
		System.out.println("Enter consumer no ");
		consumerno = input.nextInt();
		System.out.println("Enter previous month reading ");
		pmr = input.nextDouble();
		System.out.println("Enter current month reading ");
		cmr = input.nextDouble();
		System.out.println("Enter the type Domestic/Commercial ");
		type = input.nextLine();
		//System.out.println("Test");
		Ebill e = new Ebill(name,consumerno,pmr,cmr,type);
		e.Calculate(pmr,cmr,type);
		e.Display();
	}
}
