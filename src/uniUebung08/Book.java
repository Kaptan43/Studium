package uniUebung08;

import org.w3c.dom.css.Counter;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String  title;
    private String author;
    private List<TextComponent> contents;

    public Book(String title, String author, List<TextComponent> contents) {
        this.title = title;
        this.author = author;
        this.contents = contents;
    }

    public List<TextComponent> getContents() {
        return contents;
    }

    public int countWords(){
        //ToDO --> Fertig
        int counter = 0;
        for(TextComponent tc : contents){
            counter += tc.countWords();
        }
        return counter;
    }

    public Integer accept(Visitor<Integer> visitor) {
        //ToDo --> Fertig
        return (Integer) visitor.visitBook(this);
    }

    public Integer countWordsByVisitor(){
        //ToDo --> Fertig
       CountWordsVisitor countWordsVisitor = new CountWordsVisitor();
       return this.accept(countWordsVisitor);
    }

    public List<String> tableOfContents() {
        //ToDo
        return null;
    }

    public boolean toText() {
        //ToDo
        return false;
    }
}
