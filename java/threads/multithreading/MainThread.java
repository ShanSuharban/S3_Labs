import java.util.Scanner;
public class MainThread
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Prime number check
        System.out.println("Enter a number for prime calculation: ");
        int num = input.nextInt();
        PrimeThread pt = new PrimeThread(num);

        // Fibonacci series
        System.out.println("Enter count for Fibonacci series: ");
        int fibcount = input.nextInt();
        FibThread ft = new FibThread(fibcount);

        // Factorial calculation
        System.out.println("Enter a no: for factorial calculation: ");
        int factnum = input.nextInt();
        FactThread fact = new FactThread(factnum);

        // Start threads
        pt.start();
        ft.start();
        fact.start();

        // Wait for threads to finish
        try {
            pt.join();
            ft.join();
            fact.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       // System.out.println("All calculations are done.");
        //input.close();
    }
}
