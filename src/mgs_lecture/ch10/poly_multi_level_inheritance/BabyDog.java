package mgs_lecture.ch10.poly_multi_level_inheritance;

class Animal {
    void eat() {
        System.out.println("먹기");
    }
}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("과일 먹기");
    }
}

public class BabyDog extends Dog {
    @Override
    void eat() {
        System.out.println("우유 마시기");
    }

    public static void main(String[] args) {
        // 재정의된 메서드가 호출된다
        Animal a1, a2, a3;
        a1 = new Animal();
        a2 = new Dog();
        a3 = new BabyDog();

        a1.eat();
        a2.eat();
        a3.eat();
    }
}
