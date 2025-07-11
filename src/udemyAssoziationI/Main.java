package udemyAssoziationI;

public class Main {

    public static void main(String[] args) {

        Auto bmw = new Auto("Goodyear", "Sommerreifen", "BMW");
        Auto vw = new Auto("Michellin", "Winterreifen", "VW");

        bmw.ausgabeDaten();
        vw.ausgabeDaten();
    }
}
