package mgs_lecture.ch08;

public class LowerClass {
    int x;
    int y;
    
    public LowerClass() {
        x = 20;
        y = 20;
    }
    
    public LowerClass(int x) {
        this();  // 자신의 Default constructor를 호출한다
        this.x = x;
    }
    
    public LowerClass(int x, int y) {
        // 오버로딩 생성자 호출시 생성자문은 첫번째로 호출되어야 한다.
        this(x);
        this.y = y;
    }
}
