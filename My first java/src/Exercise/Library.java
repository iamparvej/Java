package Exercise;

public class Library {

        private String[] allBooks;        // stores all books ever added
        private String[] availableBooks;  // stores only available books
        private int totalBooks = 0;
        private int availableCount = 0;

        // Constructor
        public Library(int size) {
            allBooks = new String[size];
            availableBooks = new String[size];
        }

        // Method to add a book
        public void addBook(String bookName) {
            if (totalBooks < allBooks.length) {
                allBooks[totalBooks] = bookName;
                availableBooks[availableCount] = bookName;
                totalBooks++;
                availableCount++;
                System.out.println(bookName + " has been added.");
            } else {
                System.out.println("Library is full. Cannot add more books.");
            }
        }

        // Method to issue a book
        public void issueBook(String bookName) {
            for (int i = 0; i < availableCount; i++) {
                if (availableBooks[i] != null && availableBooks[i].equalsIgnoreCase(bookName)) {
                    System.out.println(bookName + " has been issued.");
                    availableBooks[i] = null; // mark it as issued
                    return;
                }
            }
            System.out.println("Book not available.");
        }

        // Method to return a book
        public void returnBook(String bookName) {
            for (int i = 0; i < availableBooks.length; i++) {
                if (availableBooks[i] == null) {
                    availableBooks[i] = bookName;
                    System.out.println(bookName + " has been returned.");
                    return;
                }
            }
            System.out.println("Library is full. Cannot return the book now.");
        }

        // Method to show available books
        public void showAvailableBooks() {
            System.out.println("\nAvailable Books:");
            boolean found = false;
            for (int i = 0; i < availableCount; i++) {
                if (availableBooks[i] != null) {
                    System.out.println("- " + availableBooks[i]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No books are currently available.");
            }
        }

        // Main method for demo/testing
        public static void main(String[] args) {
            Library lib = new Library(5);

            lib.addBook("Java Programming");
            lib.addBook("Python Basics");
            lib.addBook("Data Structures");

            lib.showAvailableBooks();

            lib.issueBook("Java Programming");
            lib.showAvailableBooks();

            lib.returnBook("Java Programming");
            lib.showAvailableBooks();
        }
    }


