package mgs_lecture.ch17.priority;

public class ThreadPriorityEx extends Thread {
    public void run() {
        System.out.println("in run() method");
    }

    public static void main(String[] args) {
        System.out.println("메인 스레드 현재 우선순위: " + Thread.currentThread().getPriority());

        // 메인 스레드의 우선순위를 7로 설정한다
        Thread.currentThread().setPriority(7);

        // currentThread() 메서드를 사용해서
        // 현재 스레드를 찾아서 getPriority()로 우선순위를 얻는다
        System.out.println("메인 스레드 변경된 우선순위: " + Thread.currentThread().getPriority());

        ThreadPriorityEx t = new ThreadPriorityEx();

        // t 스레드는 메인스레드의 child 스레드이기 때문에 우선순위도 7이다
        System.out.println("스레드 t의 우선순위: " + t.getPriority());
        t.start();
    }
}
