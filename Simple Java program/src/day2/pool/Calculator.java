package day2.pool;

// Class definition with default (package-private) access
public class Calculator {
    // Private attributes
    private double operand1;
    private double operand2;

    // Public constructor
    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    // Public method to perform addition
    public double add() {
        return operand1 + operand2;
    }

    // Public method to perform subtraction
    public double subtract() {
        return operand1 - operand2;
    }
}

// Main class to demonstrate the day2.pool.Calculator class
class CalculatorMain {
    public static void main(String[] args) {
        // Creating an object of the day2.pool.Calculator class
        Calculator calculator = new Calculator(10.5, 5.2);

        // Accessing public methods
        System.out.println("Sum: " + calculator.add());
        System.out.println("Difference: " + calculator.subtract());

        // Trying to access private attributes directly (which is not allowed)
        // calculator.operand1; // This will result in a compilation error
    }
}