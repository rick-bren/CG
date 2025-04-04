package Inheritance;

class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayBasicInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type  : Savings Account");
        displayBasicInfo();
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private int withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type     : Checking Account");
        displayBasicInfo();
        System.out.println("Withdrawal Limit : " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int maturityPeriod;

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type    : Fixed Deposit Account");
        displayBasicInfo();
        System.out.println("Maturity Period : " + maturityPeriod + " months");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA1001", 5000.0, 4.5);
        CheckingAccount checking = new CheckingAccount("CA2001", 3000.0, 5);
        FixedDepositAccount fixed = new FixedDepositAccount("FD3001", 10000.0, 12);

        savings.displayAccountType();
        System.out.println();
        checking.displayAccountType();
        System.out.println();
        fixed.displayAccountType();
    }
}
