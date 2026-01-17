package scheckheft;

public class Auto extends Fahrzeug {

    public Auto(String id, String kennzeichen, String hersteller, String modell, String kilometerstand, String kraftstoff) {
        super(id, kennzeichen, hersteller, modell, kraftstoff);
    }

    @Override
    public FahrzeugArt getFahrzeugArt(){
        return FahrzeugArt.Auto;
    }

}
