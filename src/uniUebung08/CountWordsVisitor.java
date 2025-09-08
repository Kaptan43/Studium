package uniUebung08;

public class CountWordsVisitor implements Visitor<Integer> {


    @Override
    public Integer visitImage(Image image) {
        return 0;
    }

    @Override
    public Integer visitParagraph(Paragraph paragraph) {
        if(paragraph.getText() == null){
            return 0;
        }
        int counter = 0;

        for(int i = 0; i < paragraph.getText().length(); i++){
            char c = paragraph.getText().charAt(i);
            if(Character.isAlphabetic(c)){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public Integer visitSection(Section section) {
        int counter = 0;
        //ToDo
        for (TextComponent tc : section.getContents()){
            counter += tc.accept(this);
        }
        return counter;
    }

    @Override
    public Integer visitBook(Book book){
        int counter = 0;
        for(TextComponent tc : book.getContents()){
            counter += tc.countWords();
        }
        return counter;
    }

}
