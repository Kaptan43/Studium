package udemySamsungVererbungUndInterface;

public class Main {

    public static void main(String[] args) {

        GalaxyJ3 peterGalaxyJ3 = new GalaxyJ3(500, "Smartphone");
        GalaxyS5 emreGalaxyS5 = new GalaxyS5(750, "Smartphone", "Schwarz");

        peterGalaxyJ3.powerOn();

        emreGalaxyS5.powerOn();

    }
}
