import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter no of Employees:");
		int n = input.nextInt();
		Employee E[] = new Employee[n];

		for(int i = 0; i< n ; i++){
			E[i] = new Employee();
			E[i].read();
			System.out.print("Enter Basic Pay:");
			double basicPay = input.nextInt();
			E[i].setBasicPay(basicPay);
			E[i].calculate();
		}

		System.out.print("Enter no of Students:");
                int m = input.nextInt();
                Student S[] = new Student[m];

		System.out.println("Enter student details:");
		for(int i = 0; i< m ; i++){
                        S[i] = new Student();
			S[i].read();
                        S[i].readMarks();
                       	S[i].total();
			S[i].average();

                }

		System.out.println("Display Employee Details:");
		for(int i = 0; i< n ; i++){
			System.out.println("");
			E[i].print();
                        E[i].display();
                }
                System.out.println("Display Student Details:");
                for(int i = 0; i< m ; i++){
			System.out.println("");
                        S[i].print();
                        S[i].display();
                }
	}
}

