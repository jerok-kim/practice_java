package mgs_lecture.homework.ch10.homework김형준1;

public class DocumentTest {
    public static void main(String[] args) {

        String header = "템플릿 메서드 패턴을 알아보자";
        String body = """
                템플릿 메서드는 부모 클래스에서 알고리즘의 골격을 정의하지만,
                해당 알고리즘의 구조를 변경하지 않고
                자식 클래스들이 알고리즘의 특정 단계들을
                오버라이드(재정의)할 수 있도록 하는 행동 디자인 패턴입니다.
                """;
        String footer = "김자바 기자  grab@java.com";

        Contents contents = new Contents(header, body, footer);

        Document textDocument = new TextDocument(contents);
        textDocument.printDocument();

        Document htmlDocument = new HTMLDocument(contents);
        htmlDocument.printDocument();

    }
}