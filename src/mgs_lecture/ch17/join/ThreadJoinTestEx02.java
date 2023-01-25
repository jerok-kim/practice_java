package mgs_lecture.ch17.join;

public class ThreadJoinTestEx02 {
    static long startTime = 0;

    public static void main(String[] args) {
        JoinThread01 th1 = new JoinThread01();
        JoinThread02 th2 = new JoinThread02();

        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {

        }

        System.out.print("소요시간: " + (System.currentTimeMillis() - ThreadJoinTestEx02.startTime));
    }
}

class JoinThread01 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("-"));
        }
    }
}

class JoinThread02 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("|"));
        }
    }
}