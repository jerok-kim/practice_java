package mgs_data_structure.tree;

/*
 * 1. 트리(Tree) 구조
 *
 * - 트리: Node와 Branch를 이용해서, 사이클을 이루지 않도록 구성한 데이터 구조
 * - 실제로 어디에 많이 사용되나?
 *      - 트리 중 이진 트리(Binary Tree)형태의 구조로, 탐색(검색) 알고리즘 구현을 위해 많이 사용됨
 *
 * 2. 알아둘 용어
 *
 * - Node: 트리에서 데이터를 저장하는 기본 요소(데이터와 다른 연결된 노드에 대한 Branch 정보 포함)
 * - Root Node: 트리 맨 위에 있는 노드
 * - Level: 최상위 노드를 Level 0으로 하였을 때, 하위 Branch로 연결된 노드의 깊이를 나타냄
 * - Parent Node: 어떤 노드의 상위 레벨에 연결된 노드
 * - Child Node: 어떤 노드의 다음 레벨에 연결된 노드
 * - Leaf Node (Terminal Node): Child Node가 하나도 없는 노드
 * - Sibling (Brother Node): 동일한 Parent Node를 가진 노드
 * - Depth: 트리에서 Node가 가질 수 있는 최대 Level
 *
 * 3. 이진 트리와 이진 탐색 트리(Binary Search Tree)
 *
 * - 이진 트리: 노드의 최대 Branch가 2인 트리
 * - 이진 탐색 트리(Binary Search Tree, BST): 이진 트리에 다음과 같은 추가적인 조건이 있는 트리
 *      - 왼쪽 노드는 해당 노드보다 작은 값, 오른쪽 노드는 해당 노드보다 큰 값을 가지고 있음
 *
 */

public class MyBinarySearchTree {

    public static void main(String[] args) {

        NodeMgmt myTree = new NodeMgmt();

        myTree.insertNode(10);
        myTree.insertNode(15);
        myTree.insertNode(13);
        myTree.insertNode(11);
        myTree.insertNode(14);
        myTree.insertNode(18);
        myTree.insertNode(16);
        myTree.insertNode(19);
        myTree.insertNode(17);
        myTree.insertNode(7);
        myTree.insertNode(8);
        myTree.insertNode(6);

        System.out.println(myTree.delete(15));
        System.out.println("HEAD: " + myTree.head.value);
        System.out.println("HEAD LEFT: " + myTree.head.left.value);
        System.out.println("HEAD LEFT LEFT: " + myTree.head.left.left.value);
        System.out.println("HEAD LEFT RIGHT: " + myTree.head.left.right.value);

        System.out.println("HEAD RIGHT: " + myTree.head.right.value);
        System.out.println("HEAD RIGHT LEFT: " + myTree.head.right.left.value);
        System.out.println("HEAD RIGHT RIGHT: " + myTree.head.right.right.value);

        System.out.println("HEAD RIGHT RIGHT LEFT: " + myTree.head.right.right.left.value);
        System.out.println("HEAD RIGHT RIGHT RIGHT: " + myTree.head.right.right.right.value);
    }

}
