package mgs_algorithm.depth_first_search;

/*
 * DFS 알고리즘 구현
 *
 * - 자료구조 스택과 큐를 활용함
 *  - needVisit 스택과 visited 큐, 두 개의 자료 구조를 생성
 *  - BFS 자료구조는 두 개의 큐를 활용하는데 반해, DFS는 스택과 큐를 활용한다는 차이가 있음을 인지해야 함
 *
 */

import java.util.ArrayList;
import java.util.HashMap;

public class DepthFristSearch {

    public ArrayList<String> dfsFunc(HashMap<String, ArrayList<String>> graph, String startNode) {
        ArrayList<String> visited = new ArrayList<>();
        ArrayList<String> needVisit = new ArrayList<>();

        needVisit.add(startNode);

        while (needVisit.size() > 0) {
            String node = needVisit.remove(needVisit.size() - 1);
            if (!visited.contains(node)) {
                visited.add(node);
                needVisit.addAll(graph.get(node));
            }
        }

        return visited;
    }

}
