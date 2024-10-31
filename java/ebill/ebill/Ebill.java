import java.util.Scanner;
class Bill {
	
	String cname;
	int ctype;
	int cno;
	double pmr,cmr,unitconsumed,amount=0;
	
	Bill (String cname, int ctype, int cno, double pmr, double cmr)
	{
		this.cname=cname;
		this.ctype=ctype;
		this.cno=cno;
		this.pmr=pmr;
		this.cmr=cmr;
		this.unitconsumed=unitconsumed;
		
	}
	
	void Calculate () {
		unitconsumed=cmr-pmr;
		if (unitconsumed>0)
		{
			if (ctype==1) 
			{
				if (unitconsumed<=100){
					amount=(100*1);
				}
				else if (unitconsumed<=200) {
					amount=(100*1)+(unitconsumed-100)*2.50;
				}
				else if (unitconsumed<=500) {
					amount=(100*1)+(100*2.50)+(unitconsumed-200)*4;
				}
				else 
					amount=(100*1)+(100*2.50)+(300*4)+(unitconsumed-500)*6;
			}

			else if (ctype==2)
			{
				if (unitconsumed<=100)
					amount=unitconsumed*2;
				else if (unitconsumed<=200)
					amount=(100*2) +(unitconsumed-100)*4.50;
				else if (unitconsumed<=500)
					amount=(100*2)+(100*4.50)+(unitconsumed-200)*6;
				else 
					amount=(100*2)+(100*4.50)+(300*6)+(unitconsumed-500)*7;
			}

		}
			
	}
	
	void display () {
		System.out.println ("-----------------------------------------------------");
		System.out.println ("-----------------------------------------------------");
		System.out.println ("CONSUMER NAME: "+cname);
		System.out.println ("CONSUMER NO: "+cno);
		System.out.println ("--------------------------------------------------------");
		System.out.println ("TYPE OF CONNECTION: "+ctype);
		System.out.println ("CONSUMER "+cname+" CONSUMED "+unitconsumed+" UNITS ");
		System.out.println ("TOTAL AMOUNT: "+amount+"Rs");
		System.out.println ("----------------------------------------------------------");
		System.out.println ("CONSUMER NAME: "+cname+": "+"CONSUMER NO: "+cno);
		System.out.println ("TOTAL AMOUNT YOU HAVE TO PAY IS : "+amount);
		System.out.println ("THANK YOU :) ");

	} 

}

public class Ebill {
	public static void main (String[] args) {
	String name; int ctype;
        int consumerno;
        double pmr,cmr,unitconsumed;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Consumer name ");
	name = input.nextLine();
	System.out.println("Enter consumer no ");
	consumerno = input.nextInt();
	System.out.println("Enter previous month reading ");
	pmr = input.nextDouble();
	System.out.println("Enter current month reading ");
	cmr = input.nextDouble();
	System.out.println("Enter the type Domestic/Commercial ");
	ctype = input.nextInt();
		//System.out.println("Test");
	Bill e = new Bill(name,ctype,consumerno,pmr,cmr);
	e.Calculate();
	e.display();
	}
}
