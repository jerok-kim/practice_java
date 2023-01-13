package mgs_online.ch05_java_data_structures.generic;

/**
 * 제네릭 자료형 정의
 * 
 * - 클래스에서 사용하는 변수의 자료형이 여러개일 수 있고, 그 기능(메서드)은 동일한 경우
 * 클래스의 자료형을 특정하지 않고 추후 해당 클래스를 사용할 때 지정할 수 있도록 선언
 * - 실제 사용되는 자료형의 변환은 컴파일러에 의해 검증되므로 안정적인 프로그래밍 방식
 * - 컬렉션 프레임워크에서 많이 사용되고 있음
 * 
 */
public class GenericPrinterTest {
    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);

    }
}
