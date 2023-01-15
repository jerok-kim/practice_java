package mgs_data_structure.tree;

public class NodeMgmt {

    Node head = null;

    public class Node {
        Node left;
        Node right;
        int value;

        public Node(int data) {
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        // CASE1: Node가 하나도 없을 때
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            // CASE2: Node가 하나 이상 들어가 있을 때
            Node findNode = this.head;
            while (true) {
                // CASE2-1: 현재 Node의 왼쪽에 Node가 들어가야 할 때
                if (data < findNode.value) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }
                } else {
                    // CASE2-2: 현재 Node의 오른쪽에 Node가 들어가야 할 때
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node search(int data) {
        // CASE1: Node가 하나도 없을 때
        if (this.head == null) {
            return null;
        } else {
            // CASE2: Node가 하나 이상 있을 때
            Node findNode = this.head;
            while (findNode != null) {
                if (findNode.value == data) {
                    return findNode;
                } else if (data < findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }
            return null;
        }
    }

    /*
     * 이진 탐색 트리 삭제
     *
     * 1. Left Node 삭제
     *  - Leaf Node: Child Node가 없는 Node
     *  - 삭제할 Node의 Parent Node가 삭제할 Node를 가리키지 않도록 한다.
     *
     * 2. Child Node가 하나인 Node 삭제
     *  - 삭제할 Node의 Parent Node가 삭제할 Node의 Child Node를 가리키도록 한다.
     *
     * 3. Child Node가 두 개인 Node 삭제
     *  1) 삭제할 Node의 오른쪽 자식 중, 가장 작은 값을 삭제할 Node의 Parent Node가 가리키도록 한다.
     *  2) 삭제할 Node의 왼쪽 자식 중, 가장 큰 값을 삭제할 Node의 Parent Node가 가리키도록 한다.
     *
     */

    /*
     * 1) 삭제할 Node의 오른쪽 자식 중, 가장 작은 값을 삭제할 Node의 Parent Node가 가리키도록 하는 경우
     *
     * - 삭제할 Node의 오른쪽 자식 선택
     * - 오른쪽 자식의 가장 왼쪽에 있는 Node를 선택
     * - 해당 Node를 삭제할 Node의 Parent Node의 왼쪽 Branch가 가리키게 함
     * - 해당 Node의 왼쪽 Branch가 삭제할 Node의 왼쪽 Child Node를 가리키게 함
     * - 해당 Noode의 오른쪽 Branch가 삭제할 Node의 오른쪽 Child Node를 가리키게 함
     * - 만약 해당 Node가 오른쪽 Child Node를 가지고 있었을 경우에는, 해당 Node의 본래 Parent Node의 왼쪽 Branch가 해당 오른쪽 Child Node를 가리키게 함
     *
     */

    public boolean delete(int value) {
        boolean searched = false;

        Node currParentNode = this.head;
        Node currNode = this.head;

        // 코너 케이스1: Node가 하나도 없을 때
        if (this.head == null) {
            return false;
        } else {
            // 코너 케이스2: Node가 단지 하나만 있고, 해당 Node가 삭제할 Node일 때
            if (this.head.value == value && this.head.left == null && this.head.right == null) {
                this.head = null;
                return true;
            }
        }

        while (currNode != null) {
            if (currNode.value == value) {
                searched = true;
                break;
            } else if (value < currNode.value) {
                currParentNode = currNode;
                currNode = currNode.left;
            } else {
                currParentNode = currNode;
                currNode = currNode.right;
            }
        }

        // 여기까지 실행되면,
        // currNode 에는 해당 데이터를 가지고 있는 Node,
        // currParentNode 에는 해당 데이터를 가지고 있는 Node의 부모 Node

        // CASE1: 삭제할 Node가 Leaf Node 인 경우
        if (currNode.left == null && currNode.right == null) {
            if (value < currParentNode.value) {
                currParentNode.left = null;
                currNode = null;
            } else {
                currParentNode.right = null;
                currNode = null;
            }
            return true;
        } else if (currNode.left != null && currNode.right == null) {
            // CASE2-1: 삭제할 Node가 Child Node를 한 개 가지고 있을 경우 (왼쪽에 Child Node 가 있을 경우)
            if (value < currParentNode.value) {
                currParentNode.left = currNode.left;
                currNode = null;
            } else {
                currParentNode.right = currNode.left;
                currNode = null;
            }
            return true;
        } else if (currNode.left == null && currNode.right != null) {
            // CASE2-2: 삭제할 Node가 Child Node를 한 개 가지고 있을 경우 (오른쪽에 Child Node 가 있을 경우)
            if (value < currParentNode.value) {
                currParentNode.left = currNode.right;
                currNode = null;
            } else {
                currParentNode.right = currNode.right;
                currNode = null;
            }
            return true;
        }

        // CASE3-1: 삭제할 Node가 Child Node를 두 개 가지고 있을 경우 (삭제할 Node가 Parent Node 왼쪽에 있을 때)
        //
        // - 기본 사용 가능 전략
        //      1. 삭제할 Node의 오른쪽 자식 중, 가장 작은 값을 삭제할 Node의 Parent Node가 가리키도록 한다.
        //      2. 삭제할 Node의 왼쪽 자식 중, 가장 큰 값을 삭제할 Node의 Parent Node가 가리키도록 한다.
        // - 기본 사용 가능 전략 중, 1번 전략을 사용하여 코드를 구현하기로 함
        //      - 경우의 수가 또다시 두 가지가 있음
        //          - CASE3-1-1: 삭제할 Node가 Parent Node의 왼쪽에 있고, 삭제할 Node의 오른쪽 자식 중, 가장 작은 값을 가진 Node의 Child Node가 없을 때
        //          - CASE3-2-2: 삭제할 Node가 Parent Node의 왼쪽에 있고, 삭제할 Node의 오른쪽 자식 중, 가장 작은 값을 가진 Node의 오른쪽에 Child Node가 있을 때
        //              - 가장 작은 값을 가진 Node의 Child Node가 왼쪽에 있을 경우는 없음, 왜냐하면 왼쪽 Node가 있다는 것은 해당 Node보다 더 작은 값을 가진 Node가 있다는 뜻이기 때문임


        // CASE3-1: 삭제할 Node가 Child Node를 두 개 가지고 있을 경우 (삭제할 Node가 Parent Node 왼쪽에 있을 때)
        else {
            // 삭제할 Node가 부모 Node의 왼쪽에 있을 때
            if (value < currParentNode.value) {
                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;
                while (changeNode.left != null) {
                    changeParentNode = changeNode;
                    changeNode = changeNode.left;
                }
                // 여기까지 실행되면, changeNode 에는 삭제할 Node의 오른쪽 Node 중에서,
                // 가장 작은 값을 가진 Node 가 들어있음

                if (changeNode.right != null) {
                    // CASE3-1-1: changeNode 의 Child Node 가 없을 때
                    changeParentNode.left = changeNode.right;
                } else {
                    // CASE3-1-2: changeNode 의 오른쪽 Child Node 가 있을 때
                    changeParentNode.left = null;
                }

                // currParentNode의 왼쪽 Child Node에 삭제할 Node의 오른쪽 자식 중,
                // 가장 작은 값을 가진 changeNode를 연결
                currParentNode.left = changeNode;

                // parentNode의 왼쪽 Child Node가 현재 changeNode 이고, 
                // changeNode의 왼쪽/오른쪽 Child Node를 모두 삭제할 currNode의
                // 기존 왼쪽/오른쪽 Node로 변경
                changeNode.right = currNode.right;
                changeNode.left = currNode.left;
                currNode = null;
            } else {
                Node changeNode = currNode.right;
                Node changeParentNode = currNode.right;
                while (changeNode.left != null) {
                    changeParentNode = changeNode;
                    changeNode = changeNode.left;
                }
                // 여기까지 실행되면, changeNode 에는 삭제할 Node의 오른쪽 Node 중에서,
                // 가장 작은 값을 가진 Node 가 들어있음

                if (changeNode.right != null) {
                    // CASE3-1-1: changeNode 의 Child Node 가 없을 때
                    changeParentNode.left = changeNode.right;
                } else {
                    // CASE3-1-2: changeNode 의 오른쪽 Child Node 가 있을 때
                    changeParentNode.left = null;
                }

                // currParentNode의 오른쪽 Child Node에 삭제할 Node의 오른쪽 자식 중,
                // 가장 작은 값을 가진 changeNode를 연결
                currParentNode.right = changeNode;

                // parentNode의 왼쪽 Child Node가 현재 changeNode 이고, 
                // changeNode의 왼쪽/오른쪽 Child Node를 모두 삭제할 currNode의
                // 기존 왼쪽/오른쪽 Node로 변경
                changeNode.right = currNode.right;
                changeNode.left = currNode.left;
                currNode = null;
            }
            return true;
        }
    }
    
    /*
     * 이진 탐색 트리의 시간 복잡도와 단점
     * 
     * 1. 시간 복잡도 (탐색시)
     *  - depth(트리의 높이)를 h라고 표기한다면, O(h)
     *  - n개의 노드를 가진다면, h = ln(n)에 가까우므로, 시간 복잡도는 O(ln(n))
     *      - 한번 실행시마다, 50%의 실행할 수도 있는 명령을 제거한다는 의미, 즉 50%의 실행시간을 단축시킬 수 있다는 것을 의미함
     * 
     * 2. 이진 탐색 트리의 단점
     *  - 평균 시간 복잡도는 O(ln(n))이지만,
     *      - 이는 트리가 균형잡혀 있을 때의 평균 시간복잡도이며,
     *  - 최악의 경우는 링크드 리스트 등과 동일한 성능을 보여줌 ( O(n) )
     */
}
