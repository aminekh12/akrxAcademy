package day7.challenge2;

public class TransactionManager {
    public static void main(String[] args) {

        BankAccount bankAccountChecking= new CheckingAccount("amine",2020,3400,20);
        BankAccount bankAccountSaving= new CheckingAccount("rabie",3030,200,20);


        System.out.println("======== Saving account ====== ");
        System.out.println("balance in the saving account : "+bankAccountSaving.getBalance());
        bankAccountSaving.withdraw(200);
        bankAccountSaving.deposit(1000);
        bankAccountSaving.deposit(100);
        System.out.println("balance in the saving account : "+bankAccountSaving.getBalance());
        bankAccountSaving.showTransactionHistory();

        System.out.println("======== Checking account ====== ");


        System.out.println("balance in the checking account : "+bankAccountChecking.getBalance());
        bankAccountChecking.withdraw(200);
        bankAccountChecking.deposit(1000);
        bankAccountChecking.deposit(100);
        System.out.println("balance in the checking account : "+bankAccountChecking.getBalance());

        bankAccountChecking.showTransactionHistory();





    }
}
