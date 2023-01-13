package mgs_lecture.ch11.nestedinf;

interface Printable {
    void print();

    interface MessagePrintable {
        void msg();
    }
}