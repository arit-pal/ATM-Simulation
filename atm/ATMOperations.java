package atm;

import java.util.Scanner;

public class ATMOperations implements ATMInterface {
    private Account savingsAccount;
    private Account salaryAccount;
    Scanner sc = new Scanner(System.in);

    public ATMOperations(Account savings, Account salary) {
        this.savingsAccount = savings;
        this.salaryAccount = salary;
    }

    @Override
    public void checkBalance() {
        System.out.print("Choose account(1: Savings, 2: Salary): ");
        int choice = sc.nextInt();
        if(choice==1) {
            savingsAccount.displayBalance();
        }
        else if(choice==2) {
            salaryAccount.displayBalance();
        }
        else {
            System.out.println("Invalid choice");
        }
    }

    @Override
    public void depositMoney() {
        System.out.print("Choose account(1: Savings, 2: Salary): ");
        int choice = sc.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        if(choice==1) {
            savingsAccount.deposit(amount);
        }
        else if(choice==2) {
            salaryAccount.deposit(amount);
        }
        else {
            System.out.println("Invalid choice");
        }
    }

    @Override
    public void withdrawMoney() {
        System.out.print("Choose account(1: Savings, 2: Salary): ");
        int choice = sc.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if(choice==1) {
            savingsAccount.withdraw(amount);
        }
        else if(choice==2) {
            salaryAccount.withdraw(amount);
        }
        else {
            System.out.println("Invalid choice");
        }
    }

    @Override
    public void transferMoney() {
        System.out.print("Transfer from(1: Savings to salary, 2: Salary to savings): ");
        int choice = sc.nextInt();
        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();
        if(choice==1) {
            savingsAccount.transfer(salaryAccount, amount);
        }
        else if(choice==2) {
            salaryAccount.transfer(savingsAccount, amount);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}