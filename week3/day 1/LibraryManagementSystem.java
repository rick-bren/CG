
// Interface for reservable items
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Abstract class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Encapsulation: Getters for secure access
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    // Concrete method to get item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Abstract method to be implemented by subclasses for loan duration
    public abstract int getLoanDuration(); // Returns loan duration in days
}

// Book class extends LibraryItem
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true; // Default availability
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books can be loaned for 14 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("Book '" + getTitle() + "' reserved successfully.");
            isAvailable = false;
        } else {
            System.out.println("Book '" + getTitle() + "' is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Magazine class extends LibraryItem
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true; // Default availability
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("Magazine '" + getTitle() + "' reserved successfully.");
            isAvailable = false;
        } else {
            System.out.println("Magazine '" + getTitle() + "' is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// DVD class extends LibraryItem
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true; // Default availability
    }

    @Override
    public int getLoanDuration() {
        return 5; // DVDs can be loaned for 5 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("DVD '" + getTitle() + "' reserved successfully.");
            isAvailable = false;
        } else {
            System.out.println("DVD '" + getTitle() + "' is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Main class to test Library Management System
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating items of different types
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "Time Magazine", "Time Inc.");
        LibraryItem dvd = new DVD("D001", "The Matrix", "Lana Wachowski");

        // Storing items in an array for polymorphism demonstration
        LibraryItem[] items = {book, magazine, dvd};

        // Demonstrating polymorphism and item details display
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                reservableItem.reserveItem(); // Attempt to reserve the item
                System.out.println("Available: " + reservableItem.checkAvailability());
            }
            System.out.println("-----------------------------------");
        }

        // Demonstrating second reservation attempt on same item
        System.out.println("\nAttempting to reserve the same items again:\n");
        for (LibraryItem item : items) {
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                reservableItem.reserveItem(); // Attempt to reserve again
                System.out.println("Available: " + reservableItem.checkAvailability());
            }
        }
    }
}

