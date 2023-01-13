package mgs_lecture.ch11.flyerinf;

public class Superman implements Flyer {
    @Override
    public void takeOff() {
        System.out.println("슈퍼맨이 이륙하다");
    }

    @Override
    public void land() {
        System.out.println("슈퍼맨이 착륙하다");
    }

    @Override
    public void fly() {
        System.out.println("슈퍼맨이 날다");
    }
}
