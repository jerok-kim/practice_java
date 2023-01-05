package mgs_online.ch03_oop_essential.sec07;

public interface Queue {
    
    void enQueue(String title);
    String deQueue();
    
    int getSize();
    
}
