public class Employee extends  Member{
	double basicPay;
	double hra;
	double da;
	double totalSalary;

	void setBasicPay(double basicPay){
		this.basicPay = basicPay;
	}

	void calculate(){
		hra = basicPay*0.1;
		da = basicPay*0.2;
		totalSalary = basicPay+ hra+ da;
	}

	void display(){
		//System.out.println("*---------------------------------*");
		System.out.println("Salary Details");
		System.out.println("\tBasic Pay:" + basicPay);
		System.out.println("\tHRA:"+ hra);
		System.out.println("\tDA:"+ da);
		System.out.println("Total Salary: "+ totalSalary);
		System.out.println("*---------------------------------*");
	}

}
