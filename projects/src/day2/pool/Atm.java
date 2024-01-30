package day2.pool;

import java.util.Scanner;

public class Atm {
    private final BankAccount bankAccount;
    private int tentative;
    public int getTentative() {
        return tentative;
    }
    public void setTentative(int tentative) {
        this.tentative = tentative;
    }
    public Atm(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.tentative = 3;
    }
    public void deposit(double amount){
        this.bankAccount.setBalance(this.bankAccount.getBalance()+amount);
    }
    public void withdraw(double amount){
        if( this.bankAccount.getBalance()<amount)
        {
            System.out.println("balance insufficient");
        }
        else {
            this.bankAccount.setBalance(this.bankAccount.getBalance()-amount);
        }
    }
    Scanner scan = new Scanner(System.in);
    public boolean login(){
        if(tentative==0){
            return false;
        }
        int accPin =0;
        int accNumber=0;
        try {
            System.out.println("Enter you account number");
             accNumber = scan.nextInt();
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid account number.");
            scan.nextLine();
            return login();
        }
        try {
            System.out.println("Enter you pin please");
             accPin = scan.nextInt();
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid pin.");
            scan.nextLine();
            return login();
        }
        if(!(this.bankAccount.getAccountNumber()==accNumber && this.bankAccount.getPin()==accPin))
        {
            tentative--;
            System.out.println("Wrong account number or pin , you have only "+tentative+" left");
            return this.login();
        }
        return true;
    }
    public void displayOptions(){

        if(!login()){
            System.out.println("Unsuccessful login");
            return;
        }
        boolean exitFlag = false;
        while(!exitFlag){
            System.out.println("Welcome " + this.bankAccount.getAccountName());
            System.out.println("choose an action");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Check balance");
            System.out.println("4 - Exit");
            int selection = scan.nextInt();
            switch (selection){
                case 1:
                    System.out.println("Enter the amount you want to deposit :");
                    this.deposit(scan.nextDouble());
                    System.out.println("deposit successfully");
                    System.out.println("balance : " +this.bankAccount.getBalance());
                    break;
                case 2 :
                    System.out.println("Enter the amount you want to withdraw :");
                    this.withdraw(scan.nextDouble());
                    System.out.println("Withdraw successfully");
                    System.out.println("balance : " +this.bankAccount.getBalance());
                    break;
                case 3 :
                    System.out.println("your balance is : "+ this.bankAccount.getBalance());
                    break;
                case 4 :
                    System.out.println("Exiting...");
                    exitFlag=true;
                    break;
                default:
                    System.out.println("not a selection option");
            }
        }

    }

}
