package udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person{

    private String name;

    public Person(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

}

public class Lambda {

    public static void main(String[] args) {

        List<Person> personenListe = new ArrayList<>();

        //Die ausführliche Schreibweise mit Collections --> also Allgemein (egal ob List, Set, Map)
        Collections.sort(personenListe, (Person p1, Person p2) -> { return p1.getName().compareTo(p2.getName());});

        //Eine etwas verkürzte Schreibweise ohne Collections, hier gehen wir direkt auf die vorhandene personenListe zu.
        personenListe.sort((Person p1, Person p2) -> p1.getName().compareTo(p2.getName()));

        //Stark verkürzte Version des Lambda-Ausdrucks in der allgemeinen Collections.
        Collections.sort(personenListe, (p1, p2) -> p1.getName().compareTo(p2.getName()));
    }
}
