package mgs_data_structure.queue;

import java.util.ArrayList;

public class MyQueue<T> {

    // - Java ArrayList 클래스를 활용해서 큐를 다루는 enqueue, dequeue 기능 구현해보기
    // - dequeue 기능 호출 시, 큐에 데이터가 없을 경우, null을 리턴하도록 함
    // - 다양한 데이터 타입을 다룰 수 있도록, Java Generic 타입 문법을 활용해보기

    private ArrayList<T> queue = new ArrayList<T>();

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
}
