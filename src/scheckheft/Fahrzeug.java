package scheckheft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Fahrzeug {
    private final String id;
    private String kennzeichen;
    private String hersteller;
    private String modell;
    private String kraftstoff;
    private List<InspektionsEintrag> inspektionen;

    public Fahrzeug(String kennzeichen, String hersteller, String modell, String kraftstoff) {
        //ToDo --> ID initialisieren! --> Ich möchte hier das Format verwenden FahrzeugTyp-LaufendeNr (also für ein Motorrad z.B.: M-0001). Diese soll einzigartig sein!
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
        return inspektionen;
    } //ToDo --> Fehler beheben!

    public void setKennzeichen(String kennzeichen){
        this.kennzeichen = kennzeichen;
    }

    public void addInspektion(InspektionsEintrag inspektion){
        inspektionen.add(inspektion);
    }

    public boolean removeInspektion(String id){
        return inspektionen.removeIf(inspektion -> inspektion.getId().equals(id)); //ToDo --> Habe ich nicht selber geschrieben, verstehen, was hier genau passiert und ob es das gewünschte Ergebnis liefert!
    }

    public List<InspektionsEintrag> getInspektionen(){
        return inspektionen;
    } //ToDo --> Fehler beheben!

    public List<InspektionsEintrag> getInspektionsEintragSortiertNachDatum(){
        return inspektionen.sort(Comparator.comparing(InspektionsEintrag::getDatum)); //ToDo --> Habe ich nicht selber geschrieben, verstehen, was hier genau passiert und ob es das gewünschte Ergebnis liefert!
    }

    public InspektionsEintrag getLetzteInspektion(){
        return inspektionen.getLast(); //ToDO --> Liefert es das gewünschte Ergebnis?
    }

    /*ToDo --> Was soll dieses hier genau machen und brauche ich dafür eine neue Abstrakteklasse?
        public abstract FahrzeugArt getFahrzeugArt(){
        return FahrzeugArt;
        }
     */
}
