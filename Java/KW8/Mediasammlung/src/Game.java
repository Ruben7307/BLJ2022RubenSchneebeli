public class Game extends Media{
    private String console;

    public Game(String titel, String date, String founder, String console) {
        super(titel, date, founder);
        this.console = console;
    }

    public void printinfo(){
        super.printinfo();
        System.out.println("Konsole: "+console);
    }
}
