import java.math.BigDecimal;

class SalesManager {
    int id;
    String name;
    double salary;
    BigDecimal incentive;
    double target;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setIncentive(BigDecimal inc) {
        this.incentive = inc;
    }

    void setTarget(double t) {
        this.target = t;
    }

    public static void main(String[] args) {
        SalesManager sm1 = new SalesManager();  // create object of SalesManager class

        // setting values
        sm1.setId(301);
        sm1.setName("Tanishka");
        sm1.setSalary(75000);
        sm1.setIncentive(new BigDecimal("5000.50"));
        sm1.setTarget(10);

        // displaying details
        System.out.println("Sales Manager Details:");
        System.out.println("ID: " + sm1.id);
        System.out.println("Name: " + sm1.name);
        System.out.println("Salary: " + sm1.salary);
        System.out.println("Incentive: " + sm1.incentive);
        System.out.println("Target: " + sm1.target);
    }
}
