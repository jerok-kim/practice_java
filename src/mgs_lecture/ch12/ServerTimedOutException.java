package mgs_lecture.ch12;

public class ServerTimedOutException extends Exception {
    private int port;

    public ServerTimedOutException(String message, int port) {
        // Exception 클래스에 예외 메시지 전달을 위해 super를 이용하여 상위 생성자 호출
        super(message);
        this.port = port;
    }

    public int getPort() {
        return port;
    }
}