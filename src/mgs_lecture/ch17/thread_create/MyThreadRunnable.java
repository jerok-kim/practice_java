package mgs_lecture.ch17.thread_create;

public class MyThreadRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable 구현 run() 메서드 실행");
    }

    public static void main(String[] args) {
        Runnable r1 = new MyThreadRunnable();
        Thread th1 = new Thread(r1, "Runnable 인스턴스를 전달받아 새로운 thread 생성");
        th1.start();
        String str = th1.getName();
        System.out.println(str);
    }
}
