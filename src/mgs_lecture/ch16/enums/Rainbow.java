package mgs_lecture.ch16.enums;

public enum Rainbow {
    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);

    // 인스턴스 변수 선언
    private final int value;

    // 생성자 선언
    Rainbow(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
