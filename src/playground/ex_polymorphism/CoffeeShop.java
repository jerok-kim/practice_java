package playground.ex_polymorphism;

public class CoffeeShop {
    public static void main(String[] args) {

        opening();

        Beverage coffee1 = new Coffee("Cappuccino");
        coffee1.calcPrice();
        coffee1.print();

        Beverage coffee2 = new Coffee("CafeLatte");
        coffee2.calcPrice();
        coffee2.print();

        Beverage tea1 = new Tea("ginsengTea");
        tea1.calcPrice();
        tea1.print();

        Beverage coffee3 = new Coffee("CafeLatte");
        coffee3.calcPrice();
        coffee3.print();

        Beverage tea2 = new Tea("redginsengTea");
        tea2.calcPrice();
        tea2.print();

        printTotalSales();
        printCoffeeSales();
        printTeaSales();


    }

    public static void opening() {
        System.out.println();
        System.out.println("****java nara CoffeeShop영업개시****");
        System.out.println();
    }

    public static void printTotalSales() {
        System.out.println("총 판매 금액==>" + Beverage.totalSales);
        System.out.println();
    }

    public static void printCoffeeSales() {
        System.out.println("Coffe의 판매 개수=>" + Coffee.amount + "잔");
        System.out.println();
    }

    public static void printTeaSales() {
        System.out.println("Tea의 판매 개수=>" + Tea.amount + "잔");
        System.out.println();
    }


}
