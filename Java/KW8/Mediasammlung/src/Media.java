public class Media {
    private String titel;
    private String  date;
    private String founder;

    public Media(String titel, String date, String founder) {
        this.titel = titel;
        this.date = date;
        this.founder = founder;
    }


    public void printinfo(){
        System.out.println("Titel: "+titel);
        System.out.println("Datum: "+date);
        System.out.println("Erfinder: "+founder);
    }


}
