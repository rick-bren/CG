public class Book1 {
    String title;
    String author;
    double price;
    boolean isAvailable;

    public Book1(String title, String author, Double price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable=false;
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
            return true;
        } else {
            System.out.println("Sorry, the book is not available.");
            return false;
        }
    }

    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
    public static void main(String[] args) {
        Book1 boo = new Book1("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        boo.displayDetails();
    }
    
}
