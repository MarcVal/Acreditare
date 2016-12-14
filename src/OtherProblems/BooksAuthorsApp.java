package OtherProblems;

/**
 * Created by Valeria Marc on 12/14/2016.
 */
public class BooksAuthorsApp {

    public static void main(String[] args) {
        Author author = new Author("Prenume Nume", "email@editura.ro");
        Book book = new Book("Titlul cartii", 29.50, author, 2016);
        System.out.println("Book: " + book.getName() + " " + book.getPrice() + " by " + book.getAuthor().getName() + " published in " + book.getYear());
    }
}
