package udemy;

import java.util.Scanner;

public class AufgabeVerzweigung {
    public static void main(String[] args) {
        System.out.println("Wieviele Bundesländer gibt es in Deutschland?");

        String a = "a: 15";
        String b = "b: 20";
        String c = "c: 16";
        String d = "d: 30";

        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);

        System.out.println("Bitte geben Sie Ihre Antwort ein: ");

        Scanner sc = new Scanner(System.in);
        char antwort = sc.next().charAt(0);
        sc.close();

        if(antwort == 'c'){
            System.out.println("Ihre Antwort ist korrekt!");
        }
        else if(antwort == 'a' || antwort == 'b' || antwort == 'd'){
            System.out.println("Ihre Antwort ist falsch!");
        }
        else{
            throw new IllegalArgumentException("Die Eingabe muss entweder a, b, c oder d sein");
        }
    }
}
