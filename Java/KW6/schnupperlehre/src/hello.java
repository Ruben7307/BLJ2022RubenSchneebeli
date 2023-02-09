import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        while (true) {
        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int Zahl= scan.nextInt();
        int numSum = Zahl + 5;
        if(Zahl == 8) {
            System.out.println("Ja");
        }
        else if (Zahl == 9) {
            System.out.println("Falsch");
        }
        else {
            System.out.println("Fehler");
        }


        System.out.println(Zahl+numSum);
        }
    }
}
