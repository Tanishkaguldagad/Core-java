class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    void setProductId(int id) {
        this.productId = id;
    }

    void setProductName(String name) {
        this.productName = name;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setQuantity(int q) {
        this.quantity = q;
    }

    // Getter methods
    int getProductId() {
        return this.productId;
    }

    String getProductName() {
        return this.productName;
    }

    double getPrice() {
        return this.price;
    }

    int getQuantity() {
        return this.quantity;
    }

        void display() {
        System.out.println("Product ID: " + this.productId);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Price: ₹" + this.price);
        System.out.println("Quantity: " + this.quantity);
    }
} // Product class ends here


class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setProductId(201);
        p1.setProductName("SmartWatch");
        p1.setPrice(15089.99);
        p1.setQuantity(25);
        p1.display();

        System.out.println("\nProduct Details (Using Getters):");
        System.out.println("Product ID: " + p1.getProductId());
        System.out.println("Product Name: " + p1.getProductName());
        System.out.println("Price: ₹" + p1.getPrice());
        System.out.println("Quantity: " + p1.getQuantity());
    }
} // ProductTest class ends here
