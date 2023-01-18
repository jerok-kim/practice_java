package playground.ex_polymorphism;

public abstract class Beverage {
    public String name;
    
    protected int price;
    static int amount;
    static int totalSales;

    protected Beverage() {
    }
    
    
    void setPrice(int price) {
        this.price = price;
    }
    
    abstract void calcPrice();
    
    void print() {
        System.out.println("총 판매 금액==>" + totalSales);
    }
    
}
