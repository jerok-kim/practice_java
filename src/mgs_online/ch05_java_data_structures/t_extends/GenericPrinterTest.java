package mgs_online.ch05_java_data_structures.t_extends;

/**
 * <T extends 클래스> 사용하기
 * 상위 클래스의 필요성
 * - T 자료형의 범위를 제한 할 수 있음
 * - 상위 클래스에서 선언하거나 정의하는 메서드를 활용할 수 있음
 * - 상속을 받지 않는 경우 T는 Object로 변환되어 Object 클래스가 기본으로 제공하는 메서드만 사용가능
 * <p>
 * T extends 를 사용한 프로그래밍
 * - GenericPrinter에 material 변수의 자료형을 상속받아 구현
 * - T에 무작위 클래스가 들어갈 수 없게 Material 클래스를 상속받은 클래스로 한정
 */

public class GenericPrinterTest {
    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();  // 형변환 하지 않음
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();  // 형변환 하지 않음
        System.out.println(plasticPrinter);

        // GenericPrinter powderPrinter2 = new GenericPrinter();
        // powderPrinter2.setMaterial(new Powder());
        // Powder powder = (Powder) powderPrinter.getMaterial();
        // System.out.println(powderPrinter);
        // GenericPrinter<Water> printer = new GenericPrinter<Water>();
    }
}