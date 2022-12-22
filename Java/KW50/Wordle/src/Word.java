import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Word {
    public static final String RED = "\u001B[41m";
    public static final String GREEN = "\u001B[42m";
    public static final String RESET = "\u001B[0m";
    public static final String Black = "\u001B[30m";
    public static final String YELLOW = "\u001B[43m";


    public String randomword() throws Exception {
        ArrayList<String> words = new ArrayList<String>();

        File doc =
                new File("C:\\Github\\BLJ2022RuSch\\Java\\KW50\\Wordle\\wordlist.txt");
        Scanner obj = new Scanner(doc);

        while (obj.hasNextLine()) {
            words.add(obj.nextLine());
        }
        String secretWord = words.get((int) (Math.random() * words.size()));
         secretWord = secretWord.toLowerCase();



        Scanner userinput = new Scanner(System.in);
boolean win = false;

        for (int k = 0; k < 6 ; k++) {
            System.out.print("Type in a word with 5 letters: ");
        String word = userinput.nextLine();
        if (word.length()==5) {
            for (int i = 0; i < secretWord.length(); i++) {
                if (word.charAt(i) == secretWord.charAt(i)) {
                    System.out.print(Black + GREEN + " " + secretWord.charAt(i) + " " + RESET + " ");
                } else {
                    boolean contains = false;
                    for (int j = 0; j < secretWord.length(); j++) {
                        if (secretWord.charAt(j) == word.charAt(i)) {
                            contains = true;
                            break;
                        }
                    }
                    if (contains) {
                        System.out.print(Black + YELLOW + " " + word.charAt(i) + " " + RESET + " ");
                    } else {
                        System.out.print(Black + RED + " " + word.charAt(i) + " " + RESET + " ");

                    }
                }
            }
        }else {
            System.out.println("Your Input isn't valid!");
        }
        if (secretWord.equals(word)){
            System.out.println("\n\n Congratulations, You won!");
            win = true;
            break;
        }
        }
        if (!win) {
            System.out.println("\nL bozzo, You lost, the word was \"" + secretWord+ "\"");
        }

        return words.get((int) (Math.random() * words.size()));

    }


public void PrintTitle(){
    System.out.println("+----------------------------+");
    System.out.println("|  WELCOME TO MY WORDL GAME  |");
    System.out.println("+----------------------------+");

}

}
