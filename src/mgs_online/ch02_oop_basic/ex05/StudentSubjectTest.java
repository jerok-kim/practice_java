package mgs_online.ch02_oop_basic.ex05;

public class StudentSubjectTest {
    public static void main(String[] args) {

        Student studentLee = new Student(1001, "Lee");

        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 99);

        Student studentKim = new Student(1002, "Kim");

        studentKim.addSubject("국어", 88);
        studentKim.addSubject("수학", 75);
        studentKim.addSubject("영어", 94);

        studentLee.showScoreInfo();
        System.out.println("==================================");
        studentKim.showScoreInfo();
    }
}
