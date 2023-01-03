package mgs_online.ch02_oop_basic.ex01;

public class OrderTest {
    public static void main(String[] args) {
        Person tomas = new Person("Tomas", 37, 180, 78, Gender.male);

        Order order1 = new Order(202011020003L, 01023450001, "서울시 강남구 역삼동 111-333", 20201102, 130258, 35000, 0003);
        order1.showOrderInfo();
    }
}
