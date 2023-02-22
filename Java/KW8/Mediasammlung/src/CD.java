public class CD extends Media{
    private String singer;
    private String fsk;

    public CD(String titel, String date, String founder, String singer, String fsk) {
        super(titel, date, founder);
        this.singer = singer;
        this.fsk = fsk;
    }

    public void printinfo(){
        super.printinfo();
        System.out.println("Sänger: "+singer);
        System.out.println("Altersbeschränkung: "+fsk);
    }
}
