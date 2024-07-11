// Base class representing RBI guidelines
class RBI {
    // RBI defined constants
    protected static final double MIN_INTEREST_RATE = 4.0;
    protected static final double MIN_BALANCE = 1000.0;
    protected static final int MAX_WITHDRAWAL_LIMIT = 50000;

    // Method to get interest rate (to be overridden by derived classes)
    public double getInterestRate() {
        return MIN_INTEREST_RATE;
    }

    // Method to get minimum balance (can be overridden by derived classes)
    public double getMinimumBalance() {
        return MIN_BALANCE;
    }

    // Method to get maximum withdrawal limit (can be overridden by derived classes)
    public int getMaxWithdrawalLimit() {
        return MAX_WITHDRAWAL_LIMIT;
    }
}

// Abstract class representing a generic bank
abstract class Bank extends RBI {
    protected String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public abstract void displayBankDetails();
}

// Derived class representing SBI
class SBI extends Bank {
    public SBI() {
        super("SBI");
    }

    @Override
    public double getInterestRate() {
        return 5.0; // SBI specific interest rate
    }

    @Override
    public void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + getInterestRate() + "%");
        System.out.println("Minimum Balance: " + getMinimumBalance());
        System.out.println("Maximum Withdrawal Limit: " + getMaxWithdrawalLimit());
    }
}

// Derived class representing ICICI
class ICICI extends Bank {
    public ICICI() {
        super("ICICI");
    }

    @Override
    public double getInterestRate() {
        return 4.5; // ICICI specific interest rate
    }

    @Override
    public void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + getInterestRate() + "%");
        System.out.println("Minimum Balance: " + getMinimumBalance());
        System.out.println("Maximum Withdrawal Limit: " + getMaxWithdrawalLimit());
    }
}

// Derived class representing PNB
class PNB extends Bank {
    public PNB() {
        super("PNB");
    }

    @Override
    public double getInterestRate() {
        return 4.75; // PNB specific interest rate
    }

    @Override
    public void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + getInterestRate() + "%");
        System.out.println("Minimum Balance: " + getMinimumBalance());
        System.out.println("Maximum Withdrawal Limit: " + getMaxWithdrawalLimit());
    }
}

// Customer class
class Customer {
    private String name;
    private Bank bank;

    public Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        bank.displayBankDetails();
    }
}

// Main class to demonstrate dynamic polymorphism
public class BankDemo {
    public static void main(String[] args) {
        // Create different bank objects
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank pnb = new PNB();

        // Create customers associated with different banks
        Customer customer1 = new Customer("Ayush", sbi);
        Customer customer2 = new Customer("Devansh", icici);
        Customer customer3 = new Customer("Hari OM", pnb);

        // Display customer details along with bank details
        customer1.displayCustomerDetails();
        System.out.println();
        customer2.displayCustomerDetails();
        System.out.println();
        customer3.displayCustomerDetails();
    }
}
