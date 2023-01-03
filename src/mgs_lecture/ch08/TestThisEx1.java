package mgs_lecture.ch08;

class Student {
    // 학번
    int no;

    // 이름
    String name;

    Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    void display() {
        System.out.println(no + " " + name);
    }
}

public class TestThisEx1 {
    public static void main(String[] args) {
        Student s1 = new Student(100, "홍길동");
        Student s2 = new Student(200, "김철수");
        s1.display();
        s2.display();
    }
}
