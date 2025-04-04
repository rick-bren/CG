class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name         : " + bankName);
            System.out.println("Account Holder    : " + this.accountHolderName);
            System.out.println("Account Number    : " + this.accountNumber);
            System.out.println("Current Balance   : ₹" + this.balance);
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }

    public static void setBankName(String name) {
        bankName = name;
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", "BA001", 10000);
        BankAccount acc2 = new BankAccount("Bob", "BA002", 20000);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();
        System.out.println();

        BankAccount.getTotalAccounts();
    }
}
