import java.time.LocalDate;

public class Person {
    private int year;

    private int month;

    private int age;
    private int day;

    private String name;


    public Person(int year, int moth, int day, String name) {
        this.year = year;
        this.month = moth;
        this.day = day;
        this.name = name;
        this.age = LocalDate.now().minusYears(year).minusMonths(moth - 1).minusDays(day).getYear();
    }
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


