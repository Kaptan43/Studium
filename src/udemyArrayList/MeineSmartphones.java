package udemyArrayList;

public class MeineSmartphones {

    public static void main(String[] args) {

        Smartphone iphone6 = new Smartphone();

        iphone6.addKontakt(Kontakt.erstelleKontakt("Emre", "0123456789"));
        iphone6.addKontakt(Kontakt.erstelleKontakt("Mehmet", "9876543210"));
        iphone6.addKontakt(Kontakt.erstelleKontakt("Korkmaz", "5432167890"));

        //Müsste einen Fehler ausgeben:
        iphone6.addKontakt(Kontakt.erstelleKontakt("Korkmaz", "5432167890"));

        iphone6.ausgabe();

        System.out.println("Suchen...");
        iphone6.findKontakt("Emre");
    }
}
