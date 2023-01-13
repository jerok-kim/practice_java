package mgs_online.ch06_java_various_features.sec01;


public class InnerTest {

    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();      // 내부 클래스 기능 호출
        System.out.println();

        OutClass.InClass inClass = outClass.new InClass();      // 외부 클래스를 이용하여 내부 클래스 생성
        System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
        inClass.inTest();
    }
    
}
