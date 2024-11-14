import java.util.Scanner;

public class Member{
	String name;
	int age;
	String address;
	int phno;

	public void read(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name:");
		name = input.nextLine();
		System.out.print("Enter age:");
		age = input.nextInt();
		System.out.print("Enter address:");
		input.nextLine();
		address = input.nextLine();
		System.out.print("Enter Phone Number:");
		phno = input.nextInt();
	}

	public void print(){
		System.out.println("*---------------------------------*");
		System.out.println("\t Name: "+ name);
		System.out.println("\t Age: "+ age);
		System.out.println("\t Address: "+  address);
		System.out.println("\t Phone Number: " + phno);
		//System.out.println("*---------------------------------*");
	}
}
