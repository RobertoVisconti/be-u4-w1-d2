package es1;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Metodo: Stringa Pari Dispari***");
        System.out.println("Inserisci una parola o una frase:");
        String testoInserito = scanner.nextLine();

        String res = stringaPariDispari(testoInserito);
        System.out.println("La stringa inserita è: " + res);

        System.out.println("*** Metodo: Anno Bisestile***");
        System.out.println("Inserisci un anno:");
        int annoInserito = Integer.parseInt(scanner.nextLine());
        String risultato = annoBisestile(annoInserito);
        System.out.println("L'anno è:" + " " + risultato);
    }

    // Metodo Stringa Pari Dispari
    public static String stringaPariDispari(String testo) {
        if (testo == null) return "Testo non valido";
        return (testo.length() % 2 == 0) ? "Pari" : "Dispari";
    }

    // Metodo Anno Bisestile
    public static String annoBisestile(int anno) {
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
            return "Bisestile";
        } else {
            return "Non Bisestile";
        }
    }

}
