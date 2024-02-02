package Day8.Challenges;

public class CustomException extends Exception{
    public CustomException() {
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(String message) {
        super(message);
    }
}
class CustomExceptionSecond{
    private static void validateInput(int value) throws CustomException {
        if(value<0){
            throw new CustomException("Negative Number",new IllegalArgumentException("Invalid Input"));
        }
        else {
            System.out.println("Input is valid.");
        }
    }

    public static void main(String[] args) {
        try{
            validateInput(-7);
        }
        catch (CustomException e){
            System.out.println(e);
        }
    }
}
