package mgs_lecture.ch14.simple_date_format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx1 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatter3 = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(formatter1.format(date));
        System.out.println(formatter2.format(date));
        System.out.println(formatter3.format(date));
    }
}
