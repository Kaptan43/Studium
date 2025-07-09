package udemy;

public class Main {

    public static void main(String[] args) {

        Laptop samsungLaptop = new Laptop(8, 600, "Samsung");
        Laptop medionLaptop = new Laptop(4, 400, "Medion");

        samsungLaptop.ausgabe();
        medionLaptop.ausgabe();
    }

}
