package day9.challenges;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
    // add element to the Stack
        stack.push("amine");
        stack.push("salim");
        stack.push("yassir");
    // removing the first elements for the Stack
        stack.pop();
    // retrieving the first element after the pop
        System.out.println(stack.peek());
    // showing if the Stack is empty or not
        System.out.println("Stack is empty : "+stack.isEmpty());



    }
}
