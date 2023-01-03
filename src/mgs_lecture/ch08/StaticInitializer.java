package mgs_lecture.ch08;

public class StaticInitializer {
    static int age = 10;

    static {
        System.out.println("#1 static initializer 진입");  // 1
        System.out.println("#2 static age 변수 접근 = " + age);  // 2
        // afterVar 변수가 미리 선언되어 있지 않아 Compile Error 발생
        // System.out.println("static afterVar is " + afterVar);
    }

    static int afterVar = 20;

    StaticInitializer() {
        System.out.println("#6 생성자 호출");  // 6
    }

    static {
        System.out.println("#3 두번째 static initializer 진입");  // 3
    }

    public static void main(String[] args) {
        System.out.println("#5 메인메서드 시작");  // 5
        StaticInitializer s = new StaticInitializer();
        System.out.println("#7 생성자 호출 후 초기화된 Non-static 변수 접근 : " + s.nonStaticVar);
    }

    static {
        System.out.println("#4 세번째 static initializer 진입");  // 4
    }

    int nonStaticVar;
}
