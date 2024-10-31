import java.util.Scanner;
class Cons
{

	string name,age,rollno; double phno;

	Cons (string name, int age) {
		this.name=name;
		this.age=age;
			
	 }
	 Cons (int rollno, double phno)
	 {
		this.rollno=rollno;
		this.phno=phno;
	 }

	void display () {
		System.out.println ("Name: "+name);
		System.out.println ("Age: "+age);
	}
	void display () {
		System.out.println ("Roll no: "+rollno);
		System.out.println ("Phone no: "+phno);
	}
	


}
public class Con {
	public static void main (String [] args)
	{
		int age,rno; double ph;
		string n;
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

		Cons b = new Cons (n,age);
		b.display();
		Cons c = new Cons (rno,ph);
		c.display ();
	}
} 
