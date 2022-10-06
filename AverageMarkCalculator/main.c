/* 
 * File:   main.c
 * Author: Ruben 
 *
 * Created on 8. September 2022, 14:01
 */

#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

#define NUM_MARKS 5

int main(int argc, char** argv) {
    HANDLE hConsole;
    hConsole = GetStdHandle(STD_OUTPUT_HANDLE);

    SetConsoleTextAttribute(hConsole, 13);
    printf("------------------------------------------------------------------------------------------------------------------------\n");
    printf("Average Mark Calculator\n\n");
    printf("------------------------------------------------------------------------------------------------------------------------\n");
    SetConsoleTextAttribute(hConsole, 7);

    float grades[NUM_MARKS];
    float sum;
    float avg;

    printf("TYPE IN 5 GRADES\n\n");
    for (int i = 0; i < NUM_MARKS; ++i) {
        printf("%d. Enter number: ", i + 1);
        scanf("%f", &grades[i]);
        sum += grades[i];
    }

    avg = sum / NUM_MARKS;
    if (avg < 4) {
        SetConsoleTextAttribute(hConsole, 12);
        printf("------------------------------------------------------------------------------------------------------------------------\n");
        printf("Average = %.2f\n\n", avg);
        printf("------------------------------------------------------------------------------------------------------------------------\n");
    } else if(avg >= 4){
        SetConsoleTextAttribute(hConsole, 10);
        printf("------------------------------------------------------------------------------------------------------------------------\n");
        printf("Average = %.2f\n\n", avg);
        printf("------------------------------------------------------------------------------------------------------------------------\n");
    }
    SetConsoleTextAttribute(hConsole, 7);

    /*
     * TODO - Extra tasks, implement only after completing all previous TODOs.
     *      - Round the calculated average to 2 decimal places (output only).
     *      - While inputting, only allow values between 1.0 and 6.0.
     *      - For every mark, input a weight and calculate the average accordingly.
     *      - Allow for the manipulation of individual marks, using the index.
     */

    return (EXIT_SUCCESS);
}

