// Create a custom exception class and demonstrate its usage.

import java.util.*;

// Custom exception class
class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    // Constructor with an initial balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InvalidTransactionException("Insufficient funds.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = null;

        // Start with an initial balance of 1000
        BankAccount account = new BankAccount(1000);

        try {
            scanner = new Scanner(System.in);

            // Deposit operation
            System.out.println("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            // Withdrawal operation
            System.out.println("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);

            // Display balance
            System.out.println("Final balance: " + account.getBalance());

        } catch (InvalidTransactionException e) {
            // Handle custom exception
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle any unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Ensure scanner is closed
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("Resources released.");
        }
    }
}
