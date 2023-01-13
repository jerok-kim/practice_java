package mgs_lecture.ch11.flyerinf;

public class Airplain implements Flyer {
    @Override
    public void takeOff() {
        System.out.println("비행기가 이륙하다");
    }

    @Override
    public void land() {
        System.out.println("비행기가 착륙하다");
    }

    @Override
    public void fly() {
        System.out.println("비행기가 날다");
    }
}
