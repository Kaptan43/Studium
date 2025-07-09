package udemy;

import java.util.Scanner;

public class BeispielArrayI {

    public static void main(String[] args){

        int [] lottozahlen = new int[6];

        for(int i=0; i < lottozahlen.length; i++) {
            System.out.println(i+1 + ". Lottozahl eingeben ");
            Scanner sc = new Scanner(System.in);
            int zahlUser = sc.nextInt();
            lottozahlen[i] = zahlUser;
        }
        System.out.println("Eingabe abgeschlossen! \n");

        System.out.println("Ihre Eingaben: ");
        for(int i=0; i < lottozahlen.length; i++) {
            System.out.println(lottozahlen[i]);
        }

    }

}
