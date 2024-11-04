import java.lang.Thread;
import java.util.Scanner;

class PrimeThread extends Thread {
    private int number;

    public PrimeThread(int number) {
        this.number = number;
    }

    
    public void run() {
        int flag = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Number " + number + " is not prime");
                flag++;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Number " + number + " is a prime number");
        }
	System.out.println ();
    }
}

class FibonacciThread extends Thread {
    private int count;

    public FibonacciThread(int count) {
        this.count = count;
    }

    
    public void run() {
        int f = 0, s = 1, t;
        System.out.println("Fibonacci series up to " + count + ":");
        for (int i = 1; i <= count; i++) {
            System.out.print(f + "\t");
            t = f + s;
            f = s;
            s = t;
        }
        System.out.println();
    }
}

class FactorialThread extends Thread {
    private int number;

    public FactorialThread(int number) {
        this.number = number;
    }

    
    public void run() {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + ": " + fact);
	System.out.println ();
    }
	
	
}

public class MultiThreadCalc
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
        FibonacciThread ft = new FibonacciThread(fibcount);

        // Factorial calculation
        System.out.println("Enter a no: for factorial calculation: ");
        int factnum = input.nextInt();
        FactorialThread fact = new FactorialThread(factnum);

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

        System.out.println("All calculations are done.");
        input.close();
    }
}
