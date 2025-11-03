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

    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setProductId(201);
        p1.setProductName("SmartWatch");
        p1.setPrice(15089.99);
        p1.setQuantity(25);

        System.out.println("Product Details:");
        System.out.println("Product ID: " + p1.productId);
        System.out.println("Product Name: " + p1.productName);
        System.out.println("Price: " + p1.price);
        System.out.println("Quantity: " + p1.quantity);
    }
}
