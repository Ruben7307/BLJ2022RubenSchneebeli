#include <stdio.h>

#define ARRAYLENGTH 5
#define ARRAYWIDTH 5

int main() {

    int save;
    int arr[ARRAYLENGTH][ARRAYWIDTH] = {{0, 0, 0, 0, 0},
                                        {0, 0, 0, 0, 0}};
    int keepdoing = 1;
    int choice;
    int Userx = 1;
    int Usery = 1;

    printf("\tWelcome to Array 2D --\n");

    do {


        printf("______________________________________\n");
        printf("| Do you want to add a number (1)    |\n| Do you want to delete a number (2) |\n");
        printf("|____________________________________|\n");
        printf("--->");
        scanf("%d", &choice);

        if (choice == 1) {
            printf("Enter X value (1-%d):", ARRAYLENGTH);
            scanf("%d", &Userx);

            printf("Enter Y value (1-%d):", ARRAYWIDTH);
            scanf("%d", &Usery);

            printf("Enter the number:");
            scanf("%d", &save);

            Userx -= 1;
            Usery -= 1;

            if (arr[Usery][Userx] == 0) {
                arr[Usery][Userx] = save;
            } else {
                printf("!You can't change this number!");
                return 0;
            }
            printf("---------------------\n");

            for (int i = 0; i < ARRAYLENGTH; i++) {
                for (int j = 0; j < ARRAYWIDTH; j++) {
                    printf("| %d ", arr[j][i]);

                }
                printf("|\n");
                printf("---------------------\n");
            }
        } else if (choice == 2) {
            printf("Enter X value (1-%d):", ARRAYLENGTH);
            scanf("%d", &Userx);

            printf("Enter Y value (1-%d):", ARRAYWIDTH);
            scanf("%d", &Usery);

            Userx -= 1;
            Usery -= 1;

            if (arr[Usery][Userx] == 0) {
                printf("You can't change this number");
                return 0;
            } else {
                arr[Usery][Userx] = 0;
            }
            printf("---------------------\n");

            for (int i = 0; i < ARRAYLENGTH; i++) {
                for (int j = 0; j < ARRAYWIDTH; j++) {
                    printf("| %d ", arr[j][i]);

                }
                printf("|\n");
                printf("---------------------\n");
            }
        }
        printf("\nDo you want to continue? Type 1\n");
        printf("Do you want to exit ? Type 2\n --->");
        scanf("%d", &keepdoing);

    } while (keepdoing == 1);
}
