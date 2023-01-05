package mgs_online.ch04_java_useful_classes.sec04;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class c1 = Class.forName("mgs_online.ch04_java_useful_classes.sec04.Person");

        Person person = (Person) c1.newInstance();

        person.setName("Lee");
        System.out.println(person);

        Class c2 = person.getClass();
        Person p = (Person) c2.newInstance();

        System.out.println(p);
    }
}
