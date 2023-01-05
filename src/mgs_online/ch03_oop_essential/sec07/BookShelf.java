package mgs_online.ch03_oop_essential.sec07;

public class BookShelf extends Shelf implements Queue{
    
    @Override
    public void enQueue(String title) {
        shelf.add(title);        
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
