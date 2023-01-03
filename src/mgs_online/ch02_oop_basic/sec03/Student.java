package mgs_online.ch02_oop_basic.sec03;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;
    
    Student student = new Student();

    public Student() {}
    
    public Student(int studentNumber, String studentName, int grade) {
        
        student.studentNumber = studentNumber;
        
    }
    
    public String showStudentInfo() {
        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
    }

}