package Day8.Challenges;

public class ArrayindexOutofBoundChallenge {
    public static void main(String[] args) {

        try {
            int[] intarray = new int[10];
            intarray[11] = 10;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error Message : "+e.getMessage());
        }
    }
}
