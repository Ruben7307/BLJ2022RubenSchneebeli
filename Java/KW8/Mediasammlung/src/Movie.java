public class Movie extends Media{
    private String mainactor;
    private String genre;
    private int fsk;

    public Movie(String titel, String date, String founder, String mainactor, String genre, int fsk) {
        super(titel, date, founder);
        this.mainactor = mainactor;
        this.genre = genre;
        this.fsk = fsk;
    }

    public void printinfo(){
        super.printinfo();
        System.out.println("hauptcharacter: "+mainactor);
        System.out.println("Genre: "+genre);
        System.out.println("Altersfreigabe: "+fsk);
    }
}
