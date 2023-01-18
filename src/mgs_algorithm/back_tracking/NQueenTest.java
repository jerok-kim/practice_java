package mgs_algorithm.back_tracking;

import java.util.ArrayList;

public class NQueenTest {
    public static void main(String[] args) {
        
        NQueen nQueen = new NQueen();
        nQueen.dfsFunc(4, 0, new ArrayList<>());
        
    }
}
