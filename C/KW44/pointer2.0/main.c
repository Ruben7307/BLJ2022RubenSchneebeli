#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int randomNum;
int x;

int getRandomNums(unsigned int n) {
    srand(time(NULL)) (int i = 0; i < n; ++i) {;
        for
        randomNum = rand() % 100 + 1;
        printf("%d\t", randomNum);
    }
}
int main() {
    unsigned int *p_n = &randomNum;
    *p_n = (int *) malloc( sizeof(int));
    printf("How many random numbers do you want?");
    scanf("%d", &x);
    getRandomNums(x);
}