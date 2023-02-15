import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;


public class starter {
    public static void main(String[] args) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get("ergebnis.txt")));

        } catch (IOException e) {
            System.out.println("Die Datei konnte nicht gelesen werden.");
        }
        System.out.println(content);

        try {
            long lineCount = Files.lines(Paths.get("ergebnis.txt")).count();
            long Zeilen = lineCount -2;
            System.out.println("Anzahl der Zeilen: " + Zeilen);
        } catch (IOException e) {
            System.out.println("Die Datei konnte nicht gelesen werden.");
        }

    }
}
