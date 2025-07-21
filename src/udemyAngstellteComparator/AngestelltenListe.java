package udemyAngstellteComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class AngestelltenListe {

    public static void main(String[] args) {

        List<Angestellter> angestelltenListe = new ArrayList<>();

        addAngestellter(3, angestelltenListe);

        getAngestellter2(angestelltenListe);

    }

    public static void addAngestellter(int anzahl, Collection<Angestellter> col) {
        for (int i = 1; i <= anzahl; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bitte Namen eingeben: ");
            String name = sc.nextLine();
            System.out.println("Geburtsjahr eingeben: ");
            int geburtsjahr = sc.nextInt();
            System.out.println("ID eingeben: ");
            int id = sc.nextInt();

            Angestellter angestellter = new Angestellter(id, name, geburtsjahr);
            col.add(angestellter);
        }

    }

    public static void getAngestellter(Collection<Angestellter> col) {
        for (Angestellter angestellter : col) {
            System.out.println("Angestellter: ");
            System.out.println(angestellter);
        }
    }

    public static void getAngestellter2(Collection<Angestellter> col) {
        for (Angestellter angestellter : col) {
            System.out.println("Angestellter: \n");
            System.out.println("Name: " +  angestellter.getName() + "\nGeburtsjahr: " + angestellter.getGeburtsjahr() + "\nID: " + angestellter.getId() + "\n");
        }
    }

}
