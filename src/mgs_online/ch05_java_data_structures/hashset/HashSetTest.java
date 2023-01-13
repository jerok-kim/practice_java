package mgs_online.ch05_java_data_structures.hashset;

import java.util.HashSet;

/**
 * HashSet 클래스
 * <p>
 * - Set 인터페이스를 구현한 클래스
 * - 멤버의 중복 여부를 체크하기 위해 인스턴스의 동일성을 확인해야 함
 * - 동일성 구현을 위해 필요에 따라 equals()와 hashCode() 메서드를 재정의함
 */

public class HashSetTest {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(new String("김유신"));
        hashSet.add(new String("이순신"));
        hashSet.add(new String("홍연의"));
        hashSet.add(new String("강감찬"));
        hashSet.add(new String("강감찬"));

        System.out.println(hashSet);

    }
}
