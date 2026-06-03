package es3;

import java.util.Scanner;

public class Es3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("*** Metodo: Separa paoloa***");
        System.out.println("Digita una parola per dividerla, per uscire inserire :q");
        while (true) {
            System.out.println("Inserisci una parola:");
            String input = scanner.nextLine();
            if (input.equals(":q")) {
                break;
            }

            String risultato = dividiParola(input);
            System.out.println("La parola divisa è:" + " " + risultato);
        }
        System.out.println("Programma concluso");

    }

    public static String dividiParola(String testo) {
        String risultato = "";
        int i = 0;

        while (i < testo.length()) {
            risultato += testo.charAt(i);

            if (i < testo.length() - 1) {
                risultato += ",";
            }
            i++;
        }
        return risultato;
    }
}
