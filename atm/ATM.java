package atm;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account savingsAccount = new Account(2000, "Savings");
        Account salaryAccount = new Account(5000, "Salary");
        ATMOperations atmOperations = new ATMOperations(savingsAccount, salaryAccount);
        int choice;
        do {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. EXIT");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    atmOperations.checkBalance();
                    break;
                case 2:
                    atmOperations.depositMoney();
                    break;
                case 3:
                    atmOperations.withdrawMoney();
                    break;
                case 4:
                    atmOperations.transferMoney();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice!=5);
    }
}