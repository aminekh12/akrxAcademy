package day9.challenges;

public class ArrayOperations {

    public static void main(String[] args) {
        int[] numbers = {1,3,4,5};
        int sum = 0;
        for(int number:numbers){
            sum+=number;
            System.out.println(sum);
        }
        int length = numbers.length;
        for(int i = 0;i < numbers.length;i++){
            System.out.println(numbers[length-1-i]);
        }

    }
}
