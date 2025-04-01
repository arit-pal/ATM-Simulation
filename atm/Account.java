package atm;

public class Account {
    private double balance;
    private String accountType;

    public Account(double firstBalance, String accountType) {
        this.balance = firstBalance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        if(amount>0) {
            balance = balance + amount;
            System.out.println(amount + " deposited into " + accountType + " account successfully");
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }

    public boolean withdraw(double amount) {
        if(amount>0 && amount<=balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn from " + accountType + " account successfully");
            return true;
        }
        else {
            System.out.println("Insufficient balance or invalid amount");
            return false;
        }
    }

    public boolean transfer(Account targetAccount, double amount) {
        if(amount>0 && amount<=balance) {
            balance = balance - amount;
            targetAccount.balance = targetAccount.balance + amount;
            System.out.println(amount + " transferred successfully into " + targetAccount.accountType + " account");
            return true;
        }
        else {
            System.out.println("Transfer failed. Insufficient balance or invalid amount");
            return false;
        }
    }

    public void displayBalance() {
        System.out.println(accountType + " account balance: " + balance);
    }
}