package mgs_lecture.homework.ch13;

public class Ch13Homework김형준1 {

    public static void main(String[] args) {

        String string = "안녕하세요!";
        System.out.println(string);
        System.out.println(string.replace("안녕하세요", "반갑습니다"));
        System.out.println();
        StringBuffer stringBuffer = new StringBuffer(string.substring(0, 2));
        System.out.println(stringBuffer.append("1"));
        System.out.println(stringBuffer.replace(2, 3, "i"));
        System.out.println();
        System.out.println(new StringBuffer("12").insert(1, stringBuffer.deleteCharAt(2)));
        System.out.println(stringBuffer.append("12"));
        System.out.println(stringBuffer.replace(0, 2, "hello"));
        String hello = stringBuffer.toString().toUpperCase();
        System.out.println(hello);
        System.out.println(hello.contains("HELL"));
        System.out.println(hello.length());
        System.out.println(hello.substring(hello.indexOf("EL"), "EL".length() + 1));
        
    }

}
