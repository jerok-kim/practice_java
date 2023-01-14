package mgs_data_structure.linked_list;

public class MyDoublyLinkedListTest {

    public static void main(String[] args) {

        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();

        doublyLinkedList.addNode(2);
        doublyLinkedList.addNode(4);
        doublyLinkedList.addNode(5);
        doublyLinkedList.addNode(8);
        doublyLinkedList.addNode(3);
        doublyLinkedList.printAll();

        System.out.println(doublyLinkedList.searchFromHead(8));


    }

}
