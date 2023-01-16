package mgs_lecture.ch14.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcherEx1 {
    public static void main(String[] args) {
        // 숫자만 있는지 확인
        Pattern pattern = Pattern.compile("^[0-9]*$");
        String str = "728349872";

        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.find());
    }
}
