package company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

    public static void main(String[] args) {

        //opgave 1
        File file = new File("data/data.txt");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Prøv igen:)" + e.getMessage());
        }
        while (scanner.hasNextLine()) {

            String linje = scanner.nextLine();
            String[] ordListe = linje.split(" ");
            for (int i = 0; i < ordListe.length; i++) {
                String ord = ordListe[i];
                if (ord.length() > 4)
                    System.out.print(ordListe[i].toUpperCase() + " ");
                else System.out.print(ordListe[i] + " ");
            }
            System.out.println();
        }

        //Opgave 2

        File file2 = new File("data/DMI.txt");

        try {
            scanner = new Scanner(file2);
        } catch (FileNotFoundException e) {
            System.out.println("Prøv igen:)" + e.getMessage());
        }
        int count = 0;
        double sum = 0.0;
        while (scanner.hasNext()) {
            String byNavn = scanner.next();
            count++;
            while (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            }
        }
        double gennemsnit = sum / count;
        System.out.printf("\nGennemsnitstemperatur = %.0f", gennemsnit);
    }
}
