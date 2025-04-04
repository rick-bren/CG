class Book {
    private String title;
    private String author;
    private double price;
    // Default Constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.displayDetails();
        System.out.println();
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        myBook.displayDetails();
    }
}
