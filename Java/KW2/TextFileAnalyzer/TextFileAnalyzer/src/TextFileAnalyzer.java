import java.io.IOException;
import java.sql.Date;
import java.util.Formatter;
import java.time.*;
import java.util.Scanner;

public class TextFileAnalyzer {
    int count = 0;
    public void PrintFunction() throws IOException {
        Scanner myObj = new Scanner(System.in);

        FileHandler fh = new FileHandler();
        fh.File();
        Formatter format = new Formatter();

        System.out.println("-----------------------------------------------");
        System.out.println("[ "+ Date.from(Instant.now())+" ] [ script.txt ]");
        System.out.println("-----------------------------------------------");
        System.out.println("Total number of words:\t\t"+fh.words.size());
        System.out.println("Number of unique words:\t\t"+fh.filler.size());
        System.out.println("Most common word:\t\t\t'"+fh.line+"'");
        System.out.println("_______________________________________________");
        System.out.println(" ");


        boolean weiter = true;
        while (true) {
            System.out.println("Which word do you want check:");
            String userinput = myObj.nextLine();
count = 0;
            for (int i = 0; i < fh.words.size(); i++) {
                if (userinput.equals(fh.words.get(i))) {
                    count++;
                }
            }
            System.out.println(userinput + ":\t\t\t" + count);

            System.out.println("<q> quit    <c> continue");
            String cont = myObj.nextLine();
            if (cont.equals("q")){
                System.out.println("Thanks that you used my programm, have a good day");
                weiter = false;
                break;

            }
        }
    }
}
