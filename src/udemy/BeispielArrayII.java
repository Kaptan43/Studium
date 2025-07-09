package udemy;

import java.util.Scanner;

public class BeispielArrayII {

    public static void main(String[] args) {

        String[] fragen = {"Wie viel ist 5+4 ?", "Wie viel ist 3*5 ?"};
        int[] antworten = {9, 15};

        int count = 0;
        while (count < fragen.length) {
            System.out.println(fragen[count]);

            Scanner sc = new Scanner(System.in);
            int eingabeUser = sc.nextInt();

            if (eingabeUser == antworten[count]) {
                System.out.println("Richtig!");
                count++;
            }
            else {
                System.out.println("Ihre Antwort ist falsch!");
            }
        }
    }
}
