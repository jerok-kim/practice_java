package mgs_lecture.ch14.simple_date_format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx3 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formatter.parse("09/01/2023");
            System.out.println("Date is: " + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
