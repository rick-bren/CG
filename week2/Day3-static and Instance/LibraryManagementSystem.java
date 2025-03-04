class Book {
    private static String libraryName = "Central Library";
    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = this.title = title;
        this.author = this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Library Name : " + libraryName);
            System.out.println("Title        : " + this.title);
            System.out.println("Author       : " + this.author);
            System.out.println("ISBN         : " + this.isbn);
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library Name : " + libraryName);
    }

    public static void setLibraryName(String name) {
        libraryName = name;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "ISBN001");
        Book book2 = new Book("1984", "George Orwell", "ISBN002");

        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
        System.out.println();

        Book.displayLibraryName();
    }
}
