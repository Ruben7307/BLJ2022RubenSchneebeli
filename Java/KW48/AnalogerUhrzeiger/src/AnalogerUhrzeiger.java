import javax.xml.namespace.QName;
import java.util.Scanner;


public class AnalogerUhrzeiger {
    public static void main(String[] args) {
        computeHourAndMinuteHandAngle();




    }






    public static void computeHourAndMinuteHandAngle(){
        Scanner time = new Scanner(System.in);
        System.out.println("What hour are you in now?");
        int hour = time.nextInt();
        int H;
        H = hour;
        int M;


        time.nextLine();
        System.out.println();
        System.out.println("What minute are you in now?");
        int minute = time.nextInt();
        M = minute;

        int hour1 = 60* H + M;
        int minute1 = 6*M;

int resulthour = hour1/2;
        System.out.println("Hour pointer: "+ resulthour+"º");
        System.out.println("Minute pointer: "+ minute1+"º");
    }

}
