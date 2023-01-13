package mgs_lecture.ch11.flyerinf;

import mgs_lecture.ch10.hc.Animal;

public class Bird extends Animal implements Flyer {

    @Override
    public void takeOff() {  // interface implements
        System.out.println("새가 이륙하다");
    }

    @Override
    public void land() {  // interface implements
        System.out.println("새가 착륙하다");
    }

    @Override
    public void fly() {  // interface implements
        System.out.println("새가 날다");
    }

    public void buildNest() {
        System.out.println("새가 둥지를 짓다");
    }

    public void layEggs() {
        System.out.println("새가 알을 낳다");
    }

    public void eat() {  // Animal eat() override
        System.out.println("새가 먹는다");
    }
}
