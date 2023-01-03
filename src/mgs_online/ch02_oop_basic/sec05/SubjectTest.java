package mgs_online.ch02_oop_basic.sec05;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "Lee");
        studentLee.setKoreanSubject("국어", 100);
        studentLee.setMathSubject("수학", 99);
        
        Student studentKim = new Student(200, "Kim");
        studentKim.setKoreanSubject("국어", 88);
        studentKim.setMathSubject("수학", 56);
        
        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
