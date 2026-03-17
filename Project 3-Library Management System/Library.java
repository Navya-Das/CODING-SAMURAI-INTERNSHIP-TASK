import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        for (Book b : books) {
            b.displayBook();
        }
    }

    void borrowBook(int id) {
        for (Book b : books) {
            if (b.id == id && !b.isBorrowed) {
                b.isBorrowed = true;
                System.out.println("Book borrowed successfully.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id && b.isBorrowed) {
                b.isBorrowed = false;
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Invalid return.");
    }

    void searchBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                b.displayBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
