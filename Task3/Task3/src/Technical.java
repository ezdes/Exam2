import java.util.ArrayList;

public class Technical extends Literature {
    private boolean hasComputer;

    public Technical(){}

    public Technical(ArrayList<Book> books, boolean hasComputer){
        super(books);
        this.hasComputer = hasComputer;
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
        System.out.println("Technical department");
        System.out.println("Books: ");
        System.out.println(getBooks());
        System.out.println("Amount of books: " + getBooks().size());
        System.out.println(hasComputer ? "Technical department has a computer" : "Technical department doesn't has a computer");
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
        return "Technical department\n" + "Amount of books: " + getBooks().size();
    }

    public boolean isHasComputer() {
        return hasComputer;
    }

    public void setHasComputer(boolean hasComputer) {
        this.hasComputer = hasComputer;
    }

}
