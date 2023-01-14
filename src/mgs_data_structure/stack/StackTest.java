package mgs_data_structure.stack;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack<Integer> stack_int = new Stack<Integer>();

        stack_int.push(1);
        stack_int.push(2);
        stack_int.push(3);

        stack_int.pop();
        stack_int.pop();
        stack_int.pop();

        MyStack<Integer> myStack = new MyStack<Integer>();

        myStack.push(11);
        myStack.push(12);
        myStack.push(13);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }

}
