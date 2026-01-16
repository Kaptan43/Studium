package scheckheft;

public class ServiceArbeit {
    private ServiceArbeitTyp serviceArbeitTyp;
    private boolean erledigt;
    private ProduktInfo produktInfo;
    private String notizen;

    public ServiceArbeit(ServiceArbeitTyp serviceArbeitTyp, boolean erledigt, ProduktInfo produktInfo, String notizen) {
        this.serviceArbeitTyp = serviceArbeitTyp;
        this.erledigt = false;
        this.produktInfo = null;
        this.notizen = "";
    }

    public ServiceArbeitTyp getServiceArbeitTyp() {
        return serviceArbeitTyp;
    }

    public boolean isErledigt() {
        return erledigt;
    }

    public ProduktInfo getProduktInfo() {
        return produktInfo;
    }

    public String getNotizen() {
        return notizen;
    }

    public void setErledigt(boolean erledigt) {
        this.erledigt = erledigt;
    }

    public void setProduktInfo(ProduktInfo produktInfo) {
        if (!isErledigt()) {
            this.produktInfo = null;
        }
        this.produktInfo = produktInfo;
    }

    public void setNotizen(String notizen) {
        this.notizen = notizen;
    }

}
