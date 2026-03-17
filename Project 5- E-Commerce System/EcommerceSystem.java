import java.util.*;

public class EcommerceSystem {

    static ArrayList<Product> products = new ArrayList<>();
    static Cart cart = new Cart();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        products.add(new Product(1, "Laptop", 50000));
        products.add(new Product(2, "Phone", 10000));
        products.add(new Product(3, "Headphones", 1500));

        System.out.println("1. Register");
        System.out.println("2. Login");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            registerUser();
        } else {
            loginUser();
        }

        showMenu();
    }

    static void registerUser() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        User user = new User(username, password);
        FileManager.saveUser(user);

        System.out.println("Registration successful!");
    }

    static void loginUser() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        System.out.println("Login successful!");
    }

    static void showMenu() {

        while (true) {

            System.out.println("\n1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");

            int option = sc.nextInt();

            switch (option) {

                case 1:
                    for (Product p : products) {
                        p.displayProduct();
                    }
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    for (Product p : products) {
                        if (p.id == id) {
                            cart.addProduct(p);
                        }
                    }
                    break;

                case 3:
                    cart.viewCart();
                    break;

                case 4:
                    System.out.println("Order placed successfully!");
                    return;
            }
        }
    }
}