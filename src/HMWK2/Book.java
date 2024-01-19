package HMWK2;

/*
Library Management System:
Create a base class Book with attributes like title, author, and ISBN.
Develop two subclasses: EBook and PrintBook. In EBook, add a property
for download_link, and in PrintBook, add a property for number_of_copies.
Implement a method in each subclass that displays book details.
Instantiate objects from these classes and demonstrate the display functionality.
 */

public class Book {

    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void printInfo(){
        System.out.println("Book details :"+title+" "+author+" "+ISBN);
    }
}

class EBook extends Book{

    private String downloadLink;

    public EBook(String Title, String Author, String ISBN, String downloadLink){
        super(Title, Author, ISBN);
        this.downloadLink = downloadLink;
    }

    public void bookDetails(){
        System.out.println("EBook details :"+getTitle()+" "+getAuthor()+" "+getISBN()+" "+downloadLink);

    }
}

class PrintBook extends Book {

    private int numberOfCopies;

    public PrintBook(String Title, String Author, String ISBN, int numberOfCopies) {
        super(Title, Author, ISBN);
        this.numberOfCopies = numberOfCopies;
    }

    public void bookDetails() {
        System.out.println("EBook details :" + getTitle() + " " + getAuthor() + " " + getISBN() + " " + numberOfCopies);
    }
}

class bookTester{
    public static void main(String[] args) {
        Book eb = new EBook("Easy way to learn java", "Patrick Udo", "1113392899", "Click here to Download");
        Book pb = new PrintBook("Easy way to learn java", "Patrick Udo", "1113392899", 25);

        EBook eb1 = (EBook)eb;
        eb1.bookDetails();
        PrintBook pb1 = (PrintBook)pb;
        pb1.bookDetails();
    }
}
