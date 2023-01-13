package mgs_lecture.ch13.objequals;

public class ObjectEqualsTest {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        if (obj1.equals(obj2)) {
            System.out.println("obj1.equals(obj2) -> true");
        } else {
            System.out.println("obj1.equals(obj2) -> false");
        }

        ObjectEq oeq1 = new ObjectEq(10);
        ObjectEq oeq2 = new ObjectEq(10);

        // 객체 참조값을 비교
        if (oeq1 == oeq2) {
            System.out.println("o1 == o2 -> true");
        } else {
            System.out.println("o1 == o2 -> false");
        }

        // 오버라이딩된 메서드를 호출하여 객체의 필드값을 비교
        if (oeq1.equals(oeq2)) {
            System.out.println("o1.equals(o2) -> true");
        }
    }
}
