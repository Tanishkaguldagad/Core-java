package ElectronicDevice.java;

class ElectronicDevice {

	    private String brand;
	    private double price;

	    ElectronicDevice() {
	        this.brand = "Smart Watch";
	        this.price = 1500;
	    }

	    ElectronicDevice(String brand, double price) {
	        this.brand = brand;
	        this.price = price;
	    }

	    // Getters
	    String getBrand() { return brand; }
	    double getPrice() { return price; }

	    // Setters
	    void setBrand(String brand) { this.brand = brand; }
	    void setPrice(double price) { this.price = price; }

	    void display() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Price: " + price);
	    }
	}

	class SmartPhone extends ElectronicDevice
	{
	    int storage;
	    String os;

	    SmartPhone()
	    {
	        super();
	        this.storage = 64;
	        this.os = "Android";
	    }

	    SmartPhone(String brand, double price, int storage, String os) 
	    {
	        super(brand, price);
	        this.storage = storage;
	        this.os = os;
	    }

	    int getStorage() 
	    { 
	    	return storage; 
	    	}
	    String getOs() 
	    {
	    	return os; 
	    	}

	    void setStorage(int storage) 
	    {
	    	this.storage = storage;
	    	}
	    void setOs(String os) 
	    {
	    	this.os = os; 
	    	}

	    void display() 
	    {
	        super.display();
	        System.out.println("Storage: " + storage + " GB");
	        System.out.println("Operating System: " + os);
	    }
	}

	class AC extends ElectronicDevice 
	{
	    int tonnage;          
	    String type;         
	    int powerConsumption;

	    AC() 
	    {
	        super();
	        this.tonnage = 1;
	        this.type = "Split";
	        this.powerConsumption = 1200;
	    }

	    AC(String brand, double price, int tonnage, String type, int powerConsumption)
	    {
	        super(brand, price);
	        this.tonnage = tonnage;
	        this.type = type;
	        this.powerConsumption = powerConsumption;
	    }

	    int getTonnage()
	    { 
	    	return tonnage; 
	    	}
	    String getType()
	    {
	    	return type;
	    	}
	    int getPowerConsumption() 
	    { 
	    	return powerConsumption; 
	    	}

	    void setTonnage(int tonnage)
	    {
	    	this.tonnage = tonnage; 
	    	}
	    void setType(String type) 
	    {
	    	this.type = type;
	    	}
	    void setPowerConsumption(int powerConsumption) 
	    {
	    	this.powerConsumption = powerConsumption; 
	    	}

	    void display() 
	    {
	        super.display();
	        System.out.println("Tonnage: " + tonnage + " Ton");
	        System.out.println("Type: " + type);
	        System.out.println("Power Consumption: " + powerConsumption + " Watts");
	    }
	}

	class DeviceDemo 
	{
	    public static void main(String[] args)
	    {

	        System.out.println("Default Smartphone:");
	        SmartPhone s1 = new SmartPhone();
	        s1.display();

	        System.out.println("\nParameterized Smartphone:");
	        SmartPhone s2 = new SmartPhone("Nokia", 4999.99, 32, "KaiOS");
	        s2.display();

	        System.out.println("\nDefault AC:");
	        AC ac1 = new AC();
	        ac1.display();

	        System.out.println("\nParameterized AC:");
	        AC ac2 = new AC("LG", 35000, 2, "Split", 1500);
	        ac2.display();
	    }
	}

