import java.util.Scanner;

public class Main{

    public static void main(String[]args){

        person Maincharacter = new person();
        person BestFriend = new person();

        System.out.println("Wie ist dein Vorname?");
        Scanner myObj5 = new Scanner(System.in);
        String firstName = myObj5.nextLine();

        System.out.println("Wie ist dein Nachname?");
        Scanner myObj6 = new Scanner(System.in);
        String secondName = myObj5.nextLine();

        System.out.println("Wie alt bist du?");
        Scanner myObj = new Scanner(System.in);
        int age1 = myObj.nextInt();

        System.out.println("Welche ist deine Lieblingsfarbe?");
        Scanner myObj1 = new Scanner(System.in);
        String favColour = myObj1.nextLine();

        System.out.println("Wer ist dein bester Freund");
        Scanner myObj7 = new Scanner(System.in);
        String bestFriend = myObj1.nextLine();


        Maincharacter.setSecondName(secondName);
        Maincharacter.setName(firstName);
        Maincharacter.setAge(age1);
        Maincharacter.setFavouriteColor(favColour);


        BestFriend.setName(bestFriend);
        BestFriend.setSecondName("-");
        BestFriend.setAge(15);
        BestFriend.setFavouriteColor("-");
        BestFriend.setBestfriend1(new person());

        Maincharacter.setBestfriend1(BestFriend);

        Maincharacter.presentYourself();

        System.out.println("\n\nDass hier ist dein bester Freund");
        BestFriend.presentYourself();


        }
}