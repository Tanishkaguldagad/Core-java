class Book {
    int isbn;
    String bname;
    String category;
    double price;

    // Setter methods
    void setIsbn(int i) {
        this.isbn = i;
    }

    void setBname(String n) {
        this.bname = n;
    }

    void setCategory(String c) {
        this.category = c;
    }

    void setPrice(double p) {
        this.price = p;
    }

    // Getter methods
    int getIsbn() {
        return this.isbn;
    }

    String getBname() {
        return this.bname;
    }

    String getCategory() {
        return this.category;
    }

    double getPrice() {
        return this.price;
    }

    // Display method
    void display() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Book Name: " + this.bname);
        System.out.println("Category: " + this.category);
        System.out.println("Price: ₹" + this.price);
    }
} // Book class ends here


class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book(); // Create object

        // Setting values
        b1.setIsbn(1001);
        b1.setBname("Core Java Programming");
        b1.setCategory("Technology");
        b1.setPrice(499.99);

        // Displaying values
        b1.display();

        System.out.println("\nBook Details (Using Getters):");
        System.out.println("ISBN: " + b1.getIsbn());
        System.out.println("Book Name: " + b1.getBname());
        System.out.println("Category: " + b1.getCategory());
        System.out.println("Price: ₹" + b1.getPrice());
    }
} // BookTest ends here
