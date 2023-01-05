package mgs_online.ch03_oop_essential.ex01;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

    // public VIPCustomer() {
    //
    //     super(0, "no-name");
    //
    //     bonusdRatio = 0.05;
    //     salesRatio = 0.1;
    //     customerGrade = "VIP";
    // }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusdRatio = 0.05;
        salesRatio = 0.1;
    }

    public String getAgentID() {
        return agentID;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusdRatio;
        price -= (int) (price * salesRatio);
        return price;
    }
}