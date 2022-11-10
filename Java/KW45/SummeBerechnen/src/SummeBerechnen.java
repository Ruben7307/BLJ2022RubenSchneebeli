public class SummeBerechnen {
    public static void main(String[] args) {
        int numb = 2;
        int result = 0;

        for (int i = 0; i < 25; i++) {
            numb++;
            result += numb;
            System.out.println(result);

        }
    }
}