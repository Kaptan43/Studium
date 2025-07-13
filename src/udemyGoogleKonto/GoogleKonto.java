package udemyGoogleKonto;

import java.util.Scanner;

public class GoogleKonto {

    private String name;
    private String passwort;
    private String altesPasswort;

    public GoogleKonto(String name, String passwort) {
        this.name = name;
        this.passwort = passwort;
        this.altesPasswort = " ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswort() {
        return passwort;
    }


    //Kompliziertere Methode

    Scanner sc = new Scanner(System.in);

    public void altesPasswort(){
        System.out.println("Altes passwort eingeben: ");
        this.altesPasswort = sc.nextLine();
    }

    public void setPasswort() {
        altesPasswort();
        if(this.altesPasswort.equals(this.passwort)) {
            System.out.println("Passwort ist richtig!");
            System.out.println("Bitte geben Sie das neue Passwort ein: ");
            String newPw = sc.nextLine();
            this.passwort = newPw;
            System.out.println("Das neue Passwort lautet: " +  this.passwort);
            sc.close();
        }
        else {
            throw new IllegalArgumentException("Passwort ist nicht richtig!");
        }
    }

    //Einfachere Methode:

//    public void setPasswort() {
//        System.out.println("Altes Passwort eingeben: ");
//        Scanner sc = new Scanner(System.in);
//        String eingabe = sc.nextLine();
//
//        if (eingabe.equals(this.passwort)) {
//            System.out.println("Passwort ist richtig!");
//            System.out.println("Bitte geben Sie das neue Passwort ein: ");
//            String newPw = sc.nextLine();
//            this.passwort = newPw;
//            System.out.println("Das neue Passwort lautet: " +  this.passwort);
//        } else {
//            throw new IllegalArgumentException("Passwort ist nicht richtig!");
//        }
//        sc.close();
//    }


}
