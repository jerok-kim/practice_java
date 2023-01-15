package mgs_data_structure.linked_list;

public class MyDoublyLinkedListTest {

    public static void main(String[] args) {

        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();

        doublyLinkedList.addNode(1);
        doublyLinkedList.addNode(2);
        doublyLinkedList.addNode(3);
        doublyLinkedList.addNode(4);
        doublyLinkedList.addNode(5);
        doublyLinkedList.printAll();
        System.out.println("------------------");
        
        doublyLinkedList.insertToFront(3, 2);
        doublyLinkedList.printAll();
        System.out.println("------------------");
        
        doublyLinkedList.insertToFront(6,2);
        doublyLinkedList.insertToFront(1,0);
        doublyLinkedList.printAll();
        System.out.println("------------------");
        
        doublyLinkedList.addNode(6);
        doublyLinkedList.printAll();
        
    }

}
