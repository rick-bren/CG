import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemTotal() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println(itemName + " | ₹" + price + " x " + quantity + " = ₹" + String.format("%.2f", getItemTotal()));
    }
}

public class ShoppingCartSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();
        int choice;

        System.out.println("🛍️ Welcome to the Shopping Cart System");

        do {
            System.out.println("\n1. Add Item to Cart");
            System.out.println("2. Remove Item from Cart");
            System.out.println("3. View Cart & Total");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Item Price: ₹");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    cart.add(new CartItem(name, price, qty));
                    System.out.println("Item added to cart!");
                    break;

                case 2:
                    System.out.print("Enter Item Name to Remove: ");
                    String removeName = sc.nextLine();
                    boolean removed = false;

                    for (int i = 0; i < cart.size(); i++) {
                        if (cart.get(i).getItemName().equalsIgnoreCase(removeName)) {
                            cart.remove(i);
                            removed = true;
                            System.out.println("Item removed from cart.");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Item not found in cart.");
                    }
                    break;

                case 3:
                    double total = 0;
                    System.out.println("\n🛒 Your Cart:");
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty.");
                    } else {
                        for (CartItem item : cart) {
                            item.displayItem();
                            total += item.getItemTotal();
                        }
                        System.out.println("Total Cost: ₹" + String.format("%.2f", total));
                    }
                    break;

                case 4:
                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
