class Student {
    int rollno;
    String name;
    double marks;

    // Setter methods
    void setRollno(int r) {
        this.rollno = r;
    }

    void setName(String n) {
        this.name = n;
    }

    void setMarks(double m) {
        this.marks = m;
    }

    // Getter methods
    int getRollno() {
        return this.rollno;
    }

    String getName() {
        return this.name;
    }

    double getMarks() {
        return this.marks;
    }

    // Display method
    void display() {
        System.out.println("Roll No: " + this.rollno);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
    }
} // Student class ends here


class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Setting values
        s1.setRollno(10);
        s1.setName("Tanishka");
        s1.setMarks(89.5);

        // Displaying details
        s1.display();

        // Using getters
        System.out.println("\nStudent Details (Using Getters):");
        System.out.println("Roll No: " + s1.getRollno());
        System.out.println("Name: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
    }
} // StudentTest ends here
