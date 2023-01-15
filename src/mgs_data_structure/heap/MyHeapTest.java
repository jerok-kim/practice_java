package mgs_data_structure.heap;

public class MyHeapTest {
    public static void main(String[] args) {
        MyHeap myHeap = new MyHeap(15);
        myHeap.insert(10);
        myHeap.insert(8);
        myHeap.insert(5);
        myHeap.insert(4);
        myHeap.insert(20);

        System.out.println(myHeap.heapArray);
        
        myHeap.pop();
        System.out.println(myHeap.heapArray);
    }
}
