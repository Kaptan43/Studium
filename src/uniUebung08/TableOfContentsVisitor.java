package uniUebung08;

import java.util.List;

public class TableOfContentsVisitor implements Visitor<List<String>> {

    @Override
    public Integer visitImage(Image image) {
        return 0;
    }

    @Override
    public Integer visitParagraph(Paragraph paragraph) {
        return 0;
    }

    @Override
    public Integer visitSection(Section section) {
        return 0;
    }

    @Override
    public Integer visitBook(Book book) {
        return 0;
    }

}