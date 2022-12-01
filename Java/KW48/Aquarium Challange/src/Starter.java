import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Starter {

    public static void main(String[] args) {
        int userInput;
        Scanner sc = new Scanner(System.in);
        Aquarium aquarium = new Aquarium();
        ArrayList<Fish> fishes = new ArrayList<Fish>();

        System.out.println("\n" +
                "        /`-._           _   _   _   _   _   _   _   _         /`-._ \n" +
                "      _/,.._/          / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\      _/,.._/\n" +
                "   ,-'   ,  `-:,.-')  ( A | Q | U | A | R | I | U | M )  ,-'   ,  `-:,.-')\n" +
                "  : o ):';     _  {    \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/  : o ):';     _  { \n" +
                "  `-.  `' _,.-\\`-.)                                     `-.  `' _,.-\\`-.)\n" +
                "     `\\\\``\\,.-'                                            `\\\\``\\,.-'\n");
        do {
            System.out.println("[1] - Create a fish");
            System.out.println("[2] - Kill a fish");
            System.out.println("[3] - Move a fish");
            System.out.println("[4] - Show the aquarium");
            System.out.println(" ");
            System.out.println("[0] - exit");

            userInput = sc.nextInt();
            sc.nextLine();


            if (userInput == 1) {
                System.out.println("What is the name of the fish?");
                String name = sc.nextLine();
                System.out.println("Where should the fish be?");
                System.out.print("X position:");
                int positionx = sc.nextInt();
                sc.nextLine();
                System.out.print("Y position:");
                int positiony = sc.nextInt();
                sc.nextLine();
                Fish fish = new Fish(name, positionx, positiony);
                fishes.add(fish);
                aquarium.createFish(positionx, positiony);


            } else if (userInput == 2) {
                for (int i = 0; i < fishes.size(); i++) {
                    System.out.println((i));
                    fishes.get(i).printfish();
                }
                System.out.println("Wich fish do you want to kill\n");
                int id = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < fishes.size(); i++) {
                    if (i == id) {
                        int positionx = fishes.get(i).getPositionx();
                        int positiony = fishes.get(i).getPositiony();
                        aquarium.deleteFish(positionx, positiony);

                        fishes.remove(i);
                    }
                }

            } else if (userInput == 3) {
                System.out.println("MOVE A FISH");
                for (int i = 0; i < fishes.size(); i++) {
                    System.out.println((i));
                    fishes.get(i).printfish();
                }
                System.out.println("Wich fish do you want to move\n");
                int id = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < fishes.size(); i++) {
                    if (i == id) {
                        int positionx = fishes.get(i).getPositionx();
                        int positiony = fishes.get(i).getPositiony();
                        aquarium.removeFish(positionx, positiony);
                        System.out.println("");

                        System.out.println("Where should the fish go?");
                        System.out.print("X position:");
                        int newpositionx = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Y position:");
                        int newpositiony = sc.nextInt();
                        sc.nextLine();

                        aquarium.createFish(newpositionx, newpositiony);
                        fishes.get(i).setPositionx(newpositionx);
                        fishes.get(i).setPositiony(newpositiony);
                    }
                }
                    } else if (userInput == 4) {

                aquarium.printAquarium();


            }


                }while (userInput != 0) ;




    }
}
