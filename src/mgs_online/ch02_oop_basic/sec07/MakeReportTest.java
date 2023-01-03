package mgs_online.ch02_oop_basic.sec07;

public class MakeReportTest {
    public static void main(String[] args) {
        MakeReport builder = new MakeReport();
        String report = builder.getReport();

        System.out.println(report);
    }
}