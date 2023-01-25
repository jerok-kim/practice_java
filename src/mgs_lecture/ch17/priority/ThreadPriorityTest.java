package mgs_lecture.ch17.priority;

public class ThreadPriorityTest {
    
    public void run() {
        System.out.println("in run() method");
    }

    public static void main(String[] args) {
        ThreadPriorityEx t1 = new ThreadPriorityEx();
        ThreadPriorityEx t2 = new ThreadPriorityEx();
        ThreadPriorityEx t3 = new ThreadPriorityEx();
        
        // 스레드의 우선순위는 기본값인 5이다
        System.out.println("t1의 우선순위 : "+t1.getPriority());
        System.out.println("t2의 우선순위 : "+t2.getPriority());
        System.out.println("t3의 우선순위 : "+t3.getPriority());
        
        // 우선순위 변경
        t1.setPriority(6);
        t2.setPriority(3);
        t3.setPriority(9);

        System.out.println("t1 스레드 우선순위 : "+t1.getPriority());
        System.out.println("t2 스레드 우선순위 : "+t2.getPriority());
        System.out.println("t3 스레드 우선순위 : "+t3.getPriority());

        System.out.println("현재 실행중인 스레드 : "+Thread.currentThread().getName());
        System.out.println("메인 스레드의 우선순위 : "+Thread.currentThread().getPriority());
        
        // 메인스레드 우선순위 10으로 변경
        Thread.currentThread().setPriority(10);
        System.out.println("메인 스레드 우선순위 : "+Thread.currentThread().getPriority());
    }
}
