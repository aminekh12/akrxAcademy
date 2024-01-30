package day2.pool;

public class BankAccount {
        private String accountName;
        private int accountNumber;
        private double balance;
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

        public BankAccount() {
        }

        public BankAccount(String accountName, int accountNumber, double balance, int pin) {
            this.accountName = accountName;
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.pin = pin;
        }
    }


