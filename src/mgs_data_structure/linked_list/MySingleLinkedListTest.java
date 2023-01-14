package mgs_data_structure.linked_list;

public class MySingleLinkedListTest {

    public static void main(String[] args) {

        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<Integer>();

        singleLinkedList.addNode(1);
        singleLinkedList.addNode(2);
        singleLinkedList.addNode(3);
        singleLinkedList.addNode(4);
        singleLinkedList.addNode(5);
        singleLinkedList.printAll();

        singleLinkedList.delNode(3);
        singleLinkedList.delNode(1);
        singleLinkedList.delNode(5);
        singleLinkedList.delNode(20);
        singleLinkedList.printAll();

    }

}
