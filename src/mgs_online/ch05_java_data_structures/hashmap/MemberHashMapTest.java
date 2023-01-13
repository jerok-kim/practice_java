package mgs_online.ch05_java_data_structures.hashmap;

/**
 * HashMap 클래스 활용하기
 * <p>
 * - Map 인터페이스를 구현한 클래스
 * - 가장 많이 사용되는 Map 인터페이스 기반 클래스
 * - key-value를 쌍으로 관리하는 메서드를 구현함
 * - 검색을 위한 자료구조
 * - key를 이용하여 값을 지정하고 key를 이용하여 값을 꺼내오는 방식 - hash 알고리즘으로 구현 됨
 * - key가 되는 객체는 중복될 수 없고 객체의 유일성을 비교를 위한 equals()와 hashCode() 메서드를 구현해야 함
 * <p>
 * TreeMap 클래스
 * <p>
 * - Map 인터페이스를 구현한 클래스이고 key에 대한 정렬을 구현할 수 있음
 * - key가 되는 클래스에 Comparable이나 Comparator 인터페이스를 구현함으로써 key-value쌍의 자료를
 * key값 기준으로 정렬하여 관리할 수 있음
 */

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberKang);
        memberHashMap.addMember(memberHong);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();

    }
}
