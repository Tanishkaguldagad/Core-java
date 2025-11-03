class Admin {
    int id;
    String name;
    double salary;
    double allowance;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setAllowance(double a) {
        this.allowance = a;
    }
     int getId()
{ 
    return this.id;
}
    String getName()
{
     return this.name();
}
    Double getsalary()
{
    return this.salary;
}
    double getAllowence()
{
   return this.allowence;
}
void display()
{
System.out.println("Id is"+this.id);
System.out.println("Name is"+this.name);
System.out.println("Salary is"+this.salary);
System.out.println("Allowence is"+this.allowence);
}

      } //Admin ends here

class AdminTest
{
    public static void main(String[] args)
 {
        Admin a1 = new Admin(); // create object of Admin class

        // setting values
        a1.setId(201);
        a1.setName("Tanishka");
        a1.setSalary(60000);
        a1.setAllowance(5000);
        display();

        // displaying values
        System.out.println("Admin Details:");
        System.out.println("ID: " + a1.id);
        System.out.println("Name: " + a1.name);
        System.out.println("Salary: " + a1.salary);
        System.out.println("Allowance: " + a1.allowance);
    }
}
