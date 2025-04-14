
import java.util.*;

// Interface for taxable products
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation: Getters and setters
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    // Abstract method for discount
    public abstract double calculateDiscount();

    // Polymorphic method to calculate final price
    public double getFinalPrice() {
        double tax = (this instanceof Taxable) ? ((Taxable)this).calculateTax() : 0;
        double discount = this.calculateDiscount();
        return price + tax - discount;
    }

    public void printFinalPrice() {
        System.out.println("Product: " + name);
        System.out.println("Base Price: ₹" + price);
        if (this instanceof Taxable) {
            Taxable t = (Taxable) this;
            System.out.println("Tax: ₹" + t.calculateTax());
            System.out.println("Tax Details: " + t.getTaxDetails());
        } else {
            System.out.println("Tax: ₹0 (Not Taxable)");
        }
        System.out.println("Discount: ₹" + calculateDiscount());
        System.out.println("Final Price: ₹" + getFinalPrice());
        System.out.println("-------------------------------");
    }
}

// Electronics class
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    public String getTaxDetails() {
        return "18% GST applied on Electronics";
    }
}

// Clothing class
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    public String getTaxDetails() {
        return "5% GST applied on Clothing";
    }
}

// Groceries class
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

// Main class to test
public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Smartphone", 20000));
        products.add(new Clothing(102, "T-Shirt", 1000));
        products.add(new Groceries(103, "Rice Bag", 800));

        System.out.println("----- Product Summary -----");
        for (Product p : products) {
            p.printFinalPrice();
        }
    }
}



