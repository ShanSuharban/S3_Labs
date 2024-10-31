import java.util.Scanner;
class Constructor
{

	String name; int age,rollno; double phno;

	Constructor (String name, int age) {
		this.name=name;
		this.age=age;
			
	 }
	 Constructor (int rollno, double phno)
	 {
		this.rollno=rollno;
		this.phno=phno;
	 }

	void display () {
		System.out.println ("Name: "+name);
		System.out.println ("Age: "+age);
	}
	void show () {
		System.out.println ("Roll no: "+rollno);
		System.out.println ("Phone no: "+phno);
	}
	


}
public class Con {
	public static void main (String [] args)
	{
		int age,rno; double ph;
		String n;
		Scanner input = new Scanner (System.in);

		//Constructor c = new Constructor ();
		System.out.println ("Enter name: ");
		n=input.nextLine();
		System.out.println ("Enter age: ");
		age=input.nextInt();
		System.out.println ("Enter roll no: ");
		rno=input.nextInt();
		System.out.println ("Enter phone number: ");
		ph=input.nextDouble();

		Constructor b = new Constructor (n,age);
		b.display();
		Constructor c = new Constructor (rno,ph);
		c.show ();
	}
} 
