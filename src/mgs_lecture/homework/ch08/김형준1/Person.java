package mgs_lecture.homework.ch08.김형준1;

public class Person {
    private String personName;
    private int balance;

    Person(String personName, int balance) {
        this.personName = personName;
        this.balance = balance;
    }

    void makeOrder(Order order) {
        boolean paymentResult = order.validatePayment(this.balance);
        order.showOrderResult(order, paymentResult);
    }
    
    void pay(int menuPrice) {
        this.balance -= menuPrice;
    }
    
    int getBalance() {
        return balance;
    }
}
