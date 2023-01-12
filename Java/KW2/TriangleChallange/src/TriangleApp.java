import java.util.Scanner;

public class TriangleApp {
    Scanner myObj = new Scanner(System.in);

    public void printtriangleapp(){
        System.out.println("****************************************************************");
        System.out.println("*                                                              *");
        System.out.println("*                      TRIANGLE EVALUATOR                      *");
        System.out.println("*                                                              *");
        System.out.println("****************************************************************");
        System.out.println("* COMPANY: Noser Young, 2023                                   *");
        System.out.println("* HANDLER: Ruben Schneebeli                                    *");
        System.out.println("****************************************************************");

    }

    public void logic() {
        boolean quit = false;
        while (!quit) {
            System.out.println("TEST CASES TRIANGLE\n");
            System.out.print("Cathetus A:");
            double a = myObj.nextDouble();
            System.out.print("Cathetus B:");
            double b = myObj.nextDouble();
            System.out.print("Hypotenuse C:");
            double c = myObj.nextDouble();



            String code = "undefined";
            if (a == b && a == c) {
                code = "TRI66TF";
            } else if (((a * a) + (b * b)) == (c * c)){
                code = "TRI72TF";
            }else if (a == b) {
                code = "TRI84TF";
            } else if (a != c && b != c) {
                code = "TRI60TF";
            }




            System.out.println("----------------------------");
            System.out.println("CODE:\t\t\t"+ code);
            System.out.println("----------------------------");


            System.out.println("<q> QUIT");
            System.out.println("<c> CONTINUE");

            Scanner myObj = new Scanner(System.in);
            String userInput = myObj.nextLine();

            switch (userInput){
                case "q":
                    quit = true;
                    break;
                case "c":
                    break;

            }
        }
    }
}
