package InlamningsuppgiftAyler;

import java.util.Scanner;

//Uppgift: En Main-class
public class WordReader {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        WordCalculator wC = new WordCalculator();
        //Uppgift: Läsa in text rad för rad till användaren skriver "stop".
        System.out.println();
        System.out.print("Skriv din text nedan och avsluta med ordet stopp: ");

        String line;
        while (true) {
            line = scan.nextLine();
            if (wC.stoppkontroll(line)){
                break;
            }
            wC.addWord(line);
        }
        //Uppgift: Skriva ut resultat till användaren.
        //Skriva ut antal ord, tecken, rader.
        //Skriva ut längsta ordet.
        System.out.println("Antal ord är: " + wC.getWordCalc());
        System.out.println("Antal tecken är: " + wC.getCharCalc());
        System.out.println("Antal rader är: " + wC.getLineCalc());
        System.out.println("Textens längsta ord är: " + wC.getlongestWord());
    }
}
