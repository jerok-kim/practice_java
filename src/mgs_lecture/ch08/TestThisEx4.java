package mgs_lecture.ch08;

class TestA3 {
    TestA3 getTestA3() {
        return this;
    }

    void msg() {
        System.out.println("TestA3 msg() 호출");
    }
}

public class TestThisEx4 {
    public static void main(String[] args) {
        new TestA3().getTestA3().msg();
    }
}
