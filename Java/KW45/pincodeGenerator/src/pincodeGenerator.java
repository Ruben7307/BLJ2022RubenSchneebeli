public class pincodeGenerator {
    public static void main(String[] args) {
        int summe = 0;
        for (int i = 0;i < 10000;i++){

            int lengthOfInt = String.valueOf(summe).length();
            if (lengthOfInt < 2){
                System.out.println("000"+summe);

            }else if (lengthOfInt < 3){
                System.out.println("00"+summe);

            }else if (lengthOfInt < 4){
                System.out.println("0"+summe);

            }else{
                System.out.println(summe);

            }
            summe = summe + 1;
        }
    }
}
