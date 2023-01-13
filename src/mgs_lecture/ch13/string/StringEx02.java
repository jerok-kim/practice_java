package mgs_lecture.ch13.string;

public class StringEx02 {
    public static void main(String args[]){
        String s = new String("ABCDEFGH");
        System.out.println(s.charAt(4)); // E
        System.out.println(s.compareTo("ABCDEFGH")); // 0
        System.out.println(s.compareToIgnoreCase("abcdefgh")); // 0
        System.out.println(s.concat("abc")); // ABCDEFGHabc
        System.out.println(s.endsWith("FGH")); // true
        System.out.println(s.equals("ABCDEFGH")); // true
        System.out.println(s.equalsIgnoreCase("abcdefgh")); // true

        s = new String("This is a String");
        System.out.println(s.indexOf("i")); // 2
        System.out.println(s.indexOf("i", 7)); // 13
        System.out.println(s.indexOf("is")); // 2
        System.out.println(s.lastIndexOf("is")); // 5
        System.out.println(s.length()); // 16
        System.out.println(s.replace('i', 'Q')); // ThQs Qs a StrQng
        System.out.println(s.replaceAll("is", "IS")); // thIS IS a String
        System.out.println(s.startsWith("This")); // true
        System.out.println(s.substring(5)); // is a String
        System.out.println(s.substring(5, 13)); // is a Str
        System.out.println(s.toLowerCase()); // this is a string
        System.out.println(s.toUpperCase()); // THIS IS A STRING
    }
}
