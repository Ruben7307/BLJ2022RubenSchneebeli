import java.util.Arrays;

public class Aquarium {

    private int[][] aquarium = new int[10][30];


    public void printAquarium() {


        for (int i = 0; i < 48; i++) {
            System.out.print("▓▓");
        }
        aquarium[9][1] = 3;
        aquarium[9][2] = 3;
        aquarium[9][3] = 3;
        aquarium[9][5] = 3;
        aquarium[9][6] = 3;
        aquarium[9][11] = 3;
        aquarium[9][8] = 3;
        aquarium[9][9] = 3;
        aquarium[9][10] = 3;
        aquarium[9][12] = 3;
        aquarium[9][13] = 3;
        aquarium[9][14] = 3;
        aquarium[9][16] = 3;
        aquarium[9][17] = 3;
        aquarium[9][18] = 3;
        aquarium[9][19] = 3;
        aquarium[9][20] = 3;
        aquarium[9][21] = 3;
        aquarium[9][23] = 3;
        aquarium[9][24] = 3;
        aquarium[9][25] = 3;
        aquarium[9][26] = 3;
        aquarium[9][27] = 3;
        aquarium[9][28] = 3;
        aquarium[9][29] = 3;
        aquarium[9][0] = 3;
        aquarium[9][15] = 3;
        aquarium[9][4] = 3;
        aquarium[9][22] = 3;
        aquarium[9][7] = 3;


        System.out.print("▓");
        System.out.println("▓");
        String aquariumAsString = Arrays.deepToString(aquarium);
        aquariumAsString = aquariumAsString.replace("[[", "▓").replace("], [", "▓\n▓").replace(", ", " ").replace("]]",
                "▓").replace("10", "🟦").replace("0", "🟦").replace("1", "🐠").replace("8", "🟦").replace("3", "🪸").replace("9", "☠");
        System.out.println(aquariumAsString);

        for (int i = 0; i < 48; i++) {
            System.out.print("▓▓");
        }
        System.out.print("▓");
        System.out.println("▓");
    }

    public void setAquarium(int[][] aquarium) {
        this.aquarium = aquarium;
    }

    public void createFish(int positionx, int positiony) {
        aquarium[positionx][positiony] = 1;
    }

    public void deleteFish(int positionx, int positiony) {
        aquarium[positionx][positiony] = 9;
    }

    public void removeFish(int positionx, int positiony) {
        aquarium[positionx][positiony] = 8;
    }

    public int[][] getAquarium() {
        return aquarium;
    }
}

