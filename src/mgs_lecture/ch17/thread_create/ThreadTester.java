package mgs_lecture.ch17.thread_create;

public class ThreadTester {
    public static void main(String[] args) {
        HelloRunner r = new HelloRunner();
        Thread t = new Thread(r);
        t.start();
    }
}

class HelloRunner implements Runnable {
    int i;

    @Override
    public void run() {
        i = 0;
        while (true) {
            System.out.println("Hello " + i++);
            if (i == 30) {
                break;
            }
        }
    }
}