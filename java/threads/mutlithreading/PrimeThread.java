public class PrimeThread extends Thread{
	private int number;
	public PrimeThread (int number)
	{
		this.number=number;
	}
	boolean prime(int number){
		
		for(int i = 2; i<= number/2; i++){
			if(number%i == 0){
				return false;
			}
		}
		return true;
	}
	
	public void run(){
		int count =1,i = 2;
		while(count != number+1){
			boolean result = prime(i);
			
			if(result == true){
				System.out.println(count+" Prime "+ "= " + i);
				count++;
			}
			i++;
		}
		try 
		{
			Thread.sleep(50);
		} catch (Exception e ) { System.out.println ("Exeption : "+e);}
	}
}
