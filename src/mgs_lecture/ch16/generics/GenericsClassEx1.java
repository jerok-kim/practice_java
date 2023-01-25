package mgs_lecture.ch16.generics;

public class GenericsClassEx1 {
    public static void main(String[] args) {
        // java 7 버전부터 타입 추론이 가능할 경우 인스턴스 생성시 생략가능
        DefineGenericsClassEx1<Integer> intObj = new DefineGenericsClassEx1<>(5);
        System.out.println("Generic Class returns Integer 타입 : " + intObj.getData());

        DefineGenericsClassEx1<String> stringObj = new DefineGenericsClassEx1<>("자바 프로그래밍");
        System.out.println("Generic Class returns String 타입 : " + stringObj.getData());
    }
}

// generics class
class DefineGenericsClassEx1<T> {

    // variable of T type
    private T data;

    // Parameter T type variable
    public DefineGenericsClassEx1(T data) {
        this.data = data;
    }

    // method return T type variable
    public T getData() {
        return this.data;
    }
}