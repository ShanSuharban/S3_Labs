class FactThread extends Thread {
    private int number;

    public FactThread(int number) {
        this.number = number;
    }
    public int factorial (int n)
    {
	if (n<=0)
		return 1;
	else
	{
		int fact=1;
		for (int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
    }
    
    public void run() {
        for (int i = 1; i <= number; i++) {
		int fact=factorial(i);
        	System.out.println ("Factorial of "+i+": "+fact);
		
        }
	try
	 {
              Thread.sleep(50);
         } catch (Exception e ) { System.out.println ("Exeption : "+e);}

        System.out.println ();
    }
	
	
}
