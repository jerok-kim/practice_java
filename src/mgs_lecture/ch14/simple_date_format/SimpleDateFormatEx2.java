package mgs_lecture.ch14.simple_date_format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx2 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date Format MM/dd/yyyy : " + strDate);

        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date Format dd-M-yyyy hh:mm:ss : " + strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        System.out.println("Date Format dd MMMM yyyy : " + strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate = formatter.format(date);
        System.out.println("Date Format dd MMMM yyyy zzzz : " + strDate);

        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        System.out.println("Date Format E, dd MMM yyyy HH:mm:ss z : " + strDate);
    }
}
