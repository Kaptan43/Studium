package uniUebung08;

public interface Visitor<Integer> {

    Integer visitImage(Image image);
    Integer visitParagraph(Paragraph paragraph);
    Integer visitSection(Section section);
    Integer visitBook(Book book);

}
