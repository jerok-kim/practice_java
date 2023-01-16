package mgs_algorithm.breadth_first_search;

/*
 * 너비 우선 탐색(Breadth-First Search)
 *
 * 1. BFS와 DFS란?
 *  - 대표적인 그래프 탐색 알고리즘
 *      - 너비 우선 탐색(Breadth First Search): 노드들과 같은 레벨에 있는 노드들(형제 노드들)을 먼저 탐색하는 방식
 *      - 깊이 우선 탐색(Depth First Search): 노드의 자식들을 먼저 탐색하는 방식
 *
 * 2. Java로 그래프를 표현하는 방법
 *  - Java Collection Framework에서 제공하는 Hashmap과 ArrayList를 활용해서 그래프를 표현할 수 있음
 *
 * 3. BFS 알고리즘 구현
 *  - 자료구조 큐를 활용함
 *      - needVisit 큐와 visited 큐, 두 개의 큐를 생성
 *
 * 4. 시간 복잡도
 *  - 일반적인 BFS 시간 복잡도
 *      - 노드 수: V
 *      - 간선 수: E
 *          - 아래 코드에서 while needVisit 은 V + E 번 만큼 수행함
 *      - 시간 복잡도: O(V + E)
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;

public class BreadthFirstSearch {

    public ArrayList<String> bfsFunc(HashMap<String, ArrayList<String>> graph, String startNode) {
        ArrayList<String> visited = new ArrayList<>();
        ArrayList<String> needVisit = new ArrayList<>();

        needVisit.add(startNode);

        while (needVisit.size() > 0) {
            String node = needVisit.remove(0);

            if (!visited.contains(node)) {
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }
        
        return visited;
    }

}
