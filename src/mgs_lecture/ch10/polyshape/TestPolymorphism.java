package mgs_lecture.ch10.polyshape;

abstract class Shape {
    abstract void draw();
}

// Rectangle, Circle, Triangle 3개의 하위클래스를 정의하고
// 상위클래스의 메서드를 오버라이드한다
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("직사각형 그리기");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("원 그리기");
    }

}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("삼각형 그리기");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        // Shape 클래스 타입으로 객체 참조 변수를 선언
        // 하위클래스 객체를 생성하여 할당하고 오버라이드한 메서드를 각각 호출하여 다형성을 수행한다
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        Shape[] shapes = new Shape[3];
        shapes[0] = rectangle;
        shapes[1] = circle;
        shapes[2] = triangle;

        for (Shape s : shapes) {
            s.draw();
        }
    }
}