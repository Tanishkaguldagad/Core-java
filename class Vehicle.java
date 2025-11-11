class Vehicle {
    String brand;
    int speed;
    String fuelType;

    Vehicle() {
        this.brand = "Tata";
        this.speed = 0;
        this.fuelType = "Petrol";
    }

    Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle 
{
    int seats;
    String transmission;

    Car() 
    {
        super();
        this.seats = 4;
        this.transmission = "Manual";
    }

    Car(String brand, int speed, String fuelType, int seats, String transmission)
    {
        super(brand, speed, fuelType);
        this.seats = seats;
        this.transmission = transmission;
    }

    void display() 
    {
        super.display();
        System.out.println("Seats: " + seats);
        System.out.println("Transmission: " + transmission);
    }
}

class Bike extends Vehicle
{
    String type;
    int mileage;

    Bike() 
    {
        super();
        this.type = "Sports";
        this.mileage = 35;
    }

    Bike(String brand, int speed, String fuelType, String type, int mileage) 
    {
        super(brand, speed, fuelType);
        this.type = type;
        this.mileage = mileage;
    }

    void display() 
    {
        super.display();
        System.out.println("Bike Type: " + type);
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

class DemoVehicle
{
    public static void main(String[] args)
    {

        System.out.println("Default Car:");
        Car c1 = new Car();
        c1.display();

        System.out.println("\nParameterized Car:");
        Car c2 = new Car("Honda", 120, "Diesel", 5, "Automatic");
        c2.display();

        System.out.println("\nDefault Bike:");
        Bike b1 = new Bike();
        b1.display();

        System.out.println("\nParameterized Bike:");
        Bike b2 = new Bike("Yamaha", 150, "Petrol", "Cruiser", 40);
        b2.display();
    }
}
