import java.util.ArrayList;

public class Literature {
    private ArrayList<Book> books;

    public Literature(){}

    public Literature(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBooks(Book book){
        System.out.println("Adding book...");
    }

    public void showBooks(){
        System.out.println("Showing books...");
    }

    public void allInfo(){
        System.out.println("All info");
    }

    public void searchByAuthor(String name){
        System.out.println("Author");
    }

    public void amountOfBooks(){
        System.out.println("Amount of books");
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
