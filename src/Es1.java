import java.util.Random;

public class Es1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int ore = rand.nextInt(24) + 1;
        double tariffaA = 15;
        double tariffaB = ore * 1.0;
        double tariffaC = ore > 1 ? (ore - 1) * 1.2 : 0;

        System.out.println("Ore di parcheggio: " + ore);
        
        double minTariffa = tariffaA;
        String sceltaTariffa = "A";

        if (tariffaB < minTariffa) {
            minTariffa = tariffaB;
            sceltaTariffa = "B";
        }
        if (tariffaC < minTariffa) {
            minTariffa = tariffaC;
            sceltaTariffa = "C";
        }

        System.out.println("La tariffa più conveniente è: " + sceltaTariffa + " con un costo di " + minTariffa + " euro.");
    }
}