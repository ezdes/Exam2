import java.util.ArrayList;

public class Library {
    private Artistic artistic;
    private Juristic juristic;
    private Technical technical;

    public Library(){}

    public Library(ArrayList<Book> artisticBooks, ArrayList<Book> juristicBooks, ArrayList<Book> technicalBooks){
        artistic = new Artistic(artisticBooks);
        juristic = new Juristic(juristicBooks);
        technical = new Technical(technicalBooks, true);
    }

    public Artistic getArtistic() {
        return artistic;
    }

    public void setArtistic(Artistic artistic) {
        this.artistic = artistic;
    }

    public Juristic getJuristic() {
        return juristic;
    }

    public void setJuristic(Juristic juristic) {
        this.juristic = juristic;
    }

    public Technical getTechnical() {
        return technical;
    }

    public void setTechnical(Technical technical) {
        this.technical = technical;
    }
}
