package es4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Metodo: Conto alla rovescia");
        System.out.println("Inserisci i secondi di lancio:");
        int secondiInseriti = Integer.parseInt(scanner.nextLine());

        if (secondiInseriti < 0) {
            secondiInseriti = Math.abs(secondiInseriti);// converto il valore negativo
            System.out.println(secondiInseriti);
        }
        if (secondiInseriti > 20) {
            secondiInseriti = 20; // forzo i numeri oltre al 20, ad avere valore 20
            System.out.println(secondiInseriti);
        }

        String risultato = coutdown(secondiInseriti);
        System.out.println(risultato);

    }

    public static String coutdown(int secondi) {
        StringBuilder inserisci = new StringBuilder();

        for (int i = secondi; i >= 1; i--) {
            if (i % 2 == 0) {
                inserisci.append("[OK]").append(i).append("\n");
            } else {
                inserisci.append("[CHECK]").append(i).append("\n");
            }
            if (i == 10) {
                inserisci.append("--- SEPARAZIONE STADIO ---\n");
            }
        }
        inserisci.append("--- IGNITION ---");
        return inserisci.toString();
    }
}
