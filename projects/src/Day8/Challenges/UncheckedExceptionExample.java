package Day8.Challenges;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            int[] array = null;
            int value = array.length;  // This will cause a NullPointerException
            System.out.println("Value: " + value);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}
