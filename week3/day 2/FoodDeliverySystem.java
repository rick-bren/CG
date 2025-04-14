
// Interface for discountable food items
interface Discountable {
    void applyDiscount(double discount);
    String getDiscountDetails();
}

// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation: Getters and setters
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Concrete method to get item details
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();
}

// VegItem class extends FoodItem
class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - getDiscount();
    }

    @Override
    public void applyDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: ₹" + discount;
    }

    public double getDiscount() {
        return (getPrice() * getQuantity()) * (discount / 100);
    }
}

// NonVegItem class extends FoodItem
class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private double additionalCharge;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
        this.additionalCharge = 20; // Additional charge for non-veg items
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + additionalCharge) - getDiscount();
    }

    @Override
    public void applyDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: ₹" + discount;
    }

    public double getDiscount() {
        return (getPrice() * getQuantity()) * (discount / 100);
    }
}

// Main class to test Online Food Delivery System
public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Create food items (both Veg and Non-Veg)
        FoodItem vegItem = new VegItem("Veg Burger", 150, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Burger", 250, 1);

        // Apply discounts
        ((Discountable) vegItem).applyDiscount(10); // 10% discount on Veg Item
        ((Discountable) nonVegItem).applyDiscount(5); // 5% discount on Non-Veg Item

        // Demonstrating polymorphism by processing both Veg and Non-Veg items in a single order-processing method
        FoodItem[] items = {vegItem, nonVegItem};

        // Processing each food item and printing details
        for (FoodItem item : items) {
            item.getItemDetails();
            System.out.println("Total Price after discount: ₹" + item.calculateTotalPrice());
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                System.out.println(discountableItem.getDiscountDetails());
            }
            System.out.println("-----------------------------------");
        }
    }
}



