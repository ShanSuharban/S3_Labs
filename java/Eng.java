import java.util.Scanner;
class Employee {

	
	String name,address;
	int age,phno;
	double salary,basicpay=1000;

	    void display () {
		System.out.println ();
                System.out.println ("Name: "+name);
                System.out.println ("Age: "+age);
		System.out.println ("Phone no: "+phno);
		System.out.println ("Address: "+address);
                System.out.println ("Total Salary: "+salary);
        }

}
class Engineer extends Employee {
	double addpay=2000;
	double  hra=1500;
	void calcSalary () {
		super.salary=basicpay+hra+addpay;
	}

	/*void display () {
		System.out.println ("Name: "+name);
		System.out.println ("Age: "+age);
		System.out.println ("Total Salary: "+super.salary);
	}*/
}

public class Eng {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		Engineer eg = new Engineer ();		

		System.out.println ("Enter name: ");
		eg.name=input.nextLine();
		System.out.println ("Enter age: ");
		eg.age=input.nextInt();
		System.out.println ("Enter phone no: ");
		eg.phno=input.nextInt();
		input.nextLine();
		System.out.println ("Enter address: ");
		eg.address=input.nextLine();
		
		
		eg.calcSalary(); //enginner class
		eg.display(); 	//employee class
	}
}
