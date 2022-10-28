#include <stdio.h>
void MakeBigg(char *BigLetter) {
    if (*BigLetter) {
        printf("Enter a letter:");
        scanf("%c", BigLetter);

        *BigLetter -= 32;
        printf("%c", *BigLetter);
    }
}


int main() {
    char c = 'a';
    char *p_c = &c;
    MakeBigg(&c);

}
