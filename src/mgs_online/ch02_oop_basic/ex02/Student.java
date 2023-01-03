package mgs_online.ch02_oop_basic.ex02;

public class Student {

    String studentName;
    int money;

    Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
