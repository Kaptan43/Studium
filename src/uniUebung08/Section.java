package uniUebung08;

import java.util.List;

public class Section implements TextComponent{

    private String header;
    private List<TextComponent> contents;

    public Section(String header, List<TextComponent> contents) {
        this.header = header;
        this.contents = contents;
    }

    public List<TextComponent> getContents() {
        return contents;
    }

    @Override
    public int countWords() {
        int counter = 0;
        for (TextComponent tc : contents) {
            counter += tc.countWords();
        }
        return counter;
    }

    @Override
    public Integer accept (Visitor visitor){
        return (Integer) visitor.visitSection(this);
    }

}
