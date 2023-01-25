package mgs_lecture.ch16.generics;

/*
 * 제너릭스의 다형성
 */

import java.util.ArrayList;

class LandAnimal {
    public void crying() {
        System.out.println("육지동물");
    }
}

class Cat extends LandAnimal {
    public void crying() {
        System.out.println("냐옹냐옹");
    }
}

class Dog extends LandAnimal {
    public void crying() {
        System.out.println("멍멍");
    }
}

class Sparrow {
    public void crying() {
        System.out.println("짹짹");
    }
}

class AnimalList<T> {
    ArrayList<T> a1 = new ArrayList<>();

    void add(T animal) {
        a1.add(animal);
    }

    T get(int index) {
        return a1.get(index);
    }

    boolean remove(T animal) {
        return a1.remove(animal);
    }

    int size() {
        return a1.size();
    }
}

public class GenericsPolymorphicEx1 {
    public static void main(String[] args) {
        AnimalList<LandAnimal> landAnimal = new AnimalList<>();
        landAnimal.add(new LandAnimal());
        landAnimal.add(new Cat());
        landAnimal.add(new Dog());
        // landAnimal.add(new Sparrow());

        for (int i = 0; i < landAnimal.size(); i++) {
            landAnimal.get(i).crying();
        }
    }
}
