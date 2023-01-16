package mgs_lecture.ch14.regex;

import java.util.regex.Pattern;

public class RegexPatternEx1 {
    public static void main(String[] args) {
        // 숫자만 있는지 확인
        String pattern = "^[0-9]*$";
        String str = "728349872";

        // 첫 번째 파라미터는 정규 표현식, 두 번째 파라미터는 매칭 확인 대상 문자열
        boolean result = Pattern.matches(pattern, str);
        System.out.println(result);

        // 메서드를 연결하여 결과를 얻을 수도 있다
        boolean result2 = Pattern.compile("^[0-9]*$").matcher("728349872").matches();
        System.out.println(result2);

        // matches 메서드를 통해 결과를 얻을 수도 있다
        boolean result3 = Pattern.matches("^[0-9]*$", "728349872");
        System.out.println(result3);
    }
}
