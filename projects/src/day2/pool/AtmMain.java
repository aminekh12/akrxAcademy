package day2.pool;

public class AtmMain {
    public static void main(String[] args) {
        Atm atm = new Atm(new BankAccount("Khatmi",123,7000,1));
        atm.displayOptions();
    }
}
