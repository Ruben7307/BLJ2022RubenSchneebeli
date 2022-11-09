

public class person {
    private String name;
    private String favouriteColor;
    private int age;
    private String secondName;
    private String bestFriend;

    private person bestfriend1;

    public void presentYourself() {
        System.out.println("************************");
        System.out.println("Vorname: " + name);
        System.out.println("Nachname: " + secondName);
        System.out.println("Alter: " + age);
        System.out.println("Lieblingsfarbe: " + favouriteColor);
        System.out.println("Bester freund: " + getBestfriend1().getName());
        System.out.println("************************");

    }


    public void setFavouriteColor(String favouriteColor) {
        this.favouriteColor = favouriteColor;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setBestFriend(String bestFriend) {
        this.bestFriend = bestFriend;
    }

    public void setBestfriend1(person bestfriend1) {
        this.bestfriend1 = bestfriend1;
    }

    public person getBestfriend1() {
        return bestfriend1;
    }

    public String getName() {
        return name;
    }
}
