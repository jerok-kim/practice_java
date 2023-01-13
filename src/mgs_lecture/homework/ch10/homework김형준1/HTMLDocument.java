package mgs_lecture.homework.ch10.homework김형준1;

public class HTMLDocument extends Document {

    public HTMLDocument(Contents contents) {
        this.contents = contents;
    }

    @Override
    public void printHeader() {
        System.out.println("<head>");
        System.out.println("\t<title>" + this.contents.header + "</title>");
        System.out.println("</head>");
    }

    @Override
    public void printBody() {
        String[] lines = this.contents.body.split("\n");
        System.out.println("<body>");

        for (String line : lines) {
            System.out.println("\t" + line);
        }

        System.out.println("</body>");
    }

    @Override
    public void printFooter() {
        System.out.println("<footer>");
        System.out.println("\t<p>" + this.contents.footer + "</p>");
        System.out.println("</footer>");
    }
}
