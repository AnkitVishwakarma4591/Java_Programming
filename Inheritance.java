// Base class Bank
class Bank {
    // Property of Bank class
    String bankName;

    // Constructor to initialize the bank name
    public Bank(String name) {
        this.bankName = name;
    }

    // Method to display the bank name
    public void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

// Child class SBI inheriting from Bank
class SBI extends Bank {
    // Constructor to initialize SBI bank
    public SBI() {
        super("State Bank of India (SBI)");
    }

    // Additional functionality for SBI can be added here
}

// Child class AuBank inheriting from Bank
class AuBank extends Bank {
    // Constructor to initialize Au Bank
    public AuBank() {
        super("AU Small Finance Bank");
    }

    // Additional functionality for AuBank can be added here
}

// Child class Axis inheriting from Bank
class Axis extends Bank {
    // Constructor to initialize Axis bank
    public Axis() {
        super("Axis Bank");
    }

    // Additional functionality for Axis can be added here
}

// Main class to test the implementation
public class Inheritance {
    public static void main(String[] args) {
        // Creating objects for each child class
        SBI sbi = new SBI();
        AuBank auBank = new AuBank();
        Axis axis = new Axis();

        // Displaying bank names using the child class objects
        sbi.displayBankName();
        auBank.displayBankName();
        axis.displayBankName();
    }
}

