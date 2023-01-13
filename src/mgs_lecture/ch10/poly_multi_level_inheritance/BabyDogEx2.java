package mgs_lecture.ch10.poly_multi_level_inheritance;

// Dog의 eat() 메서드를 오버라이드하지 않았다
public class BabyDogEx2 extends Dog {
    public static void main(String[] args) {
        Animal animal = new BabyDogEx2();
        animal.eat();
    }
}
