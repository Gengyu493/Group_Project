import java.util.Scanner;

class Library {
    private static int bookCount = 0;
    private static final int MAX_BOOKS = 100;
    private static Book[] books = new Book[MAX_BOOKS];

    public static void addBook(String title, String author) {
        if (bookCount < MAX_BOOKS) {
            books[bookCount++] = new Book(title, author);
            System.out.println("Book added successfully!\n");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public static void displayBooks() {
        System.out.println("\nBooks in the library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("\nTitle: " + books[i].getTitle() + "\nAuthor: " + books[i].getAuthor());
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a book");
            System.out.println("2. Display books");
            System.out.println("3. Exit");

            System.out.print("Enter 1, 2, or 3: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    Library.addBook(title, author);
                    break;
                case 2:
                    Library.displayBooks();
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

// Need to add 11，13，16，17，19，23
