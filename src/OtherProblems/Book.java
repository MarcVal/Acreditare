package OtherProblems;

/**
 * Created by Valeria Marc on 12/10/2016.
 */
public class Book extends Author {

    String title;
    int year;
    double price;
    String author;

    public static void main(String[] args) {

        Book Book1 = new Book();
        Book1.title = "TitlulCartii";
        Book1.year = 1990;
        Book1.price = 99.50;
        Book1.author = "Giavalescu";

        System.out.println(Book1.title + " for price " + Book1.price + " written by " + Book1.author + " and published in " + Book1.year);
    }

}

//  System.out.println(book + author);


//name, year, author, price
// +Book(name:String, year:int, author:Author)
//+getName():String
//  +getAuthor():Author
//+getPrice():double