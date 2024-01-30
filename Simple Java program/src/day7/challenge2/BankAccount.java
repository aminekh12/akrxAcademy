package day7.challenge2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class BankAccount implements Transactable{
    private String accountName;
    private int accountNumber;
    private double balance;
    private List<String> transactionHistory=new ArrayList<>();
    private int pin;
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getPin() {
        return pin;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public BankAccount() {
    }

    public BankAccount(String accountName, int accountNumber, double balance, int pin) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    @Override
    public void deposit(int amount) {
        this.setBalance(this.getBalance()+amount);
        this.addTransactionToHistory("DEPOSIT OF "+ amount+" ON "+new Date());
    }

    @Override
    public void withdraw(int amount) {
        if( this.getBalance()<amount)
        {
            System.out.println("insufficient balance");
        }
        else {
            this.setBalance(this.getBalance()-amount);
            this.addTransactionToHistory("WITHDRAW OF "+ amount+" ON "+new Date());
        }
    }

    @Override
    public void addTransactionToHistory(String transaction) {
        this.getTransactionHistory().add(transaction);
    }

    @Override
    public void showTransactionHistory() {
        System.out.println(this.getTransactionHistory());
    }
}
