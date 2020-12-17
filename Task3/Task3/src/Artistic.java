
import java.util.ArrayList;

public class Artistic extends Literature {

    public Artistic(){}

    public Artistic(ArrayList<Book> books){
        super(books);
    }

    @Override
    public void addBooks(Book book) {
        getBooks().add(book);
    }

    @Override
    public void showBooks() {
        System.out.println(getBooks());
    }

    @Override
    public void allInfo() {
        System.out.println("Artistic department");
        System.out.println("Books: ");
        System.out.println(getBooks());
        System.out.println("Amount of books: " + getBooks().size());
        System.out.println();
    }

    @Override
    public void searchByAuthor(String name) {

        for (int i = 0; i < getBooks().size(); i++) {
            if (name.equals(getBooks().get(i).getAuthor())) {
                System.out.println("Found: ");
                System.out.println(getBooks().get(i));
                break;
            }
        }
    }

    @Override
    public void amountOfBooks() {
        System.out.println("Amount of books: " + getBooks().size());
    }

    @Override
    public String toString(){
        return "Artistic department\n" + "Amount of books: " + getBooks().size();
    }

}
