package mgs_online.ch03_oop_essential.sec06;

public interface Sell {
    void sell();
    default void order() {
        System.out.println("sell order");
    }
}
