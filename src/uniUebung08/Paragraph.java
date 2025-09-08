package uniUebung08;

public class Paragraph implements TextComponent {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public int countWords(){
        int counter = 0;

        for(int i = 0; i < this.text.length(); i++){
            char c = text.charAt(i);
            if(Character.isAlphabetic(c)){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public Integer accept(Visitor visitor) {
        return (Integer) visitor.visitParagraph(this);
    }

//    public int countWords11(){
//        return text.split(" ").length;
//    }

}
