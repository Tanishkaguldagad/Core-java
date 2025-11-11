package Shape.java;
class Shape 
{
	    String type;  

	    Shape() 
	    {
	        this.type = "Generic Shape";
	    }

	    Shape(String type) {
	        this.type = type;
	    }

	    void setType(String type) {
	        this.type = type;
	    }

	    String getType() {
	        return type;
	    }

	    void display() {
	        System.out.println("Shape Type: " + type);
	    }
	}
class Circle extends Shape 
{
	    double radius;

	    Circle() 
	    {
	        super("Circle"); 
	        this.radius = 5.0;
	    }

	    Circle(double radius)
	    {
	        super("Circle");
	        this.radius = radius;
	    }

	    void setRadius(double radius)
	    {
	        this.radius = radius;
	    }

	    double getRadius() 
	    {
	        return radius;
	    }

	    void display() 
	    {
	        super.display();
	        System.out.println("Radius: " + radius);
	    }
	}

	class Rectangle extends Shape
	{
	    double length;
	    double width;

	    Rectangle() {
	        super("Rectangle");
	        this.length = 10.0;
	        this.width = 5.0;
	    }

	    Rectangle(double length, double width) 
	    {
	        super("Rectangle");
	        this.length = length;
	        this.width = width;
	    }

	    void setLength(double length) 
	    {
	        this.length = length;
	    }

	    void setWidth(double width)
	    {
	        this.width = width;
	    }

	    double getLength()
	    {
	        return length;
	    }

	    double getWidth() 
	    {
	        return width;
	    }

	    void display() 
	    {
	        super.display();
	        System.out.println("Length: " + length);
	        System.out.println("Width: " + width);
	    }
	}

	class DemoShape {
	    public static void main(String[] args)
	    {

	        System.out.println("Default Circle:");
	        Circle c1 = new Circle();
	        c1.display();

	        System.out.println("\nParameterized Circle:");
	        Circle c2 = new Circle(12.5);
	        c2.display();

	        System.out.println("\nDefault Rectangle:");
	        Rectangle r1 = new Rectangle();
	        r1.display();

	        System.out.println("\nParameterized Rectangle:");
	        Rectangle r2 = new Rectangle(15.0, 8.0);
	        r2.display();
	    }
	}

