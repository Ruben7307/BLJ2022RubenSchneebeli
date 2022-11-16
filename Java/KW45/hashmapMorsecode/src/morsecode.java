import java.util.*;
import java.util.Scanner;








public class morsecode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";

        while (true) {

            System.out.println(ANSI_RED + "\nEnter your text:" + ANSI_RESET);
            String userinput = input.nextLine();
            userinput=userinput.toLowerCase();

            if (userinput.equals("exit")) {
                break;
            }

            for (int i = 0; i < userinput.length(); i++) {
                Map<Character, String> morse = new HashMap<Character, String>();
                morse.put('a', "∙- "  );
                morse.put('b', "-∙∙∙ ");
                morse.put('c', "-∙- " );
                morse.put('d', "-∙∙ " );
                morse.put('e', "∙ "   );
                morse.put('f', "∙∙-∙ ");
                morse.put('g', "--∙ " );
                morse.put('h', "∙∙∙∙ ");
                morse.put('i', "∙∙ "  );
                morse.put('j', "∙--- ");
                morse.put('k', "-∙ "  );
                morse.put('l', "∙-∙∙ ");
                morse.put('m', "-- "  );
                morse.put('n', "-∙ "  );
                morse.put('o', "--- " );
                morse.put('p', "∙--∙ ");
                morse.put('q', "--∙- ");
                morse.put('r', "∙-∙ " );
                morse.put('s', "∙∙∙ " );
                morse.put('t', "- "   );
                morse.put('u', "∙∙- " );
                morse.put('v', "∙∙∙- ");
                morse.put('w', "∙-- " );
                morse.put('x', "-∙∙- ");
                morse.put('y', "-∙-- ");
                morse.put('z', "--∙∙ ");
                morse.put(' ', " / "  );
                System.out.print(morse.get(userinput.charAt(i)));
            }        }

    }
    }
