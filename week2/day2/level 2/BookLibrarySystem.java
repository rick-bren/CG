class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }
}

class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + getAuthor());
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        System.out.println("--- Book 1 Details ---");
        book1.displayBookDetails();

        EBook ebook1 = new EBook("978-1-23-456789-7", "Advanced Java", "Jane Smith");
        System.out.println("\n--- EBook 1 Details ---");
        ebook1.displayEBookDetails();

        ebook1.setAuthor("Robert Brown");
        System.out.println("\nUpdated Author for EBook 1: " + ebook1.getAuthor());
    }
}
