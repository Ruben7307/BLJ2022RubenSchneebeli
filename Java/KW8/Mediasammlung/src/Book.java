public class Book extends Media{
    private int sidenumber;
    private String verlag;

    public Book(String titel, String date, String founder, int sidenumber, String verlag) {
        super(titel, date, founder);
        this.sidenumber = sidenumber;
        this.verlag = verlag;
    }



    public void printinfo(){
       super.printinfo();
        System.out.println("Seitenzahl: "+sidenumber);
        System.out.println("Verlag: "+verlag);
    }
}
