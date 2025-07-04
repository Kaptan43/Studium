package udemy;

import java.util.Scanner;

public class VerzweigungSwitch {

    public static void main(String[] args) {
        System.out.println("Wieviele Bundesländer hat Deutschland?");

        String a = "a: 15";
        String b = "b: 20";
        String c = "c: 16";
        String d = "d: 38";

        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);

        System.out.print("Bitte geben Sie Ihre Antwort ein: ");

        Scanner sc = new Scanner(System.in);
        char eingabe = sc.next().charAt(0);
        sc.close();

        switch(eingabe) {
            case 'a':{
                System.out.println("Ihre Antwort ist falsch!");
            }
            break;
            case 'b':{
                System.out.println("Ihre Antwort ist falsch!");
            }
            break;
            case 'c':{
                System.out.println("Ihre Antwort ist richtig!");
            }
            break;
            case 'd':{
                System.out.println("Ihre Antwort ist falsch!");
            }
            break;
            default:{
                System.out.println("Ihre Antwort muss entweder a, b, c oder d sein");
            }

        }
    }
}
