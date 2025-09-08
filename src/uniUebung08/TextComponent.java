package uniUebung08;

public interface TextComponent {

    public int countWords();

    public <Integer> Integer accept(Visitor<Integer> visitor);

}
