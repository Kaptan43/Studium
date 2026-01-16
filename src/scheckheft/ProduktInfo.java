package scheckheft;

public class ProduktInfo {
    private String hersteller;
    private String produktName;
    private String spezifikation;

    public ProduktInfo(String hersteller, String produktName, String specifikation) {
        if(hersteller == null || produktName == null){
            throw new NullPointerException("Die einzelnen Felder, außer die Spezifikation, müssen ausgefüllt sein!");
        }
        this.hersteller = hersteller;
        this.produktName = produktName;
        this.spezifikation = specifikation;
    }

    public String getHersteller() {
        return hersteller;
    }
    public String getProduktName() {
        return produktName;
    }
    public String getSpezifikation() {
        return spezifikation;
    }
}
