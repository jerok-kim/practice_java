package mgs_online.ch03_oop_essential.ex04;

public interface Scheduler {
    public void getNextCall();
    public void sendCallToAgent();
    
    Object OBJECT = new Object();
}
