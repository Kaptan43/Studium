package udemyAssoziationI;

public class Auto {

    private String autoMarke;

    Reifen reifen;

    public Auto(){

    }

    public Auto(String autoMarke, Reifen reifen) {
        this.autoMarke = autoMarke;
        this.reifen = reifen;
    }

    public Auto(String reifenMarke, String reifenTyp, String autoMarke) {
        reifen = new Reifen(reifenMarke, reifenTyp);
        this.autoMarke = autoMarke;
    }
}
