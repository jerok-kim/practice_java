package mgs_lecture.ch08;

public class Company {
    private static Company instance;
    private String name;

    /**
     * Company 인스턴스를 얻을 수 있는 유일한 메서드
     * @return
     */
    public static Company getInstance() {
        return new Company();
    }
    
    // 생성자는 private 접근제한자로 선언하여
    // 외부에서 객체 생성을 차단한다
    private Company() {}
}

class CompanySingletonTest {
    public static void main(String[] args) {
        // 생성자 접근이 안된다
        // Company c = new Company();
        Company c = Company.getInstance();
    }
}