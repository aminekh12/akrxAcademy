package day9.challenges;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();

        list.add(3);
        list.add(7);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(9);
        Collections.sort(list);
        int index = Collections.binarySearch(list,5);
        System.out.println(index);


    }


}
