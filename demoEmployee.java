package javademo;

class Employee
{
    int id;
    String name;
    double salary;

    Employee() 
    {
        this.id = 1;
        this.name = "Siya";
        this.salary = 100000;
    }

    Employee(int id, String name, double salary) 
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() 
    {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class SalesManager extends Employee
{
    String department;
    double bonus;

    SalesManager() 
    {
        super();
        this.department = "General";
        this.bonus = 2000;
    }

    SalesManager(int id, String name, double salary, String department, double bonus)
    {
        super(id, name, salary);
        this.department = department;
        this.bonus = bonus;
    }

    void display()
    {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
    }
}

class AreaSalesManager extends SalesManager {
    String area;

    AreaSalesManager()
    {
    	super();
        this.area = "Default Area";
    }

    AreaSalesManager(int id, String name, double salary, String department, double bonus, String area)
    {
        super(id, name, salary, department, bonus);
        this.area = area;
    }
    

    public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	void display() 
    {
        super.display();
        System.out.println("Area: " + area);
    }
}

class Admin extends Employee {
    double allowance;

    Admin() 
    {
        super();
        this.allowance = 5600;
    }

    Admin(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	void display()
    {
        super.display();
        System.out.println("Allowance: " + allowance);
    }
}

class DemoEmployee 
{
    public static void main(String[] args) 
    {

        SalesManager m1 = new SalesManager();
        m1.display();

        System.out.println();

        SalesManager m2 = new SalesManager(23, "Sneha", 58940, "Sales", 3000);
        m2.display();

        System.out.println();

        AreaSalesManager a1 = new AreaSalesManager();
        a1.display();

        System.out.println();

        AreaSalesManager a2 = new AreaSalesManager(44, "Neha", 58940, "Sales", 3000, "Pune");
        a2.display();

        System.out.println();

        Admin ad1 = new Admin();
        ad1.display();

        System.out.println();

        Admin ad2 = new Admin(2, "Shreya", 36706, 4569);
        ad2.display();
    }
}
