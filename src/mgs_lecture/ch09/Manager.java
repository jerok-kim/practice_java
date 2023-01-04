package mgs_lecture.ch09;

public class Manager extends Employee {
    public String department;

    public Manager(String name, double salary, String dept) {
        super(name, salary);
        department = dept;
    }

    public Manager(String name, String dept) {
        super(name);
        department = dept;
    }

    public Manager(String dept) {
        super();
        department = dept;
    }

    public Manager() {
    }

    public String getDetails() {
        return super.getDetails() + "\nDepartment: " + department;
    }
}
