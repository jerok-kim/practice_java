package mgs_lecture.ch08;

public class TestCounter {
    public static void main(String[] args) {
        System.out.println("클래스 변수 Counter 값 : " + Count.getTotalCount());
        Count count = new Count();
        System.out.println("클래스 변수 Counter 값 : " + count.getTotalCount());
    }
}
