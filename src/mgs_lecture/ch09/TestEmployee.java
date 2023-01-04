package mgs_lecture.ch09;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee("홍길동", 1000);
        Manager m = new Manager("홍길동", 1000, "IT개발팀");

        System.out.println(e.getDetails());
        System.out.println();
        System.out.println(m.getDetails());
    }
}
