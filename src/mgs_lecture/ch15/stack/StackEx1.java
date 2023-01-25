package mgs_lecture.ch15.stack;

import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();  // 스택의 생성
        // Deque<Integer> st = new ArrayDeque<Integer>();
        // push() 메소드를 이용한 요소의 저장
        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(1);

        // peek() 메소드를 이용한 요소의 반환
        System.out.println(stack.peek());
        System.out.println(stack);

        // pop() 메소드를 이용한 요소의 반환 및 제거
        System.out.println(stack.pop());
        System.out.println(stack);

        // search() 메소드를 이용한 요소의 위치 검색
        System.out.println(stack.search(4));
        System.out.println(stack.search(3));
    }
}
