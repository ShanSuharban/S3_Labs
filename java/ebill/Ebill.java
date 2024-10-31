class Ebill
{
	String consumername,type;
	int consumerno;
	double pmr,cmr,unitconsumed,amount=0;
	Ebill(String consumername, int consumerno,double pmr,double cmr,String type)
	{
		this.consumername = consumername;
		this.consumerno = consumerno;
		this.pmr = pmr;
		this.cmr = cmr;
		this.type = type;
	}
	void  Calculate(double pmr,double cmr,String type)
	{
		unitconsumed = cmr-pmr;
		if(unitconsumed > 0)
		{
			if(type.equals("domestic"))
			{
				if(unitconsumed<=100)
				{
					amount =unitconsumed * 1;
				}
				else if(unitconsumed<=200)
				{
					amount =(100 * 1) + (unitconsumed-100) * 2.50;
				}
				else if(unitconsumed<=500)
				{
					amount =(100 * 1) + (100 * 2.50) + (unitconsumed-200) * 4;
				}
				else
				{
					amount =(100 * 1) + (100 * 2.50) + (300 * 4) + (unitconsumed-500) * 6;
				}
			}
			else if(type.equals("commercial"))
			{
				if(unitconsumed<=100)
                                {
                                        amount =unitconsumed * 2;
                                }
                                else if(unitconsumed<=200)
                                {
                                        amount =(100 * 2) + (unitconsumed-100) * 4.50;
                                }
                                else if(unitconsumed<=500)
                                {
                                        amount =(100 * 2) + (100 * 4.50) + (unitconsumed-200) * 6;
                                }
                                else
                                {
                                        amount =(100 * 2) + (100 * 4.50) + (300 * 6) + (unitconsumed-500) * 7;
                                }
			}
		}
	}
	void Display()
	{
		System.out.println("-----------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("CONSUMER NAME: " +consumername);
		System.out.println("CONSUMER NO: " +consumerno);
		System.out.println("-----------------------------------------");
		System.out.println("TYPE OF THE CONNECTION IS : "+type);
		System.out.println("CONSUMER "+consumername+" CONSUMED "+unitconsumed+"UNITS");
		System.out.println("AMOUNT: "+amount);
		System.out.println("-----------------------------------------");
		System.out.println(""+consumername+"CONSUMER NO "+consumerno+"TOTAL AMOUNT YOU HAVE TO PAY IS "+amount);
		System.out.println("Thank You :) ");
	}

}

