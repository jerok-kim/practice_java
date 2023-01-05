package mgs_online.ch05_java_data_structures.stack;

import mgs_online.ch05_java_data_structures.array.MyArray;

/**
 * 스택(Stack)의 특징
 * <p>
 * - 맨 마지막 위치(top)에서만 자료를 추가, 삭제, 꺼내올 수 있음 (중간의 자료를 꺼낼 수 없음)
 * - Last In First Out(후입선출) 구조
 * - 택배 상자가 쌓여있는 모양
 * - 가장 최근의 자료를 찾아오거나 게임에서 히스토리를 유지하고 이를 무를때 사용할 수 있음
 * - 함수의 메모리는 호출 순서에 따른 stack 구조
 * - jdk 클래스: Stack
 */
public class MyArrayStack {

    int top;
    MyArray arrayStack;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("stack is full");
            return;
        }

        arrayStack.addElement(data);
        top++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.removeElement(--top);
    }

    public int peek() {
        if (top == 0) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(top - 1);
    }

    public int getSize() {
        return top;
    }

    public boolean isFull() {
        if (top == arrayStack.ARRAY_SIZE) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printAll() {
        arrayStack.printAll();
    }

}
