package mgs_lecture.ch13.string;

public class StringEx01 {
    public static void main(String[] args) {
        // String s1 = "java";
        //
        // char ch[] = {'g', 'i', 'l', 'd', 'o', 'n', 'g'};
        // String s2 = new String(ch);
        // String s3 = new String("새로운 문자열");
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);

        String strVar1 = "a".concat("bc");
        String strVar2 = "ab" + "c";

        System.out.println(strVar1 == strVar2);
        System.out.println(strVar1.equals(strVar2));

        // String strVar1 = "a" + "bc";
        // String strVar2 = "ab" + "c";
        //
        // System.out.println(strVar1 == strVar2);
        // System.out.println(strVar1.equals(strVar2));

        // String strVar3 = new String("a" + "bc");
        // String strVar4 = new String("ab" + "c");

        // System.out.println(strVar1 == strVar2);
        // System.out.println(strVar1.equals(strVar2));
        
        String ss = "  s v sd ";
        System.out.println(ss.trim());
    }
}
