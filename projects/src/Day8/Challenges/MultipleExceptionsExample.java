package Day8.Challenges;

public class MultipleExceptionsExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int index = 4;

        try {
            int result = numbers[index] / 0;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
