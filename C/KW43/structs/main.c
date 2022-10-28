#include <stdio.h>
#include <intrin.h>
typedef struct shoe{
char marke[20];
char model[20];
int preis;

} TShoe;
void printCar(TShoe car){
    printf("******************\n");
    printf("Marke: %s \n", car.marke);
    printf("Model: %s \n", car.model);
    printf("Preis: %d \n", car.preis);
    printf("******************\n");
}

int main() {

    TShoe myshoe[1500000]={0};


    TShoe shoe = {0};
    shoe.preis = 200;
    strcpy(shoe.marke, "Jordan");
    strcpy(shoe.model, "Air Jordan 1");
    TShoe shoe2 = {0};
    shoe2.preis = 150;
    strcpy(shoe2.marke, "Nike");
    strcpy(shoe2.model, "Tn's");
    TShoe shoe3 = {0};
    shoe3.preis = 250;
    strcpy(shoe3.marke, "Nike");
    strcpy(shoe3.model, "Dunks");
    printCar(shoe);
    printCar(shoe2);
    printCar(shoe3);

    for (int i = 0; i < 1500000; i++) {
        printf("%s \n", myshoe[i].marke);
        printf("%s \n", myshoe[i].model);
        printf("%d \n", myshoe[i].preis);

    }


    return 0;
}