package mgs_online.ch04_java_useful_classes.sec02;

import java.util.Objects;

public class Student implements Cloneable{
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }
    
    public void setStudentName(String name) {
        this.studentName = name;
    }

    @Override
    public String toString() {
        return studentNum + "," + studentName;
    }

    // java version
    //
    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o == null || getClass() != o.getClass()) return false;
    //     Student student = (Student) o;
    //     return studentNum == student.studentNum && studentName.equals(student.studentName);
    // }
    //
    // @Override
    // public int hashCode() {
    //     return Objects.hash(studentNum, studentName);
    // }


    // Intellij version
    //
    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o == null || getClass() != o.getClass()) return false;
    //
    //     Student student = (Student) o;
    //
    //     if (studentNum != student.studentNum) return false;
    //     return studentName.equals(student.studentName);
    // }
    //
    // @Override
    // public int hashCode() {
    //     int result = studentNum;
    //     result = 31 * result + studentName.hashCode();
    //     return result;
    // }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student std = (Student) obj;
            if(this.studentNum == std.studentNum) {
                return true;
            } else {
                return false;
            }
        }
        
        return false;
    }
    
    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
