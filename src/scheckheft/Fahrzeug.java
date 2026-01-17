package scheckheft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Fahrzeug {
    private final String id;
    private String kennzeichen;
    private String hersteller;
    private String modell;
    private String kraftstoff;
    private List<InspektionsEintrag> inspektionen;

    public Fahrzeug(String id, String kennzeichen, String hersteller, String modell, String kraftstoff) {
        this.id = id;
        this.kennzeichen = kennzeichen;
        this.hersteller = hersteller;
        this.modell = modell;
        this.kraftstoff = kraftstoff;
        this.inspektionen = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModel() {
        return modell;
    }

    public String getKraftstoff() {
        return kraftstoff;
    }

    public List<InspektionsEintrag> getInspektionen() {
        return Collections.unmodifiableList(inspektionen);
    }

    public void setKennzeichen(String kennzeichen){
        this.kennzeichen = kennzeichen;
    }

    public void addInspektion(InspektionsEintrag inspektion){
        inspektionen.add(inspektion);
    }

    public boolean removeInspektion(String id){
        return inspektionen.removeIf(inspektion -> inspektion.getId().equals(id)); //ToDo --> Habe ich nicht selber geschrieben, verstehen, was hier genau passiert und ob es das gewünschte Ergebnis liefert!
    }

    public List<InspektionsEintrag> getInspektionsEintragSortiertNachDatum(){
        return inspektionen.stream().sorted(Comparator.comparing(InspektionsEintrag::getDatum)).toList();
    }

    public InspektionsEintrag getLetzteInspektion(){
        return inspektionen.get(inspektionen.size()-1); //ToDo --> Habe ich nicht selber geschrieben, verstehen, was hier genau passiert!
    }

    public abstract FahrzeugArt getFahrzeugArt();

}
