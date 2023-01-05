package mgs_online.ch03_oop_essential.sec04;

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();

        System.out.println("=================");
        
        Car mCar = new ManualCar();
        mCar.run();
    }
}