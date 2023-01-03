package mgs_lecture.ch08;

public class Count {
    private int serialNumber;
    private static int counter = 0;
    
    public Count() {
        counter++;
        serialNumber = counter;
    }
    
    public static int getTotalCount() {
        return counter;
    }
}