package mgs_online.ch02_oop_basic.ex03;

public class Employee {
    private static int serialNum = 1000;

    private int emplyeeId;
    private String emplyeeName;
    private String department;
    
    public Employee() {
        serialNum++;
        emplyeeId = serialNum;
    }
    
    public static int getSerialNum() {
        int i = 0;
        
        return serialNum;
    }

    public int getEmplyeeId() {
        serialNum = 1000;
        return emplyeeId;
    }

    public void setEmplyeeId(int emplyeeId) {
        this.emplyeeId = emplyeeId;
    }

    public String getEmplyeeName() {
        return emplyeeName;
    }

    public void setEmplyeeName(String emplyeeName) {
        this.emplyeeName = emplyeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
