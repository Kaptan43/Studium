package udemyAngstellteComparator;

public class Angestellter {

    private int id;
    private String name;
    private int geburtsjahr;

    public Angestellter(int id, String name, int geburtsjahr) {
        this.id = id;
        this.name = name;
        this.geburtsjahr = geburtsjahr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public String toString() {
        return "Name: " + this.name + "\nGeburtsjahr: " + this.geburtsjahr + "\nID: " + this.id;
    }
}
