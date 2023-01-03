package mgs_online.ch02_oop_basic.question;

public class Person {
    public static int id;

    public String name;
    
    public Person() {}
    
    public Person(int id, String name) {
        Person.id = id;
        this.name = name;
    }
    
    // Person person = new Person();  // stack overflow
    // Person person = new Person(5, "오달수");  // stack overflow
    // private Person person = new Person(6, "육개장");  // stack overflow
    
    static Person person = new Person(5, "오태식");
}