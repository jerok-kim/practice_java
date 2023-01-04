package mgs_lecture.ch09;

public class Elevator {
    private boolean doorOpen = false;
    private int floor = 1;
    private int weight = 0;
    
    final int CAPACITY = 1000;
    final int TOP_FLOOR = 5;
    final int BOTTOM_FLOOR = 1;
    final String MUSIC = "Lyle Lovett";
    
    public void openDoor() {
        doorOpen = true;
    }
    
    public void closeDoor() {
        checkWeightSensors();
        
        if(weight <= CAPACITY) {
            doorOpen = false;
        } else {
            // The computer beeps 10 times
            for(int counter = 0; counter<10;counter++) {
                System.out.println((char) 7);
            }
            System.out.println();
        }
    }
    
    private void checkWeightSensors() {
        weight = (int) (Math.random() * 1500);
        System.out.println("The weight is " +weight);
    }
    
    public void goUp() {
        if(!doorOpen) {
            if(floor<TOP_FLOOR) {
                floor++;
                System.out.println(floor);
            }else {
                System.out.println("Already on top floor.");
            }
        }else {
            System.out.println("Doors still open!");
        }
    }
}
