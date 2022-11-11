import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class rucksack {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        Scanner myObj = new Scanner(System.in);
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";

        System.out.println(ANSI_PURPLE + "**********************************");
        System.out.println("|  welcome to the backpack game  |");
        System.out.println("**********************************" + ANSI_RESET);

 while (true) {
     System.out.println("\nWhat do you want to put in your backpack?" + ANSI_RED + "\tenter 0 to quit" + ANSI_RESET);
     String a = myObj.nextLine();

     if (a.equals("0")){
         break;
     }


         for (int i = 0; i < items.size(); i++) {
             if (a.equals(items.get(i))){
                 items.remove(i);

         }
}


         items.add(a);


         System.out.println("I take withe me...");

         for (int i = 0; i < items.size(); i++) {
             System.out.println("-" + items.get(i));

         }






 }
    }
}

