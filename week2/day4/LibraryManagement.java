package Inheritance;

class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title            : " + title);
        System.out.println("Publication Year : " + publicationYear);
    }
}

class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name      : " + name);
        System.out.println("Author Bio       : " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author a1 = new Author("The Timeless Code", 2020, "Jane Doe", "Jane is a seasoned software engineer and writer.");
        a1.displayInfo();
    }
}
