import java.util.*;
public class Student {
    int fbid;
    String name;
    double distance;
    static int count = 0;

    Student() {
        System.out.println("Student Default Constructor called");
        this.fbid = 101;
        this.name = "Tanishka";
        this.distance = 2.3;
        count++;
    }

    Student(int fbid, String name, double distance) {
        System.out.println("Student Parameterised Constructor called");
        this.fbid = fbid;
        this.name = name;
        this.distance = distance;
        count++;
    }

    void setFbid(int fbid) { this.fbid = fbid; }
    void setName(String name) { this.name = name; }
    void setDistance(double distance) { this.distance = distance; }

    int getFbid() { return fbid; }
    String getName() { return name; }
    double getDistance() { return distance; }

    static int getCount() { return count; }

    void display() {
        System.out.println("FBID: " + fbid);
        System.out.println("Name: " + name);
        System.out.println("Distance: " + distance);
        System.out.println();
    }
}

class PlacedStudents extends Student {
    String cName;
    String destination;

    PlacedStudents() {
        super();
        System.out.println("PlacedStudents Default Constructor called");
        this.cName = "xyz";
        this.destination = "Pune";
    }

    PlacedStudents(int fbid, String name, double distance, String cName, String destination) {
        super(fbid, name, distance);
        System.out.println("PlacedStudents Parameterised Constructor called");
        this.cName = cName;
        this.destination = destination;
    }

    void setCName(String cName) {
    	this.cName = cName;
    	}
    void setDestination(String destination) 
    {
    	this.destination = destination; 
    	}

    String getCName()
    {
    	return cName;
    	}
    String getDestination()
    {
    	return destination;
    	}

    void display() {
        super.display();
        System.out.println("Company Name: " + cName);
        System.out.println("Destination: " + destination);
    }
}

class DemoInheritance {
    public static void main(String[] args) {
        PlacedStudents ps1 = new PlacedStudents();
        ps1.display();

        System.out.println("\n");

        PlacedStudents ps2 = new PlacedStudents(201, "Riya", 10.2, "TCS", "Pune");
        ps2.display();

        System.out.println("Student total count: " + Student.getCount());
    }
}
