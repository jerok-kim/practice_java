package mgs_online.ch03_oop_essential.sec07;

import java.util.ArrayList;

public class Shelf {
    
    protected ArrayList<String> shelf;
    
    public Shelf() {
        shelf = new ArrayList<>();
    }
    
    public ArrayList<String> getShelf() {
        return shelf;
    }
    
    public int getCount() {
        return shelf.size();
    }
    
}
