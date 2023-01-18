package playground.ex_polymorphism;

public class Tea extends Beverage {
    static int amount;
    
    Tea(String name) {
        this.name = name;
        Tea.amount++;
        Beverage.amount++;
    }
    
    @Override
    void calcPrice() {
        switch (this.name) {
            case "lemonTea" -> this.setPrice(1500);
            case "ginsengTea" -> this.setPrice(2000);
            case "redginsengTea" -> this.setPrice(2500);
        }
        Beverage.totalSales += this.price;
    }

    @Override
    void print() {
        System.out.println(Beverage.amount + "번째 판매 음료는 " + this.name + "이며, 가격은 " + this.price);
        System.out.println();
    }
}
