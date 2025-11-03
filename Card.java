class Car {
    String model;
    String brand;
    double price;
    String colour;
    double fuelCapacity;

    // Setter methods
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

    // Getter methods
    String getModel() {
        return this.model;
    }

    String getBrand() {
        return this.brand;
    }

    double getPrice() {
        return this.price;
    }

    String getColour() {
        return this.colour;
    }

    double getFuelCapacity() {
        return this.fuelCapacity; // fixed capitalization
    }

    // Display method
    void display() {
        System.out.println("Model: " + this.model);
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: ₹" + this.price);
        System.out.println("Colour: " + this.colour);
        System.out.println("Fuel Capacity: " + this.fuelCapacity + " Litres");
    }
} // Car ends here


class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(); // create object of Car class

        // Setting values
        c1.setModel("City ZX");
        c1.setBrand("Honda");
        c1.setPrice(1450000);
        c1.setColour("White");
        c1.setFuelCapacity(40);

        // Displaying values using display() method
        c1.display();

        // Displaying values using getter methods
        System.out.println("\nCar Details (Using Getters):");
        System.out.println("Model: " + c1.getModel());
        System.out.println("Brand: " + c1.getBrand());
        System.out.println("Price: ₹" + c1.getPrice());
        System.out.println("Colour: " + c1.getColour());
        System.out.println("Fuel Capacity: " + c1.getFuelCapacity() + " Litres");
    }
} // CarTest ends here
