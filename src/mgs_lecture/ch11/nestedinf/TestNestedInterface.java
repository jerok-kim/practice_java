package mgs_lecture.ch11.nestedinf;

interface Showable {
    void show();

    // 중첩 인터페이스 Message
    interface Message {
        void msg();
    }
}

class TestNestedInterface implements Showable.Message {
    @Override
    public void msg() {
        System.out.println("안녕! nested interface");
    }

    public static void main(String[] args) {
        Showable.Message message = new TestNestedInterface();
        message.msg();
    }
}