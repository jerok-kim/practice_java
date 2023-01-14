package mgs_data_structure.queue;

public class QueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<Integer>();
        
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        
    }
}
