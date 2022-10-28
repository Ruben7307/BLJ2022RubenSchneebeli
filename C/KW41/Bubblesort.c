/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Ruben
 *
 * Created on 9. September 2022, 08:39
 */

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char** argv) {

    int Numbs[] = {-2, 45, 0, 11, -9};
    int Size = sizeof (Numbs) / sizeof (Numbs[0]);
    
    for (int step = 0; step < Size - 1; ++step) {
        for (int i = 0; i < Size - step - 1; ++i) {
            if (Numbs[i] > Numbs[i + 1]) {

                int temp = Numbs[i];
                Numbs[i] = Numbs[i + 1];
                Numbs[i + 1] = temp;
            }
        }
    }

    void printArray(int Numbs[], int Size) {
        for (int i = 0; i < Size; ++i) {
            printf("%d", Numbs[i]);
            printf("\n");
        }
    }
    printf("\n");
    printf("Sorted Array in Ascending Order:\n");
    printArray(Numbs, Size);



    return (EXIT_SUCCESS);
}

