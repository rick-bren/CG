
import java.util.Scanner;

class Book {
    String title, author, genre;
    int bookID;
    boolean isAvailable;
    Book prev, next;

    Book(String title, String author, String genre, int bookID, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}

public class LibraryLinkedList {
    Book head = null, tail = null;

    // Add at beginning
    void addAtBeginning(Book book) {
        if (head == null) {
            head = tail = book;
        } else {
            book.next = head;
            head.prev = book;
            head = book;
        }
    }

    // Add at end
    void addAtEnd(Book book) {
        if (tail == null) {
            head = tail = book;
        } else {
            tail.next = book;
            book.prev = tail;
            tail = book;
        }
    }

    // Add at position (1-based index)
    void addAtPosition(Book book, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(book);
            return;
        }
        Book temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addAtEnd(book);
        } else {
            book.next = temp.next;
            book.prev = temp;
            temp.next.prev = book;
            temp.next = book;
        }
    }

    // Remove by Book ID
    void removeByBookID(int id) {
        Book temp = head;
        while (temp != null && temp.bookID != id) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp == head) head = temp.next;
        if (temp == tail) tail = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    // Search by title or author
    void search(String keyword) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(keyword) || temp.author.equalsIgnoreCase(keyword)) {
                System.out.println("Found: " + temp.title + " by " + temp.author + " (" + temp.genre + ") - Available: " + temp.isAvailable);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Update availability status
    void updateStatus(int id, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookID == id) {
                temp.isAvailable = status;
                System.out.println("Status updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Display forward
    void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.bookID + ". " + temp.title + " by " + temp.author + " | Genre: " + temp.genre + " | Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.bookID + ". " + temp.title + " by " + temp.author + " | Genre: " + temp.genre + " | Available: " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    // Count books
    int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LibraryLinkedList lib = new LibraryLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add at Beginning\n2. Add at End\n3. Add at Position\n4. Remove by Book ID\n5. Search\n6. Update Status\n7. Display Forward\n8. Display Reverse\n9. Count Books\n10. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Enter Book ID, Title, Author, Genre, Availability (true/false): ");
                    int id = sc.nextInt();
                    String title = sc.next();
                    String author = sc.next();
                    String genre = sc.next();
                    boolean available = sc.nextBoolean();
                    Book b = new Book(title, author, genre, id, available);
                    if (choice == 1) lib.addAtBeginning(b);
                    else if (choice == 2) lib.addAtEnd(b);
                    else {
                        System.out.print("Enter Position: ");
                        int pos = sc.nextInt();
                        lib.addAtPosition(b, pos);
                    }
                    break;
                case 4:
                    System.out.print("Enter Book ID to remove: ");
                    lib.removeByBookID(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter Title or Author to search: ");
                    lib.search(sc.next());
                    break;
                case 6:
                    System.out.print("Enter Book ID and new status: ");
                    lib.updateStatus(sc.nextInt(), sc.nextBoolean());
                    break;
                case 7:
                    lib.displayForward();
                    break;
                case 8:
                    lib.displayReverse();
                    break;
                case 9:
                    System.out.println("Total books: " + lib.countBooks());
                    break;
            }
        } while (choice != 10);
        sc.close();
    }
}

