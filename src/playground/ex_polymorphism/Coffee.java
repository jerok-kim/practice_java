package playground.ex_polymorphism;

public class Coffee extends Beverage {

    static int amount;

    Coffee(String name) {
        this.name = name;
        Coffee.amount++;
        Beverage.amount++;
    }

    @Override
    void calcPrice() {
        switch (this.name) {
            case "Americano" -> this.setPrice(1500);
            case "CafeLatte" -> this.setPrice(2500);
            case "Cappuccino" -> this.setPrice(3000);
        }
        Beverage.totalSales += this.price;
    }

    @Override
    void print() {
        System.out.println(Beverage.amount + "번째 판매 음료는 " + this.name + "이며, 가격은 " + this.price);
        System.out.println();
    }
}
