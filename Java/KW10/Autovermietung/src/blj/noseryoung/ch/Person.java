package blj.noseryoung.ch;

import java.time.LocalDate;
import java.util.ArrayList;

public class Person {
    private String fullname;
    private LocalDate birthYear;

    ArrayList<Person> personenverwaltung = new ArrayList<>();

    public Person(String fullname, LocalDate birthYear) {
        this.fullname = fullname;
        this.birthYear = birthYear;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }
}
