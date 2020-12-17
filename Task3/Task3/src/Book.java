public class Book {
    private int id;
    private String author;
    private String name;
    private int year;

    public Book(){}

    public Book(int id, String author, String name, int year){
        this.id = id;
        this.author = author;
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + author + " " + year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
