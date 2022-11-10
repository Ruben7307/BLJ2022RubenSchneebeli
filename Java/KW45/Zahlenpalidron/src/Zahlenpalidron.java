import java.util.Scanner;

public class Zahlenpalidron {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int num,temp,reverse=0;

        System.out.println("Bei welcher Nummer willst du wissen ob es ein Palidron ist?");
        num = Integer.parseInt(myObj.nextLine());


        temp = num;

        while(temp!=0)
        {
            int d=temp%10;
            reverse=reverse*10+d;
            temp/=10;
        }
        //
        if(reverse==num)
        {
            System.out.println(num + " ist ein Palidrom");
        }
        else
        {
            System.out.println(num + " ist kein Palindrom");
        }
    }
}
