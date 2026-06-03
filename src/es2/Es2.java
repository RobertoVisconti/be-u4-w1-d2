package es2;

import java.util.Scanner;

public class Es2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Metodo : Switch Numero Lettere*** ");
        System.out.println("Inserisci un numero intero tra 0 e 3");
        int numero = Integer.parseInt(scanner.nextLine());
        String risultato = convertiInLettere(numero);
        System.out.println("Il risultato convertito è:" + " " + risultato);

    }

    // Metodo Converti in lettere
    public static String convertiInLettere(int num) {
        String risposta;

        switch (num) {
            case 0 -> risposta = "Zero";
            case 1 -> risposta = "Uno";
            case 2 -> risposta = "Due";
            case 3 -> risposta = "Tre";
            default -> risposta = "Numero inserito non valido";
        }
        return risposta;
    }
}

