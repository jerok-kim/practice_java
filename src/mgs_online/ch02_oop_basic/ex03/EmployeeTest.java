package mgs_online.ch02_oop_basic.ex03;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmplyeeName("이순신");
        System.out.println(Employee.getSerialNum());

        Employee employeeKim = new Employee();
        employeeKim.setEmplyeeName("김유신");

        System.out.println(employeeLee.getEmplyeeName() + "님의 사번은 " + employeeLee.getEmplyeeId());
        System.out.println(employeeKim.getEmplyeeName() + "님의 사번은 " + employeeKim.getEmplyeeId());
    }
}
