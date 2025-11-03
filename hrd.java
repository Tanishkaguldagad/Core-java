class Hr 
{
    int id;
    String name;
    double salary;
    double commission;

    void setId(int i)
 {
        this.id = i;
    }

    void setName(String n)
 {
        this.name = n;
    }

    void setSalary(double s) 
{
        this.salary = s;
    }

    void setCommission(double c) 
{
        this.commission = c;
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
double getcommission()
{
return this.commission;
}
void display()
{
System.out.println("Id is"+this.id);
System.out.println("Name is"+this.name);
System.out.println("Salary is"+this.salary);
System.out.println("Commission is"+this.salary);
}

}//hr ends here

class HrTest
{
    public static void main(String[] args) 
{
        Hr h1 = new Hr();

        h1.setId(101);
        h1.setName("Tanishka");
        h1.setSalary(50000);
        h1.setCommission(2500);
         h1.display();

       
        System.out.println("HR Details: " + h1.id + " / " + h1.name + " / " + h1.salary + " / " + h1.commission);
    } //main ends here
}
//hrtest ends here