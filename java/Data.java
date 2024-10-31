import java.util.Scanner;
class Student {
	String name;
	int age,rollno;
	double m1,m2,m3,avg;
	
	void setData (String name, int age, int rollno, double m1, double m2, double m3) {
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}

	void Calculate () {
		avg=((m1+m2+m3)/3);
	}

	void Display () {
		System.out.println ("Name: "+name);
		System.out.println ("Age: "+age);
		System.out.println ("Roll no: "+rollno);
		System.out.println ("Average mark: "+avg);
	}
}

public class Data {
	public static void main (String [] args ) {
		String nm;
		int age,rno;
		double m1,m2,m3;
		int n,i;
		Scanner ip = new Scanner (System.in);
		System.out.println ("Enter the no: of students: ");
		n=ip.nextInt();
		Student []s = new Student [n];

		for (i=0;i<n;i++) {
			Scanner input = new Scanner (System.in);
			
			s[i]=new Student ();
			System.out.println ("Enter the name of student "+(i+1)+": ");
			nm=input.nextLine();
		        System.out.println ("Enter the age of student "+(i+1)+": ");
			age=input.nextInt();
			System.out.println ("Enter the roll no: of student "+i+": ");
			rno=input.nextInt();
			System.out.println ("Enter the 3 marks of student "+(i+1)+": ");
			m1=input.nextDouble();
			m2=input.nextDouble();
			m3=input.nextDouble();
			
			s[i].setData (nm,age,rno,m1,m2,m3);
			s[i].Calculate();
			s[i].Display ();


		}
	}
}
