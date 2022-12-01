import java.util.Scanner;

public class Schaltjahr {
    public static boolean isSchaltjahr ( int year)
    {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Bitte Jahr eingeben");
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        if (isSchaltjahr(y)) System.out.print("true");

        else System.out.print(" false");



    }
}


