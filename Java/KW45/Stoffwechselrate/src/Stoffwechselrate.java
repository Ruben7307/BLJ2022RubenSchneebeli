import java.util.Scanner;


public class Stoffwechselrate {
    public static void main(String[] args) {
        double m = 58;
        double l = 180;
        double t = 25;

        System.out.println("Stoffwechsel Männer: " + (66.47+13.7*m+5*l-6.8*t) + " Kalorien pro Tag");
        System.out.println("Stoffwechsel Frauen: " + (655.1+9.6*m+1.8*l-4.7*t) + "Kalorien pro Tag");



    }
}
