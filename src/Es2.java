import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci la somma di denaro da prelevare: ");
        int somma = in.nextInt();

        int banconote50 = 0;
        int banconote20 = 0;

        if (somma >= 50) {
            banconote50 = somma / 50;
            somma = somma % 50;
        }

        if (somma >= 20) {
            banconote20 = somma / 20;
            somma = somma % 20;
        }

        int totaleEmesso = (banconote50 * 50) + (banconote20 * 20);

        System.out.println("Banconote da 50 emesse: " + banconote50);
        System.out.println("Banconote da 20 emesse: " + banconote20);
        System.out.println("Totale emesso: " + totaleEmesso + " euro");

        if (totaleEmesso != somma + (banconote50 * 50 + banconote20 * 20)) {
            System.out.println("Non è stato possibile emettere la somma esatta.");
        }

        in.close();
    }
}
