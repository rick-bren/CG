class Product {
    private static double discount = 10.0;

    private String productName;
    private double price;
    private int quantity;
    private final String productID;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = this.productName = productName;
        this.price = this.price = price;
        this.quantity = this.quantity = quantity;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID    : " + productID);
            System.out.println("Product Name  : " + productName);
            System.out.println("Price         : ₹" + price);
            System.out.println("Quantity      : " + quantity);
            System.out.println("Discount      : " + discount + "%");
            System.out.println("Total After Discount: ₹" + calculateTotal());
        }
    }

    public double calculateTotal() {
        double total = price * quantity;
        return total - (total * discount / 100);
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product("P101", "Laptop", 50000, 1);
        Product p2 = new Product("P102", "Headphones", 2000, 2);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();

        Product.updateDiscount(15.0);
        System.out.println("Updated Discount Applied:\n");

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
    }
}
