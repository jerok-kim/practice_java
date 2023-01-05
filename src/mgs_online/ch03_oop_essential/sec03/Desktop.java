package mgs_online.ch03_oop_essential.sec03;

public class Desktop extends Computer {
    
    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }
    
    @Override
    public void turnOff() {
        System.out.println("Desktop turnOff");
    }
}
