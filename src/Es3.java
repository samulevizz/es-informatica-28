import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci il numero di ore di parcheggio: ");
        int ore = in.nextInt();

        System.out.print("Inserisci la tariffa (A, B, C o D): ");
        char tariffa = in.next().charAt(0);

        double costo = 0;
        boolean tariffaValida = true;

        if (tariffa == 'A') {
            costo = 15;
        } else if (tariffa == 'B') {
            costo = ore * 1.0;
        } else if (tariffa == 'C') {
            costo = ore > 1 ? (ore - 1) * 1.2 : 0;
        } else if (tariffa == 'D') {
            if (ore <= 4) {
                costo = 7;
            } else {
                costo = 7 + (ore - 4) * 0.8;
            }
        } else {
            tariffaValida = false;
            System.out.println("Errore: Tariffa non valida.");
        }

        if (tariffaValida) {
            System.out.println("Il costo totale è: " + costo + " euro");
        }
        
        in.close();
    }
}