package mgs_lecture.homework.ch10.homework김형준1;

public abstract class Document {

    protected Contents contents;

    abstract void printHeader();

    abstract void printBody();

    abstract void printFooter();

    public final void printDocument() {
        printHeader();
        printBody();
        printFooter();
    }
}
