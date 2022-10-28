#include <stdio.h>

#define FIELD_SIZE 11


int main() {
    char test = 254;
    char middle = 222;
    float userinput;

    int field[FIELD_SIZE][FIELD_SIZE] = {
            {0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {45, 0, 0, 0, 0, 69, 0, 0, 0, 0, 15,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 30, 0, 0, 0, 0, 0,},
    };

    printf("Enter the minutes:");
    scanf("%d", &userinput);

    if (userinput <= 60 && userinput >= 0) {
        if ((userinput < 3.75 && userinput >= 0) || (userinput > 56.25 && userinput <= 60)) {
            field[4][5] = 1;
            field[3][5] = 1;
            field[2][5] = 1;
            field[1][5] = 1;
        } else if (userinput < 11.25 && userinput >= 3.75) {
            field[4][6] = 1;
            field[3][7] = 1;
            field[2][8] = 1;
            field[1][9] = 1;
        } else if (userinput < 18.75 && userinput >= 11.2) {
            field[5][6] = 1;
            field[5][7] = 1;
            field[5][8] = 1;
            field[5][9] = 1;
        } else if (userinput < 26.25 && userinput >= 18.75) {
            field[6][6] = 1;
            field[7][7] = 1;
            field[8][8] = 1;
            field[9][9] = 1;
        } else if (userinput < 33.75 && userinput >= 26.25) {
            field[6][5] = 1;
            field[7][5] = 1;
            field[8][5] = 1;
            field[9][5] = 1;
        }else if (userinput < 41.25 && userinput >= 33.75) {
            field[6][4] = 1;
            field[7][3] = 1;
            field[8][2] = 1;
            field[9][1] = 1;
        }else if (userinput < 48.75 && userinput >= 41.25) {
            field[5][4] = 1;
            field[5][3] = 1;
            field[5][2] = 1;
            field[5][1] = 1;
        }else if (userinput < 56.25 && userinput >= 48.75) {
            field[4][4] = 1;
            field[3][3] = 1;
            field[2][2] = 1;
            field[1][1] = 1;
        }


        printf("+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+\n");
        for (int row = 0; row < FIELD_SIZE; row++) {
            printf("| ");
            for (int col = 0; col < FIELD_SIZE; col++) {
                if (field[row][col] == 1) {
                    printf(" %c  | ",test);
                } else if(field[row][col] == 0){
                    printf("    | ");
                }else if(field[row][col] == 69){
                    printf(" %c  | ",middle);
                }
                else {
                    printf(" %d | ", field[row][col]);
                }
            }
            printf("\n+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+\n");
        }
    } else{
        printf("ENTER A VALID NUMBER!!!");
    }

    return 0;
}