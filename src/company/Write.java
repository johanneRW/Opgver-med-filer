package company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Write {
    public static void main(String[] args) throws FileNotFoundException {

        //Opgave 1
        File file = new File("data/random.text");
        PrintStream ps = new PrintStream(new FileOutputStream(file, true));

        System.out.println("gæt et tal mellem 1-5 (et helt tal), hvor få gæt kan du nøjes med? ");

        Random rand = new Random();
        int number = rand.nextInt(5) + 1;
        //udskriv det tilfældige nummer under test
        //System.out.println(number);
        int guess = 0;
        int count = 0;

        while (number != guess) {
            count++;
            Scanner in = new Scanner(System.in);
            guess = in.nextInt();
            if (number == guess) {
                System.out.println("Hurra!! - Du gættede rigtigt!!");
            } else {
                if (number > guess) {
                    System.out.println("Du gættede for lavt- prøv igen");
                } else {
                    if (number < guess) {
                        System.out.println("Du gættede for højt - prøv igen");
                    }
                }
            }
        }
        ps.println(count);
        System.out.println(count);
        ps.close();


        //opgave2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvad skal din fil hedde?");
        String filNavn = scanner.nextLine();

        File file2 = new File("data/" + filNavn + ".text");
        PrintStream printS = new PrintStream(new FileOutputStream(file2, true));

        System.out.println("Skriv nu dit digt, når du er færdig, afslut ved at skrive \"quit\"");
        boolean done = false;
        while (!done) {
            String digt = scanner.nextLine();
            if (digt.equals("quit")) {
                done = true;
            } else {
                printS.println(digt);
            }
        }
    }
}