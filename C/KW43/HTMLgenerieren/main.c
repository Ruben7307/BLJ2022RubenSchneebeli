#include <stdio.h>
#include <unistd.h>

int main() {
    int collums;
    int rows;
    int header;

    FILE *file;
    file = fopen("C:/Users/Ruben/CLionProjects/HTMLgenerieren/test.html", "w");

    printf("+-----------------------------------------+\n");
    printf("| Welcome to the table generator for HTML |\n");
    printf("+-----------------------------------------+\n\n");


    printf("How many rows do you want on your table\n");
    scanf(" %d", &rows);

    printf("How many collums do you want on your table\n");
    scanf(" %d", &collums);

    printf("Do you want the code with a header yes = 1, no = 2\n");
    scanf("%d", &header);


        printf("+-------------+\n");
        printf("| Here you go |\n");
        printf("+-------------+\n\n");

        sleep(1);

        if (header == 1) {

            fprintf(file, "<!DOCTYPE html>\n"
                   "<html lang=\"en\">\n"
                   "<head>\n"
                   "    <meta charset=\"UTF-8\">\n"
                   "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                   "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                   "    <title>Table</title>\n");


            fprintf(file,"<style>\n\n");
            fprintf(file,"body{\n"
                   "    background-color: rgba(104, 10, 121, 0.8);\n"
                   "}\n");


            fprintf(file,"table, th, td {\n"
                   "  border: 1px solid rgb(0, 0, 0);\n"
                   "  border-radius: 10px;"
                   "  width: 500px;"
                   "  height: 50px;"
                   "  margin: auto;"
                   "}\n"
                   "th, td {\n"
                   "  background-color: #a5aee6;\n"
                   "}\n");

            fprintf(file,"</style>\n\n");

            fprintf(file,"<table>\n");
        } else if (header == 2) {
            fprintf(file,"<table>\n");
        }

        for (int r = rows; r > 0; r--) {
            fprintf(file,"<tr>\n");
            for (int c = collums; c > 0; c--) {

                fprintf(file,"\t<td>Hallo Yan</td>\n");
            }
        }
        fprintf(file,"<tr>\n");
        if (header == 1) {
            fprintf(file,"</table>\n");
            fprintf(file,"</head>\n"
                   "</html>");
        } else if (header == 2) {
            fprintf(file,"</table>");
        }
    fclose(file);
        return 0;
    }
