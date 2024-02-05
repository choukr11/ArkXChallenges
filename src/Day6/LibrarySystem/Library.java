package Day6.LibrarySystem;

import java.util.ArrayList;
import java.util.Scanner;

class Library {
    private ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addBook() {
        System.out.println("Enter the book title:");
        String title = scanner.nextLine();

        System.out.println("Enter the author:");
        String author = scanner.nextLine();

        System.out.println("Enter the ISBN:");
        String isbn = scanner.nextLine();

        System.out.println("Is it a fiction or non-fiction book?");
        String bookType = scanner.nextLine();

        Book newBook;

        if (bookType.equals("fiction")) {
            System.out.println("Enter the genre:");
            String genre = scanner.nextLine();
            newBook = new FictionBook(title, author, isbn, genre);
        } else if (bookType.equals("non-fiction")) {
            System.out.println("Enter the topic:");
            String topic = scanner.nextLine();
            newBook = new NonFictionBook(title, author, isbn, topic);
        } else {
            System.out.println("Invalid book type. Book not added.");
            return;
        }

        books.add(newBook);

        System.out.println("Book added successfully!");
    }

    public void displayAllBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
