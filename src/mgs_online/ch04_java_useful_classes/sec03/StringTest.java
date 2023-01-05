package mgs_online.ch04_java_useful_classes.sec03;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);

        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        java = java.concat(android);
        System.out.println(java);
        System.out.println(System.identityHashCode(java));
    }
}
