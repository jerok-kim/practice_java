// package mgs_online.ch02_oop_basic.ex04;
//
// public class CarFactoryTest {
//    
//     /// 자동차 공장이 있습니다.
//     /// 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는 제작될 때마다 고유의 번호가 부여됩니다.
//     /// 자동차 번호가 10000부터 시작되어 자동차가 생산될 때마다 10002, 10003 이렇게 번호가 붙도록
//     /// 자동차 공장 클래스, 자동차 클래스를 구현하세요
//     public static void main(String[] args) {
//         Carfactory factory = Carfactory.getInstance();
//         Car mySonata = factory.createCar();
//         Car yourSonata = factory.createCar();
//
//         System.out.println(mySonata.getCarNum());    // 10001 출력
//         System.out.println(yourSonata.getCarNum());  // 10002 출력
//     }
// }
