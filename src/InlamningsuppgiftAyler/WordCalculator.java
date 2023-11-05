package InlamningsuppgiftAyler;

//Uppgift: En Logic-class
public class WordCalculator {
    private int wordCalc;
    private int lineCalc;
    private int charCalc;
    private String longestWord;

    public WordCalculator() {
        wordCalc = 0;
        lineCalc = 0;
        charCalc = 0;
        longestWord = "";
    }

    //Uppgift: Kontrollen för att ha koll på om användaren har skrivit ordet stop eller inte.
    public boolean stoppkontroll(String line) {
        return line.equalsIgnoreCase("stop");
    }

    //Uppgift: Räkna antalet rader och tecken.
    public void addWord(String line) {
        charCalc += line.length();
        lineCalc++;

        //Uppgift: Skriva ut antal ord (separerade med blanksteg)
        String [] ord = line.split(" ");
        wordCalc += ord.length;

        //Uppgift: Ha koll på det längsta ordet
        for (String word : ord) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }

        }
    }
    public int getWordCalc(){
        return wordCalc;
    }
    public int getLineCalc() {
        return lineCalc;
    }
    public int getCharCalc() {
        return charCalc;
    }
    public String getlongestWord() {
        return longestWord;
    }
}
