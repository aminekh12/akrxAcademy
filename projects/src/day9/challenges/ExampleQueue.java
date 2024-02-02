package day9.challenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        // Enqueue elements
        System.out.println("Adding elements to the array list ... ");
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for(Integer n:numbers){
            queue.offer(n);
        }


        // remove the first element
        System.out.println("this element is removed : "+queue.poll());

        // Peek at the front element
        System.out.println("first element: " + queue.peek());

        // Dequeue elements is Empty
        System.out.println("is the queue empty : "+queue.isEmpty());

    }
}