package Day8.Challenges;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;

        try {
            // Check if the reference is null before using it
            if (str != null) {
                int length = str.length();
                System.out.println("Length of the string: " + length);
            } else {
                System.out.println("The string reference is null.");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}
