class Car {
    String model;
    String brand;
    double price;
    String colour;
    double fuelCapacity;

    void setModel(String m) {
        this.model = m;
    }

    void setBrand(String b) {
        this.brand = b;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setColour(String c) {
        this.colour = c;
    }

    void setFuelCapacity(double f) {
        this.fuelCapacity = f;
    }

    public static void main(String[] args) {
        Car c1 = new Car();

        c1.setModel("City ZX");
        c1.setBrand("Honda");
        c1.setPrice(1450000);
        c1.setColour("White");
        c1.setFuelCapacity(40);

        System.out.println("Car Details:");
        System.out.println("Model: " + c1.model);
        System.out.println("Brand: " + c1.brand);
        System.out.println("Price: ₹" + c1.price);
        System.out.println("Colour: " + c1.colour);
        System.out.println("Fuel Capacity: " + c1.fuelCapacity + " Litres");
    }
}
