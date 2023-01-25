package mgs_lecture.ch16.annotation;

import java.lang.reflect.Method;

// Applying annotation
class Hello {
    // Importing annotation on a method display()
    @Student(firstName = "Ivann", lastName = "Sagar", rollNo = 20)
    public void display() {
        System.out.println("Hello annotation");
    }
}

public class TestCustomAnnotation {
    public static void main(String[] args) throws NoSuchMethodException {
        Hello h = new Hello();  // Creating object of class Hello
        h.display();  // Calling method of Hello class

        Method m = h.getClass().getMethod("display");
        Student st = m.getAnnotation(Student.class);

        System.out.println("First name: " + st.firstName());
        System.out.println("Last name: " + st.lastName());
        System.out.println("Roll number: " + st.rollNo());

    }
}
