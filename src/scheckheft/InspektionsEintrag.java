package scheckheft;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InspektionsEintrag {
    private final String id;
    private LocalDate datum;
    private int kilometerstand;
    private String notizen;
    private List<ServiceArbeit> arbeiten;

    public InspektionsEintrag(LocalDate datum, int kilometerstand, String notizen) {
        if (datum == null || kilometerstand <= 0) {
            throw new IllegalArgumentException("Datum kann nicht leer sein und der Km-Stand darf nicht kleiner oder gleich 0 sein.");
        }
        //ToDO --> ID muss noch initialisiert werden! Ich möchte hier eine ID haben, die mit einer laufenden Nr vergeben wird und einzigartig ist.
        this.datum = datum;
        this.kilometerstand = kilometerstand;
        this.notizen = notizen;
        arbeiten = new ArrayList<>();
    }

    public String getId() {
        return id;
    }
    public LocalDate getDatum() {
        return datum;
    }
    public String getKilometerstand() {
        return kilometerstand;
    }
    public String getNotizen() {
        return notizen;
    }
    public List<ServiceArbeit> getArbeiten() {
        return arbeiten;
    }

    public void setNotizen(String notizen) {
        this.notizen = notizen;
    }

    public void addArbeit(ServiceArbeit arbeit) {
        arbeiten.add(arbeit);
    }

    public boolean removeArbeit(ServiceArbeit arbeit) {
        return arbeiten.remove(arbeit);
    }

    public ServiceArbeit getArbeit(ServiceArbeitTyp ServiceArbeittyp) {
        return arbeiten.getFirst(); //ToDo --> Das muss noch angepasst werden!
    }

    public boolean hatArbeit(ServiceArbeitTyp ServiceArbeitTyp) {
        return arbeiten.contains(ServiceArbeitTyp); //ToDo --> Überprüfen, ob dies genau das tut, was ich will!
    }

    public List<ServiceArbeit> getErledigteArbeiten() {
        return arbeiten.stream().filter(ServiceArbeit::isErledigt).toList(); //ToDo --> Habe ich nicht selber geschrieben, verstehen, was hier genau passiert und ob es das gewünschte Ergebnis liefert!
    }

    public List<ServiceArbeit> getAusstehendeArbeiten() {
        return arbeiten.stream().filter(sa -> !sa.isErledigt()).toList(); //ToDo --> Habe ich nicht selber geschrieben, verstehen, was hier genau passiert und ob es das gewünschte Ergebnis liefert!
    }
}
