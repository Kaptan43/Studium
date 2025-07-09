package udemy;

public class Laptop {
    private int ram;
    private int preis;
    private String marke;

    public Laptop(int ram, int preis, String marke) {
        this.ram = ram;
        this.preis = preis;
        this.marke = marke;
    }

    public void ausgabe(){
        System.out.println("Laptop Marke: " + this.marke + " Preis: " + this.preis + " Ram: " + this.ram);
    }
}
