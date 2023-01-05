package mgs_online.ch05_java_data_structures.generic;

/**
 * - 자료형 매개변수 T(type parameter): 이 클래스를 사용하는 시점에 실제 사용할 자료형을 지정
 *                                    static 변수는 사용할 수 없음
 * - GenericPrinter: 제네릭 자료형
 * - E: element, K: key, V: value 등 여러 알파벳을 의미에 따라 사용 가능
 * 
 * @param <T>
 *     
 */
public class GenericPrinter<T> {
    private T material;  // T 자료형으로 선언한 변수

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {  // T 자료형을 반환하는 제네릭 메서드
        return material;
    }

    public String toString() {
        return material.toString();
    }
}