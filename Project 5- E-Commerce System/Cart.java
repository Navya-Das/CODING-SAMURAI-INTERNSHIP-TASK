import java.util.ArrayList;

public class Cart {
	  ArrayList<Product> cartItems = new ArrayList<>();

	    void addProduct(Product p) {
	        cartItems.add(p);
	        System.out.println(p.name + " added to cart");
	    }

	    void viewCart() {
	        double total = 0;

	        for (Product p : cartItems) {
	            System.out.println(p.name + " - Rs" + p.price);
	            total += p.price;
	        }

	        System.out.println("Total: $" + total);
	    }
}
