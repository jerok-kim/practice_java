package mgs_online.ch02_oop_basic.question;

public class PersonTest {
    public static void main(String[] args) {
        System.out.println(Person.person.id + Person.person.name);

        Person person1 = new Person(1, "홍길동");
        System.out.println(person1.id + person1.name);

        Person person2 = new Person(2, "임꺽정");
        System.out.println(person1.id + person1.name);
        System.out.println(person2.id + person2.name);

        System.out.println(Person.person.id + Person.person.name);

        Person person5 = new Person(5, "오태식");
        System.out.println(person5.id + person5.name);
        System.out.println(Person.person.id + Person.person.name);
    }
}