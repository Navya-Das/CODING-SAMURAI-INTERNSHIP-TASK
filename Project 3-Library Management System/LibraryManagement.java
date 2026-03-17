import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        library.addBook(new Book(1, "Java Basics", "James Gosling"));
        library.addBook(new Book(2, "Data Structures", "Mark Allen"));
        library.addBook(new Book(3, "Cyber Security", "John Smith"));

        int choice;

        do {
            System.out.println("\n1. Show Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    library.showBooks();
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    int borrowId = sc.nextInt();
                    library.borrowBook(borrowId);
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId);
                    break;

                case 4:
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    library.searchBook(title);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
