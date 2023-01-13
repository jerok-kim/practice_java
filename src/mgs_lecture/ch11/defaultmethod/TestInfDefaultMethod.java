package mgs_lecture.ch11.defaultmethod;

interface Drawable {
    void draw();

    default void msg() {
        System.out.println("interface default method");
        privateMsg();
    }

    static void staticMsg() {
        System.out.println("interface static method");
        privateStaticMsg();
    }

    private void privateMsg() {
        System.out.println("\t-> interface private method");
    }

    private static void privateStaticMsg() {
        System.out.println("\t-> interface private static method");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Rectangle class draw method");
    }
}

public class TestInfDefaultMethod {
    public static void main(String[] args) {
        Drawable d = new Rectangle();
        d.draw();
        d.msg();
        Drawable.staticMsg();
    }
}
