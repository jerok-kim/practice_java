package mgs_lecture.ch11.flyerinf;

public class TestFlyer {
    public static void main(String[] args) {
        Flyer f1 = new Bird();
        Flyer f2 = new Airplain();
        Flyer f3 = new Superman();
        f1.fly();
        f2.fly();
        f3.fly();

        Flyer[] flyers = new Flyer[3];
        flyers[0] = new Bird();
        flyers[1] = new Airplain();
        flyers[2] = new Superman();

        for (int i = 0; i < flyers.length; i++) {
            flyers[i].land();
        }

    }
}
