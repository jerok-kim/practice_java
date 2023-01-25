package mgs_lecture.ch16.generic_wildcard;

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

    public static void cryingAnimalList(AnimalList<? extends LandAnimal> a1) {
        LandAnimal la = a1.get(0);
        la.crying();
    }

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

public class GenericsWildCardEx1 {
    public static void main(String[] args) {
        AnimalList<Cat> catList = new AnimalList<>();
        catList.add(new Cat());

        AnimalList<Dog> dogList = new AnimalList<>();
        dogList.add(new Dog());

        AnimalList.cryingAnimalList(catList);
        AnimalList.cryingAnimalList(dogList);
    }
}
