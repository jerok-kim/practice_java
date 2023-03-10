package mgs_online.ch01_java_basic;

public class SwitchCaseUpTest {
    public static void main(String[] args) {
        int month = 3;
        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> {
                System.out.println("존재하지 않는 달 입니다.");
                yield -1;
            }
        };

        System.out.println(month + "월은 " + day + "일 입니다.");
    }
}
