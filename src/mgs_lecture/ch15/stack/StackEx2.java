package mgs_lecture.ch15.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackEx2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");

        // Iterator for the stack
        Iterator<String> iterator = stack.iterator();

        // Printing the stack
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        stack.pop();

        // Iterator for the stack
        iterator = stack.iterator();

        // Printing the stack
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
