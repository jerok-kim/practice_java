package mgs_lecture.ch10.instance_of;

class Animal {}

class Dog extends Animal {
    static void method(Animal a) {
        if(a instanceof Dog) {
            Dog dog = (Dog) a;  // downcasting
            System.out.println("다운캐스팅 가능");
        }
    }

    public static void main(String[] args) {
        // Dog d = new Animal();  // 컴파일 에러
        
        // 컴파일은 성공했지만 실행 시 ClassCastException이 throw된다
        // Dog d = (Dog) new Animal();
        
        Animal a = new Dog();
        Dog.method(a);
    }
}
