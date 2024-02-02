package day9.challenges;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListOperation {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> secondLinkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        linkedList.remove(3);
        System.out.println("LinkedList length :" + linkedList.size());

        int size = linkedList.size();
        for (int i = 0; i < size; i++) {
            secondLinkedList.add(linkedList.get(size-1-i));
        }
        linkedList.clear();
        linkedList=secondLinkedList;
        for(Integer number:linkedList){
            System.out.println(number);
        }
    }
}
