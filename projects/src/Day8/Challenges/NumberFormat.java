package Day8.Challenges;

import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Integer input = Integer.parseInt(scanner.next());
        }
        catch (NumberFormatException e){
            System.out.println("Message : " + e);
        }
    }
}
