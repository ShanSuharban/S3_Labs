import java.util.Scanner;
class Employee {
		Scanner input = new Scanner (System.in);		

		String name,address;
	        int age,rno ; double phno;
		double salary=1000;

		 /* Employee (String name, int age , int phno, String address) {
                	this.name=name;
			this.age=age;        
			this.phno=phno;
			this.address=address;
                  } */



		void printSalary () {
			System.out.println ("Salary of employee: "+salary);
		}

		void display () {
			System.out.println ("Name of employee: "+name);
			System.out.println ("Age: "+age);
			System.out.println ("phone number: "+phno);
			System.out.println ("Address: "+address);
		}
}

class Officer extends Employee {
		double specialisation;
}

class Manager extends Employee {
		double department;
}

public class Inher {
		public static void main (String[] args ) {
			
			Scanner input = new Scanner (System.in);
			String name,address;
			int age; double phno;
			double salary;			
			
			Officer o = new Officer ();
			System.out.println ("Enter the name of officer: ");
			o.name=input.nextLine();
			System.out.println ("Enter age: ");
			o.age=input.nextInt();
			System.out.println ("Enter phone number: ");
			o.phno=input.nextDouble();
			System.out.println ("Enter the Address: ");
			o.address=input.next();
			
						

			//Employee e = new Employee (name,age,phno,address);
			Scanner ip = new Scanner (System.in);
			Manager m = new Manager ();
			System.out.println ("Enter the name of Manager: ");
                        m.name=ip.nextLine();
                        System.out.println ("Enter age: ");
                        m.age=ip.nextInt();
                        System.out.println ("Enter phone number: ");
                        m.phno=ip.nextDouble();
                        System.out.println ("Enter the Address: ");
                        m.address=ip.next();

			//Employee f = new Employee (name,age,phno,address);
			
			System.out.println ("\nEnter the salary of Officer: ");
			o.specialisation=ip.nextDouble();
			System.out.println ("Enter the salary of Manager: ");
			m.department=ip.nextDouble();
			o.salary=o.salary+o.specialisation;
			m.salary=m.salary+m.department;
			
			o.display();
			m.display();			

			o.printSalary();
			m.printSalary();

		
		}


}
