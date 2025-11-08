import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.0); // initial balance

        try {
            System.out.println("Enter amount to deposit:");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);

            System.out.println("Enter amount to withdraw:");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);

            System.out.println("Final balance: " + account.getBalance());

        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed. Thank you!");
            sc.close();
        }
    }
}

