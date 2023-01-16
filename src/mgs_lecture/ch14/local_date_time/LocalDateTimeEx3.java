package mgs_lecture.ch14.local_date_time;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Arrays;

public class LocalDateTimeEx3 {
    public static void main(String[] args) {
        // LocalTime present1 = LocalTime.now();
        // System.out.println("현재 시각은 " +
        //         present1.getHour() + "시 " +
        //         present1.getMinute() + "분입니다.");
        //
        // LocalTime present2 = LocalTime.now();
        // String ampm;
        // if (present2.get(ChronoField.AMPM_OF_DAY) == 0) {
        //     ampm = "오전";
        // } else {
        //     ampm = "오후";
        // }
        // System.out.println("지금은 " + ampm + " " +
        //         present2.get(ChronoField.HOUR_OF_AMPM) + "시입니다.");


        // Integer[] a = new Integer[]{Integer.valueOf(1), Integer.valueOf(2)};
        Integer[] a = {1, 2};
        System.out.println(a);
        int[] aa = {1, 2};
        // int[] aaa = a;
        System.out.println(aa);
        
        Integer b = 3;
        int c = 3;
        
        int[] aaa = Arrays.stream(a).mapToInt(Integer::intValue).toArray();
    }
}
