class Book {
    int isbn;
    String bname;
    String category;
    double price;

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

    public static void main(String[] args) {
        Book b1 = new Book();

        b1.setIsbn(1001);
        b1.setBname("Core Java Programming");
        b1.setCategory("Technology");
        b1.setPrice(499.99);

        System.out.println("Book Details:");
        System.out.println("ISBN: " + b1.isbn);
        System.out.println("Book Name: " + b1.bname);
        System.out.println("Category: " + b1.category);
        System.out.println("Price: ₹" + b1.price);
    }
}
