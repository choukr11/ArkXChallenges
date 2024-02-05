package Day6.LibrarySystem;

public class Main {
    public static void main(String[] args) {

        Library myLibrary = new Library();

        while (true) {
            System.out.println("Do you want to add a book to the library? (yes/no)");
            String response = myLibrary.scanner.nextLine().toLowerCase();

            if (response.equals("no")) {
                break; // Exit the loop if the user enters "no"
            } else if (response.equals("yes")) {
                myLibrary.addBook(); // Add a book if the user enters "yes"
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
            }
        }

        myLibrary.displayAllBooks();

        myLibrary.closeScanner();
    }
}