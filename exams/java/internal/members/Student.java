import java.util.Scanner;

public class Student extends Member{
	double[] marks = new double[5];
	double totalMark=0;
	double averageMark=0;

	void readMarks(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Marks:");
		for(int i = 0; i< 5; i++){
			marks[i] = input.nextInt();
		}
	}
	void total(){
		for(int i = 0; i<5; i++)
			totalMark += marks[i];
	}

	void average(){
		averageMark = totalMark/5;
	}
	
	void display(){
		System.out.println("Mark Details");
		//System.out.println("*---------------------------------*");
		System.out.print("\tMarks: ");
		for(int i = 0 ; i< 5; i++)
			System.out.print(marks[i]+"\t");
		System.out.println("\nTotal Marks: "+ totalMark);
		System.out.println("Average Marks: "+ averageMark);
		System.out.println("*---------------------------------*");

	}

}
