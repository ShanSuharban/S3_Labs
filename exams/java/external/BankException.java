import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
class BankAccount {
    
    double balance = 1000;
    
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds: Cannot withdraw " + amount + ". Available balance is " + balance + ".");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
    }

}
public class BankException.java {
    public static void main (String[] args) {
        BankAccount b = new BankAccount();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw : ");
        int amount = input.nextInt();
        try {
            b.withdraw(amount); 
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
