package mgs_online.ch03_oop_essential.sec06;

public interface Buy {
    void buy();
    default void order() {
        System.out.println("buy order");
    }
}
