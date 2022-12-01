import java.util.Scanner;


public class Konfektionsgroesse {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bist du ein Mann (M) oder eine Frau? (F)");
        String sex = scanner.nextLine();
        if(sex.equals("f")){
            women();
        }
        if(sex.equals("m")) {
            men();
        }


    }

    public static void women(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Was ist dein Brustumfang?");
        int brustumfang = scanner.nextInt();
        int konfektionsgroesse = brustumfang / 2 - 6;
        System.out.println("Wie gross bist du (in cm)?");
        int grösse = scanner.nextInt();

        if (grösse <= 170) {
            System.out.println("Die Normale Konfektionsgrösse für deine Körpergrösse ist (32-44)");
        } else if (grösse>=170) {
            System.out.println("Die Normale Konfektionsgrösse für deine Körpergrösse ist (64-88)");
        } else if (grösse <= 164) {
            System.out.println("Die Normale Konfektionsgrösse für deine Körpergrösse ist (16-22)");
        }
        System.out.println("Deine Konfektionsgrösse ist "+konfektionsgroesse);



    }

    public static void men(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Was ist dein Brustumfang?");
        int brustumfang = scanner.nextInt();
        int konfektionsgroesse = brustumfang / 2 ;
        System.out.println("Diene Konfektionsgrösse ist "+konfektionsgroesse);

    }




}
