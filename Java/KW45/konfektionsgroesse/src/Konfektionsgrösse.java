import java.util.Scanner;


public class Konfektionsgrösse {
    public static void main(String[] args) {
        computeGarmentSize();
    }

    public static void computeGarmentSize(){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Wie gross ist dein Brustumfang (in cm)");
        String brustumfang = myObj.nextLine();
//int brustumfangtemp = brustumfang/2;
        System.out.println(brustumfang);
    }
}
