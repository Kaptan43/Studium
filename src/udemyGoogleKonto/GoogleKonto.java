package udemyGoogleKonto;

import java.util.Scanner;

public class GoogleKonto {

    private String name;
    private String passwort;

    public GoogleKonto(String name, String passwort) {
        this.name = name;
        this.passwort = passwort;
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

    public void setPasswort(String passwort) {
        if(passwort.equals(this.passwort)) {
            System.out.println("Passwort ist richtig!");
            System.out.println("Bitte geben Sie das neue Passwort ein: ");
            Scanner sc = new Scanner(System.in);
            String newPw = sc.nextLine();
            this.passwort = newPw;
            System.out.println("Das neue Passwort lautet: " +  this.passwort);
        }
        else {
            throw new IllegalArgumentException("Passwort ist nicht richtig!");
        }
    }
}
