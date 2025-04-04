class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance       : ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance       : ₹" + getBalance());
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1234567890", "Alice", 50000);
        System.out.println("--- Account 1 Details ---");
        account1.displayAccountDetails();

        SavingsAccount savingsAccount1 = new SavingsAccount("9876543210", "Bob", 30000);
        System.out.println("\n--- Savings Account 1 Details ---");
        savingsAccount1.displaySavingsAccountDetails();

        savingsAccount1.setBalance(35000);
        System.out.println("\nUpdated Balance for Savings Account 1: ₹" + savingsAccount1.getBalance());
    }
}
