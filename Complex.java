class Complex {
    double real;
    double imaginary;

    void setReal(double r) {
        this.real = r;
    }

    void setImaginary(double i) {
        this.imaginary = i;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();

        c1.setReal(5.5);
        c1.setImaginary(3.2);

        System.out.println("Complex Number Details:");
        System.out.println("Real Part: " + c1.real);
        System.out.println("Imaginary Part: " + c1.imaginary);
        System.out.println("Complex Number: " + c1.real + " + " + c1.imaginary + "i");
    }
}
