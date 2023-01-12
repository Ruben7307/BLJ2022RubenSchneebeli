
import java.util.Scanner;

public class NEWTriangleApp {


    private String company = "Noser Young";
    private String handler = "Ruben Schneebeli";
    private boolean isRunning;
    private double sideA;
    private double sideB;
    private double sideC;
    private String sideAInput;
    private String sideBInput;
    private String sideCInput;

    private String code;

    Scanner myObj = new Scanner(System.in);


    public void start() {

        boolean isRunning = true;

        printHeader();
        while (isRunning == true) {

            System.out.println("\nTEST CASES TRIANGLE\n");
            System.out.print("Cathetus A:");
            sideAInput = myObj.nextLine();
            System.out.print("Cathetus B:");
            sideBInput = myObj.nextLine();
            System.out.print("Hypotenuse C:");
            sideCInput = myObj.nextLine();

            try {
                validateInput();
                code = determineTriangleType();


            } catch (TriangleException e) {
                code = e.getMessage();

            } finally {
                promptAction();
            }

        }
    }

    private void promptAction() {
        System.out.println("----------------------------");
        System.out.println("CODE:\t\t\t" + code);
        System.out.println("----------------------------");

        System.out.println("<q> QUIT");
        System.out.println("<c> CONTINUE");

        String userInput = myObj.nextLine();

        switch (userInput) {
            case "q":
                isRunning = false;
                break;
            case "c":
                break;
        }

    }

    private void validateInput() throws TriangleException {
        // validate sideAInput, sideBInput, sideCInput as double

        try {
            sideA = Double.parseDouble(sideAInput);
            sideB = Double.parseDouble(sideBInput);
            sideC = Double.parseDouble(sideCInput);
        } catch (Exception e) {
            throw new IllegalTriangleSideException();
        }

        if (sideA == 0 || sideB == 0 || sideC == 0) {
            throw new ZeroTriangleSideException();
        } else if (sideA < 0 || sideB < 0 || sideC < 0) {
            throw new NegativeTriangleSideException();
        } else if ((sideA + sideB) < sideC) {
            throw new ImpossibleTriangleException();
        } else if (sideA + sideB == sideC) {
            throw new TriangleIsLineException();
        }
        // validates other triangle cases
    }

    private String determineTriangleType() {
        String code = "undefined";
        if (sideA == sideB && sideA == sideC) {
            code = "TRI66TF";
        } else if (((sideA * sideA) + (sideB * sideB)) == (sideC * sideC)) {
            code = "TRI72TF";
        } else if (sideA == sideB) {
            code = "TRI84TF";
        } else if (sideA != sideC && sideB != sideC) {
            code = "TRI60TF";
        }
        return code;
    }


    private void printHeader() {
        System.out.println("****************************************************************");
        System.out.println("*                                                              *");
        System.out.println("*                      TRIANGLE EVALUATOR                      *");
        System.out.println("*                                                              *");
        System.out.println("****************************************************************");
        System.out.println("* COMPANY: " + company + ", 2023                                   *");
        System.out.println("* HANDLER: " + handler + "                                    *");
        System.out.println("****************************************************************");
    }
}







