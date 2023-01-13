package mgs_online.ch05_java_data_structures.t_extends;

public class Powder extends Material {

    public void doPrinting() {
        System.out.println("Powder 재료로 출력합니다");
    }

    public String toString() {
        return "재료는 Powder 입니다";
    }

}