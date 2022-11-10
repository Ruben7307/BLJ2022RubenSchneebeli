import static java.lang.Math.PI;
import static java.lang.Math.pow;


public class Baumstammvolumen {


            public static void main(String[] args) {
                double length = 10;
                double D = 30;

                double length2 = 15;
                double D2 = 32;


                double volumen = PI/4 * pow(D, 2) * length/10000;
                double volumen2 = PI/4 * pow(D2, 2) * length2/10000;

                System.out.println(volumen);
                System.out.println(volumen2);



    }
}
