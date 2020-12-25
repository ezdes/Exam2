import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(1, "Stephen Hawking", "C++", 1988);
        Book book2 = new Book(2, "James Gosling", "Java", 1995);
        Book book3 = new Book(3, "Ermek Nakypov", "How to sleep better?", 2017);
        Book book4 = new Book(4, "Rustambek Bolotov", "How to become a woman?", 2020);
        Book book5 = new Book(5, "Donald Trump", "A Time to Kill", 2013);
        Book book6 = new Book(6, "Black Butler", "Naruto Uzumaki", 2008);

        ArrayList<Book> artisticBooks = new ArrayList<>();
        artisticBooks.add(book3); // default books

        ArrayList<Book> juristicBooks = new ArrayList<>();
        juristicBooks.add(book5); // default books

        ArrayList<Book> technicalBooks = new ArrayList<>();
        technicalBooks.add(book1); // default books


        Library library = new Library(artisticBooks, juristicBooks, technicalBooks);

        System.out.println("Before: ");
        library.getArtistic().showBooks();
        library.getJuristic().showBooks();
        library.getTechnical().showBooks();

        System.out.println();

        library.getArtistic().addBooks(book4);
        library.getJuristic().addBooks(book6);
        library.getTechnical().addBooks(book2);

        System.out.println("After: ");
        library.getArtistic().showBooks();
        library.getJuristic().showBooks();
        library.getTechnical().showBooks();

        System.out.println();

        library.getArtistic().searchByAuthor("Rustambek Bolotov");
        library.getJuristic().searchByAuthor("Donald Trump");
        library.getTechnical().searchByAuthor("James Gosling");

        System.out.println();

        library.getArtistic().amountOfBooks();
        library.getJuristic().amountOfBooks();
        library.getTechnical().amountOfBooks();

        System.out.println();

        library.getArtistic().allInfo();
        library.getJuristic().allInfo();
        library.getTechnical().allInfo();
    }
}
