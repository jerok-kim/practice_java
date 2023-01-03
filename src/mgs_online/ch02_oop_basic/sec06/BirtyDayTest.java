package mgs_online.ch02_oop_basic.sec06;

public class BirtyDayTest {
    public static void main(String[] args) {
        BirthDay date = new BirthDay();
        
        date.setYear(2023);
        date.setMonth(13);
        date.setDay(30);
        
        date.showDate();
    }
}
