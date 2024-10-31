import java.util.Scanner;
class Bill
{
        String name;
        int cons,pvr,prs,c,unit;
        double amt;


        int getData()
        {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter Consumer Name : ");
                name = input.nextLine();

                System.out.println("Enter Consumer No : ");
                cons = input.nextInt();

                System.out.println("Enter Previous Reading : ");
                pvr = input.nextInt();

                System.out.println("Enter Prsnt Reading : ");
                prs = input.nextInt();

                unit = prs - pvr;

                System.out.println(" Type of EB Connection");
                System.out.println(" Click 1 for Domestic and 2 for Commercial");
                c = input.nextInt();
                return c;
        }

        double CalcD()
        {
                if(unit<=100)
                {
                        amt = unit*1;
                        return amt;
                }
                else if(unit>100 && unit<=200)
                {
                        amt = 100 + ((unit-100)*2.5);
                        return amt;
                }
                else if(unit>200 && unit<500)
                {
                        amt = 350 + ((unit-200)*4);
                        return amt;
                }
                else
                {
                        amt = 750 + ((unit-300)*6);
                        return amt;
                }
        }

                double CalcC()
                {
                        if(unit<=100)
                        {
                                amt = unit*2;
                                return amt;
                        }
			 else if(unit>100 && unit<=200)
                        {
                                amt = 200 + ((unit-100)*4.5);
                                return amt;
                        }
                        else if(unit>200 && unit<500)
                        {
                                amt = 650 + ((unit-200)*6);
                                return amt;
                        }
                        else
                        {
                                amt = 1250 + ((unit-300)*6);
                                return amt;
                        }
                }

        void display(double amt)
        {
                System.out.println("The Electricity bill of Consumer No: " + name + "(" + cons + ") is " + amt);
        }
}

public class Elec
{
        public static void main(String[] args)
        {
		Scanner input = new Scanner(System.in);
                int c;
                double amt;
                Bill b = new Bill();
                c = b.getData();
                if(c==1)
                        amt = b.calcD();
                else if(c==2)
                        amt = b.calcC();
                else
                {
                        System.out.println(" Invalid EB Input");
                }
                b.display(amt);
        }
}



