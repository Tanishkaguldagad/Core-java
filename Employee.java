class Employee {
    int id;
    String name;
    double salary;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    } 
      int getId()
{
  return this.id;
}
 String getName()
{
  return this.name;
}
double getSalary()
{
  return this.salary;
}
void display()
{
System.out.println("Id is"+this.id);
System.out.println("Name is"+this.name);
System.out.println("Salary is"+this.salary);
}

}//employee class ends here

     class EmployeeTest
{
    public static void main(String[] args) 
{
        Employee e1 = new Employee();  // create object of Employee

        e1.setId(101);
        e1.setName("Tanishka");
        e1.setSalary(55000.50);
        e1.display();

        System.out.println("Employee Details:");
        System.out.println("ID: " + e1.id);
        System.out.println("Name: " + e1.name);
        System.out.println("Salary: " + e1.salary);
    }
}
