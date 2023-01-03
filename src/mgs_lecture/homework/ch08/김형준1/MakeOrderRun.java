package mgs_lecture.homework.ch08.김형준1;

public class MakeOrderRun {
    public static void main(String[] args) {
        

        // "진양철" 10000원 -> 커피(1000원 주문) -> 정상주문, 잔액 9000 출력
        Person jinYangCheol = new Person("진양철", 10000);
        Order orderJinYangCheol = new Order(jinYangCheol, Menu.COFFEE);
        jinYangCheol.makeOrder(orderJinYangCheol);
        

        // "진도준" 2000원 -> 빵(3000원 주문) -> 잔액부족 출력
        Person jinDoJun = new Person("진도준", 2000);
        Order orderJinDoJun = new Order(jinDoJun, Menu.BREAD);
        jinDoJun.makeOrder(orderJinDoJun);
        
        
    }
}
