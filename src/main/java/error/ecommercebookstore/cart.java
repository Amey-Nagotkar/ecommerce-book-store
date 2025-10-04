package error.ecommercebookstore;

import java.util.ArrayList;
import java.util.List;

public class cart {
    // Holds all cart items
    private static List<String[]> cartItems = new ArrayList<>();
    // Add a book to the cart
    public static void addBook(String title, String author, double price) {
        cartItems.add(new String[]{title, author, String.valueOf(price)});
    }
    // Get all items in the cart
    public static List<String[]> getCartItems() {
        return new ArrayList<>(cartItems); // return a copy to avoid external modification
    }
    // Remove a specific item by index
    public static void removeBook(int index) {
        if (index >= 0 && index < cartItems.size()) {
            cartItems.remove(index);
        }
    }
    // Clear the entire cart
    public static void clearCart() {
        cartItems.clear();
    }
    // Get total price of items in the cart
    public static double getTotalPrice() {
        double total = 0;
        for (String[] item : cartItems) {
            total += Double.parseDouble(item[2]);
        }
        return total;
    }
    // Check if cart is empty
    public static boolean isEmpty() {
        return cartItems.isEmpty();
    }
}
