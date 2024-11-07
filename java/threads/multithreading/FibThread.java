class FibThread extends Thread {
    private int count;

    public FibThread(int count) {
        this.count = count;
    }

    
  	public  void run() {
        int f = 0, s = 1, t;
        System.out.println("Fibonacci series up to " + count + ":");
        for (int i = 1; i <= count; i++) {
            System.out.println("Fibinocii: "+f);
            t = f + s;
            f = s;
            s = t;
        }
	try 
        {
           Thread.sleep(50);
        } catch (Exception e ) { System.out.println ("Exeption : "+e);}

        System.out.println();
    }
}
