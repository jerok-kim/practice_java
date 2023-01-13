package mgs_lecture.ch12;

public class ExceptionUserDefined {
    public void connect(String serverName) throws ServerTimedOutException {
        boolean success;
        int port = 80;

        success = open(serverName, port);
        if (!success) {
            throw new ServerTimedOutException("연결할 수 없습니다", port);
        }
    }

    public boolean open(String serverName, int port) {
        // method body
        return false;
    }

    public void findServer() {
        try {
            connect("ProductServer");
        } catch (ServerTimedOutException se) {
            System.out.println("서버 접속시간 초과, 대체 서버 시도");
            try {
                connect("AlterProductServer");
            } catch (ServerTimedOutException rse) {
                System.out.println("Error : " + rse.getMessage() +
                        " 포트에 연결 " + rse.getPort());
            }
        }
    }

    public static void main(String[] args) {
        ExceptionUserDefined e = new ExceptionUserDefined();
        e.findServer();
    }
}
