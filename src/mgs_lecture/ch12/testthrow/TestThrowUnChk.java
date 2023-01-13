package mgs_lecture.ch12.testthrow;

public class TestThrowUnChk {
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("투표 자격 없음");
        } else {
            System.out.println("투표 자격 있음");
        }
    }

    // main method
    public static void main(String[] args) {
        validate(13);
        System.out.println("나머지 코드...");
    }
}