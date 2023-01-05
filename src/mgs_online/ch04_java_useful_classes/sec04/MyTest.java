package mgs_online.ch04_java_useful_classes.sec04;

import java.lang.reflect.Constructor;

public class MyTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class string = Class.forName("java.lang.String");
        Class integer = Class.forName("java.lang.Integer");

        Constructor[] strConstructors = string.getConstructors();
        for (Constructor constructor : strConstructors) {
            System.out.println(constructor);
        }

        System.out.println("==================");

        Constructor[] integerConstructors = integer.getConstructors();
        for (Constructor constructor : integerConstructors) {
            System.out.println(constructor);
        }
    }
}
