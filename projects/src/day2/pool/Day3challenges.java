package day2.pool;

import java.time.Year;
import java.util.Scanner;

public class Day3challenges {
    public static void main(String[] args) {

        // basics
            // Challenge 1: Even or Odd?
                /*int userNumber = 12;
                if(userNumber % 2== 0){
                    System.out.println(userNumber+" is an even number");
                }
                else {
                    System.out.println(userNumber+" is an odd number");
                }*/
            // Challenge 2: Concatenation
                /*String firstName= "Amine";
                String lastName = "Khatmi";
                System.out.println("Name : "+ firstName + " "+lastName );*/
            // Challenge 3: Temperature Conversion
                /*double celsiusTemperature = 26;
                double F = (celsiusTemperature * 9/5) + 32;
                System.out.println(F);*/

        // Advanced
            // Challenge 1: Positive or Negative
                /*Scanner scan = new Scanner(System.in);
                int number;
                do {
                    System.out.println("enter a positive number : ");
                    number= scan.nextInt();
                }while(number<0);*/
            // Challenge 2: Weekday Name
                /*Scanner scan = new Scanner(System.in);
                int weekNumber = scan.nextInt();
                switch (weekNumber){
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("error");
                }*/
            // Challenge 3: Multiplication Table with While Loop
                /*Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                int n = 1;
                do{
                    System.out.println(number * n);
                    n++;
                } while (n!=10);*/


            // Challenge 4: Factorial day2.pool.Calculator with For Loop
                /*System.out.println("Print a positive number");
                Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                int factorial = 1;
                for(int i= 1;i<=number;i++){
                    factorial *=i;
                }
                System.out.println("factorial : "+factorial);*/
            // Challenge 5: Guess the Number with Do-While Loop

                /*Scanner scan = new Scanner(System.in);
                int randomNumber = (int)(Math.random()*10);
                int number;
                do {
                    System.out.println("Guess the number");
                    number = scan.nextInt();
                    if(number<randomNumber){
                        System.out.println("Greater");
                    }
                    else if (number>randomNumber){
                        System.out.println("Lower");
                    }
                    else {
                        System.out.println("Congrats you got it right");
                    }
                }while(randomNumber != number);*/

            // Challenge 6: Odd or Even with For Loop
                /*for(int i =1; i<=10;i++)
                {
                    if(i % 2==0){
                        System.out.println("even number");
                    }
                    else {
                        System.out.println("odd number");
                    }
                }*/
            // Challenge 7: Vowel or Consonant with Switch
                /*Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a character: ");
                char c = scanner.next().charAt(0);

                switch (c) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        System.out.println("The character is a vowel");
                        break;
                    default:
                        System.out.println("The character isn't a vowel");
                        break;
                }*/

            // Challenge 8: Sum of Squares with While Loop

                /*int n =1;
                double sum=0;
                while(n<=5){
                    sum += Math.pow(n,2);
                    n++;

                }
                System.out.println(sum);*/

            // Challenge 9: Leap Year Checker with If-Else

                /*Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a year: ");
                int year = scanner.nextInt();

                if (Year.of(year).isLeap()) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }*/

            // Challenge 10: Fibonacci Series with For Loop

                /*int n = 10;
                int firstNumber = 0, secondNumber = 1;
                for (int i = 1; i <= n; ++i) {
                    System.out.print(firstNumber + " ");

                    int next = firstNumber + secondNumber;
                    firstNumber = secondNumber;
                    secondNumber = next;
                }
*/

    }
}
