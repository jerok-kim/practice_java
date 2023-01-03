package mgs_lecture.ch08;

class TestA {
    void method1() {
        System.out.println("method1 call");
    }

    void method2() {
        System.out.println("method2 call");
        method1();  // 컴파일러가 자동으로 this를 추가한다
    }
}

public class TestThisEx2 {
    public static void main(String[] args) {
        TestA test = new TestA();
        test.method2();
    }
}
