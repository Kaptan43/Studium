package udemyArrayList;

import java.util.ArrayList;
import java.util.List;

public class Smartphone {

    private List<Kontakt> meineKontakte;

    public Smartphone(){
        meineKontakte = new ArrayList<Kontakt>();
    }

    public boolean addKontakt(Kontakt neuKontakt){
        for(Kontakt kontakt : meineKontakte){
            if(kontakt.getName().equals(neuKontakt.getName()) && kontakt.getTelefonNummer().equals(neuKontakt.getTelefonNummer())){
                System.out.println("Kontakt " + neuKontakt.getName() + " ist bereits vorhanden!");
                return false;
            }
        }
        meineKontakte.add(neuKontakt);
        System.out.println("Kontakt wurde hinzugefügt!");
        return true;
    }

    public boolean findKontakt(String name) {
        for (Kontakt kontakt : meineKontakte) {
            if (name.equals(kontakt.getName())) {
                System.out.println("Kontakt " + name + " ist vorhanden! Die zugehörige Telefonnumer lautet: " + kontakt.getTelefonNummer());
                return true;
            }
        }
        System.out.println("Kontakt " + name + " ist nicht vorhanden!");
        return false;
    }


    public void ausgabe(){
        for(Kontakt kontakt: meineKontakte){
            System.out.println("Name: "  + kontakt.getName() + " \nTelefonnummer: " + kontakt.getTelefonNummer() + "\n");
        }
    }

}
