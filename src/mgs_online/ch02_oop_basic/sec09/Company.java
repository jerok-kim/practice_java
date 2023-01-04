package mgs_online.ch02_oop_basic.sec09;

public class Company {

    private static Company instance = new Company();

    private Company() {
    }

    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }

}
