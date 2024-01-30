package day7.challenge2;

import java.util.ArrayList;
import java.util.List;

public interface Transactable {


    void deposit(int amount);
    void withdraw(int amount);
    void addTransactionToHistory(String transaction);
    void showTransactionHistory();

}
