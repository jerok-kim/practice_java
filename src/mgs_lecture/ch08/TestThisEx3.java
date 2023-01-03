package mgs_lecture.ch08;

class TestA2 {
    TestThisEx3 obj;
    TestA2(TestThisEx3 obj) {
        this.obj = obj;
    }
    void display() {
        // TestThisEx3 클래스의 멤버변수 데이터를 사용하여 출력
        System.out.println(obj.val);
    }
}

public class TestThisEx3 {
    
    int val = 20;
    
    TestThisEx3() {
        TestA2 t=new TestA2(this);
        t.display();
    }
    
    public static void main(String[] args) {
        TestThisEx3 testThisEx3 = new TestThisEx3();
    }
}
