package mgs_online.ch03_oop_essential.ex01;

public class GoldCustomer extends Customer {

    double salesRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        salesRatio = 0.1;
        bonusdRatio = 0.02;
        customerGrade = "GOLD";
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusdRatio;
        price -= (int) (price * salesRatio);
        return price;
    }
}