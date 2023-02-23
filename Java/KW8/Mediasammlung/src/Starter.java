import java.util.ArrayList;
import java.util.SplittableRandom;

public class Starter {
    public static void main(String[] args) {

        ArrayList<Media> arrayList = new ArrayList<Media>();

        Book b = new Book("Harry Potter 1", "2001", "JK Rowling", 451, "Carlsen");
        Game g = new Game("Minecraft", "2011", "Notch", "Everyone");
        Movie y = new Movie("Avengers Endgame", "2019", "Disney", "Robert Downoey Jr.", "Action", 12);
        CD c = new CD("Mamma mia", "2008", "ABBA", "ABBA", "0");

        arrayList.add(b);
        arrayList.add(g);
        arrayList.add(y);
        arrayList.add(c);

        System.out.println("--------------------------------------\n");

        for (Media m : arrayList){
            m.printinfo();
            System.out.println("\n");
            System.out.println("--------------------------------------");
            System.out.println("\n");
        }
    }
}
