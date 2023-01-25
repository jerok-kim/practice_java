package mgs_lecture.ch16.generics_method;

class GenericsMethodClass {
    // generics method 생성
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method Data Passed: " + data);
        System.out.println("매개변수 타입 : " + data.getClass().getName() + "\n");
    }
}

public class GenericsMethodEx1 {
    public static void main(String[] args) {
        GenericsMethodClass demo = new GenericsMethodClass();

        // generics method의 매개변수가 String 타입으로 동작됨
        demo.genericsMethod("제너릭스 메서드");

        // generics method이 매개변수가 Integer 타입으로 동작됨
        demo.genericsMethod(25);

        // 이 경우 컴파일러는 메서드에 전달된 값을 기반으로 형식 매개 변수를 일치시킬 수 있습니다.
        demo.genericsMethod(50);

    }
}