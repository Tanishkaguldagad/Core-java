class Complex {
    double real;
    double imaginary;

    // Setter methods
    void setReal(double r) {
        this.real = r;
    }

    void setImaginary(double i) {
        this.imaginary = i;
    }

    // Getter methods
    double getReal() {
        return this.real; // fixed: removed ()
    }

    double getImaginary() {
        return this.imaginary; // fixed: removed ()
    }

    // Display method
    void display() {
        System.out.println("Real part: " + this.real);
        System.out.println("Imaginary part: " + this.imaginary);
    }
} // COMPLEX ENDS HERE


class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(); // create object of Complex class

        c1.setReal(5.5);
        c1.setImaginary(3.2);

        c1.display();

        System.out.println("\nComplex Number Details:");
        System.out.println("Real Part: " + c1.getReal());
        System.out.println("Imaginary Part: " + c1.getImaginary());
        System.out.println("Complex Number: " + c1.getReal() + " + " + c1.getImaginary() + "i");
    }
} // COMPLEXTEST ENDS HERE
