package mgs_online.ch04_java_useful_classes.sec03;

public class TextBlockTest {
    public static void main(String[] args) {
        String textBlocks = """
                Hello,
                hi,
                how r u
                                
                bye
                """;
        System.out.println(textBlocks);
        System.out.println(getBlockOfHtml());
    }

    public static String getBlockOfHtml() {
        return """
                <html>
                                
                    <body>
                        <span>example text</span>
                    </body>
                </html>
                """;
    }
}
