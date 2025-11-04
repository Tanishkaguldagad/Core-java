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

    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    BigDecimal getIncentive() {
        return this.incentive;
    }

    double getTarget() {
        return this.target;
    }

      void display() {
        System.out.println("Sales Manager Details:");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: ₹" + this.salary);
        System.out.println("Incentive: ₹" + this.incentive);
        System.out.println("Target (in units): " + this.target);
    }
}

class SalesManagerTest {
    public static void main(String[] args) {
        SalesManager sm1 = new SalesManager();

        // Setting values
        sm1.setId(301);
        sm1.setName("Tanishka");
        sm1.setSalary(75000);
        sm1.setIncentive(new BigDecimal("5000.50"));
        sm1.setTarget(10);
        sm1.display();

        System.out.println("\nSales Manager Details (Using Getters):");
        System.out.println("ID: " + sm1.getId());
        System.out.println("Name: " + sm1.getName());
        System.out.println("Salary: ₹" + sm1.getSalary());
        System.out.println("Incentive: ₹" + sm1.getIncentive());
        System.out.println("Target: " + sm1.getTarget());
    }
}
