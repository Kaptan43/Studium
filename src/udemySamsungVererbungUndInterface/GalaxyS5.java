package udemySamsungVererbungUndInterface;

public class GalaxyS5 extends Samsung implements ITelefon{

    private String farbe;

    public GalaxyS5(double preis, String produkTyp, String farbe){
        super(preis,produkTyp);
        this.farbe = farbe;
    }

    @Override
    public void powerOn(){
        System.out.println("Galaxy S5 powerOn");
    }

    @Override
    public void esKlingelt(){
        System.out.println("Galaxy S5 esKlingelt");
    }

    @Override
    public void anrufen(){
        System.out.println("Galaxy S5 anrufen");
    }


}
