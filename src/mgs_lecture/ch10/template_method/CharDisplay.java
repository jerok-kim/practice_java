package mgs_lecture.ch10.template_method;

public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.print(">>");
    }

    public static void main(String[] args) {
        CharDisplay ch = new CharDisplay('@');
        ch.display();
    }
}