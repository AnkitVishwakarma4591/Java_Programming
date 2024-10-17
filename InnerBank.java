// Base class Bank
class Bank {
    String bankName;

    public Bank(String name) {
        this.bankName = name;
    }
    public void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

// Child class SBI inheriting from Bank
class SBI extends Bank {
    public SBI() {
        super("State Bank of India (SBI)");
    }

}

// Child class AuBank inheriting from Bank
class AuBank extends Bank {
    public AuBank() {
        super("AU Small Finance Bank");
    }

}

// Child class Axis inheriting from Bank
class Axis extends Bank {
    public Axis() {
        super("Axis Bank");
    }

}

// Main class to test the implementation
public class InnerBank {
    public static void main(String[] args){
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