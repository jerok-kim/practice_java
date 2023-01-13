package mgs_lecture.homework.ch10.homework김형준1;

public class TextDocument extends Document {

    public TextDocument(Contents contents) {
        this.contents = contents;
    }

    @Override
    public void printHeader() {
        System.out.println("================= *텍스트 문서 입니다* =================");
        System.out.print("제목 : ");
        System.out.println("\t[" + this.contents.header + "]");
    }

    @Override
    public void printBody() {
        System.out.println("본문 :");
        System.out.println();
        System.out.println(this.contents.body);
    }

    @Override
    public void printFooter() {
        System.out.println();
        System.out.print("작성자 : ");
        System.out.println(this.contents.footer);
        System.out.println("=====================================================");
    }
}
