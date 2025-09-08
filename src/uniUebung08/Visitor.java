package uniUebung08;

public interface Visitor<T> {

    Integer visitImage(Image image);
    Integer visitParagraph(Paragraph paragraph);
    Integer visitSection(Section section);
    Integer visitBook(Book book);

}
