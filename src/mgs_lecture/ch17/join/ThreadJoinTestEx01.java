package mgs_lecture.ch17.join;

public class ThreadJoinTestEx01 {
    public static void main(String[] args) {
        JoinThread jt = new JoinThread();
        jt.start();
        try {
            jt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread Finish");
    }
}

class JoinThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("join Thread");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}