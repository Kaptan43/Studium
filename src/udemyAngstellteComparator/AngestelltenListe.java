package udemyAngstellteComparator;

import java.util.*;

class SortiereAngestelltenID implements Comparator<Angestellter>{

    @Override
    public int compare(Angestellter o1, Angestellter o2) {
        if(o1.getId() > o2.getId()){
            return 1;
        }
        else if(o1.getId() < o2.getId()){
            return -1;
        }
        else{
            return 0;
        }
    }
}

class SortiereAngestelltenName implements Comparator<Angestellter>{

    @Override
    public int compare(Angestellter o1, Angestellter o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortiereAngestelltenGeburtsjahr implements Comparator<Angestellter>{

    @Override
    public int compare(Angestellter o1, Angestellter o2) {
        if(o1.getGeburtsjahr() > o2.getGeburtsjahr()){
            return 1;
        }
        else if(o1.getGeburtsjahr() < o2.getGeburtsjahr()){
            return -1;
        }
        else{
            return 0;
        }
    }
}

public class AngestelltenListe {

    public static void main(String[] args) {

        List<Angestellter> angestelltenListe = new ArrayList<>();

        addAngestellter(3, angestelltenListe);

        System.out.println("Sortiert nach ID: ");
        Collections.sort(angestelltenListe, new SortiereAngestelltenID());

//        System.out.println("Sortiert nach Name: ");
//        Collections.sort(angestelltenListe, new SortiereAngestelltenName());
//
//        System.out.println("Sortiert nach Geburtsjahr: ");
//        Collections.sort(angestelltenListe, new SortiereAngestelltenGeburtsjahr());

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
