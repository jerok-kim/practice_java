package mgs_lecture.homework.ch08.김형준1;

public class Order {
    Person person;
    Menu menu;

    Order(Person person, Menu menu) {
        this.person = person;
        this.menu = menu;
    }

    boolean validatePayment(int balance) {
        if (balance < this.menu.getMenuPrice()) {
            return false;
        } else {
            person.pay(this.menu.getMenuPrice());
            return true;
        }
    }

    void showOrderResult(Order order, boolean paymentResult) {
        if (paymentResult) {
            System.out.println("정상 주문");
            System.out.println(order.menu.toString() + "를 주문하셨습니다!");
            System.out.println("잔액은 "+ this.person.getBalance() +"입니다!");
        } else {
            System.out.println("잔액 부족");
            System.out.println(order.menu.toString() + "를 주문하셨습니다!");
            System.out.println("잔액이 부족합니다!");
        }
    }
}
