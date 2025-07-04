package udemy;

import java.util.Scanner;

public class UebungEinlesen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Alter eingeben: ");
        int alter = sc.nextInt();
        System.out.println("Dein Geschlecht (m oder w) eingeben: ");
        char geschlecht = sc.next().charAt(0);

        sc.nextLine(); //Zeilenumbruch damit alles wie gewhont funktioniert. Ohne diesen Zeilenumbruch wird der Puffer nicht entfernt und der Code funktioniert nicht, wie er soll. ODER: Anstelle von nextLine() beim Namen nur next() benutzen.

        System.out.println("Namen eingeben: ");
        String name = sc.nextLine();

        System.out.println("Dein Name ist: " + name + " und dein Alter ist: " + alter + ", dein Geschlecht ist: " + geschlecht + ".");
        sc.close();
    }
}
