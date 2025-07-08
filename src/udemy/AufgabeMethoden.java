package udemy;

public class AufgabeMethoden {

    public static void main(String[] args) {
        double ergebnis = multiply(3.547, 6.354);
        System.out.println("Ergebnis: " + ergebnis);

    }

    public static double multiply(double a, double b) {
        double ergebnis = a*b;

        return ergebnis;
    }
}
