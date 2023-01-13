package mgs_lecture.ch10.instance_of;

import java.awt.print.PrinterGraphics;

class Printable {
    public void a() {
        System.out.println("p method");
    }
    
    public void b() {
        System.out.println("p method");
    }
}

class A extends Printable {

    public void a() {
        System.out.println("a method");
    }
}

class B extends Printable {

    public void b() {
        System.out.println("b method");
    }
}

class Call {
    // Polymorphic arguments로 전달된 상위타입의 실제 객체로
    // 다운캐스팅하여 메서드를 실행해야 하는 경우가 있다
    void invoke(Printable p) {
        if (p instanceof A) {
            A a = (A) p;  // Downcasting
            a.a();
        }
        if (p instanceof B) {
            B b = (B) p;  // Downcasting
            b.b();
        }
    }
}

public class InstanceOfTest {
    public static void main(String[] args) {
        Printable p1 = new B();
        Printable p2 = new A();
        Call call = new Call();
        call.invoke(p1);
        call.invoke(p2);
        Printable p3 = new Printable();
        call.invoke(p3);
    }
}
