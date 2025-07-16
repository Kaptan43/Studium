package udemySamsungVererbungUndInterface;

public class GalaxyJ3 extends Samsung implements ITelefon {

    public GalaxyJ3(double preis, String produktTyp){
        super(preis, produktTyp);
    }

    @Override
    public void powerOn() {
        System.out.println("Galaxy J3 powerOn");
    }

    @Override
    public void esKlingelt() {
        System.out.println("Galaxy J3 esKlingelt");
    }

    @Override
    public void anrufen() {
        System.out.println("Galaxy J3 anrufen");
    }

}
