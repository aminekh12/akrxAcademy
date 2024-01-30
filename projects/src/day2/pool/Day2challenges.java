package day2.pool;

public class Day2challenges {
    public static void main(String[] args) {
// DAY 1
        //System.out.println("Hello world!");

// DAY 2
    // Temperature Converter
        // Given temperature in Celsius
        /*
        double celsius = 30;

        // Convert Celsius to Fahrenheit

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);*/

    //BMI day2.pool.Calculator

        // Given weight and height
        /*
        double weight = 70; // in kilograms
        double height = 1.75; // in meters

        // Calculate BMI
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);*/

    // Challenge 1: Variable Declaration

        /*
        int age = 25;
        String firstName ="Amine";
        String lastName = "Khatmi";
        double pi = 3.14159;
        double raduis = 10;
        String favoriteSuperhero = "";
        String favoriteQuote = "Difficult roads often leads to beautiful destinations";*/

    // Challenge 2: Arithmetic Operations

        /*
        int num1 = 5;
        int num2 = 10;
        int result = num2-num1;
        int result2 = num2+num1;
        int result3 = num2*num1;
        double result4 = (double)num2/num1;*/

    // Challenge 1: Age Classifier
        /*
        int age = 20;
        if(age<0) System.out.println("error");
        else if(age<13) System.out.println("Child");
        else if(age> 13 && age <19) System.out.println("Teenager");
        else if(age>20) System.out.println("Adult");*/

    // Challenge 2: Grade day2.pool.Calculator
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        if(score>= 90 && score <=100) System.out.println("A");
        else if(score>= 80 && score <=89) {System.out.println("B");}
        else if(score>= 70 && score <=79) {System.out.println("C");}
        else if(score>= 60 && score <=69) {System.out.println("D");}
        else if(score>= 0 && score <=59) {System.out.println("F");}
        else System.out.println("error");*/

    // Challenge 3: Time of Day Greeting
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current hour: ");
        int hour = scanner.nextInt();

        if(hour>= 5 && hour <=11) System.out.println("Good morning");
        else if(hour>= 12 && hour <=17) {System.out.println("Good afternoon");}
        else if(hour>= 18 && hour <=23) {System.out.println("Good evening");}
        else{System.out.println("Good night");}*/

    // Challenge 4: Positive/Negative/Zero Checker

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(number== 0) System.out.println("Zero");
        else if(number< 0) System.out.println("Negative");
        else {System.out.println("Positive");}*/

    // Challenge 5: Vowel or Consonant Checker

       /*
       char character = 'u';
        switch (character) {
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

    // Challenge 6: BMI day2.pool.Calculator

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight: ");
        int weight = scanner.nextInt();
        System.out.print("Enter height : ");
        int height = scanner.nextInt();

        double BMI = (double)weight / (height * height);
        if(BMI<18.5) System.out.println("Under weight");
        else if(BMI>=18.5 && BMI <=24.9) System.out.println("Normal weight");
        else if(BMI>=25 && BMI <=29.9) System.out.println("Over weight");
        else if(BMI>=30) System.out.println("Obese");*/


    // Challenge 7: Days in a Month
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        switch (month) {
            case 2 :
                System.out.print("28");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11:
                System.out.print("30");
                break;
            default:
                System.out.print("31");
                break;
        }*/

    // Challenge 8: Number Comparison

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if(num1==num2) System.out.println("first number greater equals second number");
        else if(num1<num2) System.out.println("first number lesser than second number");
        else System.out.println("first number greater than second number");*/

    // Challenge 9: Ticket Price day2.pool.Calculator
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Do you have student ID: ");
        String student = scanner.next();

        if(age<=12) System.out.println("$5");
        else if (age >=13 && age <=17) System.out.println("$8");
        else if (age >=18 && student.equals("yes")) System.out.println("$10");
        else System.out.println("$15");*/

    // extra challenge
        int a =1 ;
        int b = 2;
        System.out.println("a : "+a+" b : "+b);
        System.out.println("switching ...");
        int c = a ;
        a=b;
        b=c;
        System.out.println("a : "+a+" b : "+b);

















    }
}