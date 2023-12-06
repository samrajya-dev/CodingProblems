import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println();
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library.");
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("List of Books in the Library:");
            for (Book book : books) {
                book.displayBookDetails();
            }
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            // Display menu options
            System.out.println("Library System Menu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            // Read user input
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add a new book
                    System.out.print("Enter the title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the publication year: ");
                    int publicationYear = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    // Create a new book and add it to the library
                    Book newBook = new Book(title, author, publicationYear);
                    library.addBook(newBook);
                    break;

                case 2:
                    // Display all books in the library
                    library.displayAllBooks();
                    break;

                case 3:
                    // Exit the application
                    System.out.println("Exiting the Library System. Goodbye!");
                    System.exit(0);

                default:
                    // Handle invalid input
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
