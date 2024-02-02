package day9.challenges;

import java.util.ArrayList;
import java.util.List;

public class ListManipulation {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("north");
        stringList.add("south");
        stringList.remove("south");
        stringList.contains("south");
        System.out.println(stringList);

    }
}
