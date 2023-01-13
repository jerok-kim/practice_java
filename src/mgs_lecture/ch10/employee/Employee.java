package mgs_lecture.ch10.employee;

import java.util.Date;

public class Employee extends Object {
    public String name;
    public double salary = 40000;
    public Date birthDate;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {
    }

    public String getDetails() {
        return "Name : " + name + "\nSalary : " + salary;
    }
}
