package mgs_lecture.ch10.abstract_class;

public class EABike extends AbstractBike {

    @Override
    void run() {
        System.out.println("Running!");
    }

    public static void main(String[] args) {
        AbstractBike bike = new EABike();
        bike.run();
    }
}