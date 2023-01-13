package mgs_lecture.ch12;

public class ExceptionParsing {
    public static void main(String[] args) {
        try {
            int sum = 0;
            String[] strArr = {"1", "2", "three", "4", "5"};
            for (int i = 0; i < strArr.length; i++) {
                sum += Integer.parseInt(strArr[i]);
            }
            System.out.println("Sum = " + sum);
        } catch (NumberFormatException ne) {
            System.out.println("숫자가 아닙니다");
        }
    }
}
