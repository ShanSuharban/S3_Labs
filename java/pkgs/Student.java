package mypkg;
public class Student {
	String name,id;
	int rno,age;
	double m1,m2,m3,avg;
	
	public Student (String name, String id, int rno, int age, double m1, double m2, double m3) {
		this.name=name;
		this.id=id;
		this.rno=rno;
		this.age=age;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}

	public void Calculate () {
		avg=(m1+m2+m3)/3;
	}

	public void display () {
		System.out.println ("\nName: "+name);
		System.out.println ("Id: "+id);
		System.out.println ("Roll Number: "+rno);
		System.out.println ("Age: "+age);
		System.out.println ("Average Mark: "+avg);
	}
	

} 

