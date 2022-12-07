

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class zusatz {
    public static void initPersonArray(Person[] persArr) {
        int i = 0;
        String line;
        String splitBy = ";";
        String path = "C:\\Github\\BLJ2022RuSch\\Java\\KW49\\GeburttstagChallengezusatz\\src\\Personen_Aufgabe_2022-2023.CSV";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] person = line.split(splitBy);

                int year = Integer.parseInt(person[1]);
                int month = Integer.parseInt(person[2]);
                int day = Integer.parseInt(person[3]);
                String name = person[0];

                persArr[i++] = new Person(year, month, day, name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        Person[] persArr = new Person[40];
        initPersonArray(persArr);

        int n = persArr.length;
        Person temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (persArr[j - 1].getDay() > persArr[j].getDay()) {

                    temp = persArr[j - 1];
                    persArr[j - 1] = persArr[j];
                    persArr[j] = temp;
                }
            }
        }
        int m = persArr.length;
        Person temp1;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < (m - i); j++) {
                if (persArr[j - 1].getMonth() > persArr[j].getMonth()) {

                    temp = persArr[j - 1];
                    persArr[j - 1] = persArr[j];
                    persArr[j] = temp;
                }
            }
        }
        String[] month = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};

        System.out.println("2022 haben Gbeurtstag im");
        for (int i = 0; i < month.length; i++) {
            System.out.println("\n" +month[i]);
            for (int j = 0; j < persArr.length; j++) {
                if (persArr[j].getMonth() == i + 1) {
                    System.out.println("\t" + persArr[j].getDay() + ". " + persArr[j].getName() + " (" + persArr[j].getAge() + ")");
                }
            }
        }
    }


        }








