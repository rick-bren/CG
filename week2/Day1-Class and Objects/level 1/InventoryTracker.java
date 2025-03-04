import java.util.Scanner;

class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: ₹" + String.format("%.2f", price));
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Item item = new Item(code, name, price);

        System.out.println("\nItem Details:");
        item.displayDetails();

        System.out.print("\nEnter quantity to purchase: ");
        int quantity = sc.nextInt();

        double total = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: ₹" + String.format("%.2f", total));

        sc.close();
    }
}
