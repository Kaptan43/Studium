package scheckheft;

public enum ServiceArbeitTyp {
    OEL_Wechsel,
    OEL_Filter_Wechsel,
    LUFT_Filter_Wechsel,
    BREMSFLUESSIGKEIT_Wechsel,
    ZUENDKERZEN_Wechsel,
    KUEHLFLUESSIGKEIT_Wechsel,
    REIFEN_Wechsel,
    INSPEKTION_GENERAL;

    public String getDisplayName(){
        return this.name();
    }
}
