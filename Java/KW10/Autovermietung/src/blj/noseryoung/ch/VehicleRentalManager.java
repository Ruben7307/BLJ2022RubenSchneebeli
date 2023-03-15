package blj.noseryoung.ch;

import java.time.LocalDate;
import java.util.Scanner;

public class VehicleRentalManager {
    public void manager(){
        Scanner sc = new Scanner(System.in);

        System.out.println("+----------------------------------+");
        System.out.println("|     [1] - create a user          |");
        System.out.println("|     [2] - delete a user          |");
        System.out.println("|     [3] - rent a car             |");
        System.out.println("|     [4] - add user on deny-list  |");
        System.out.println("+----------------------------------+");

        Integer input = sc.nextInt();

        if (input == 1){
            System.out.println("Enter your full name:");
            String fullname = sc.nextLine();
            System.out.println("Enter your birthdate:");
            String birthdate = sc.nextLine();

            System.out.println(fullname + birthdate);
        }else if (input == 2){

        }else if (input == 3){

        } else if (input == 4) {

        }
    }
    public void addPersonToDenyList(){

    }
    public void createContract(){

    }
}
