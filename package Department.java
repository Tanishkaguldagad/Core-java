package Department;
class Department 
{
	    String deptName;
	    int totalEmployees;
	    String location;

	    Department() {
	        this.deptName = "General Department";
	        this.totalEmployees = 25;
	        this.location = "Main Building";
	    }

	    Department(String deptName, int totalEmployees, String location) {
	        this.deptName = deptName;
	        this.totalEmployees = totalEmployees;
	        this.location = location;
	    }

	    void display() {
	        System.out.println("Department Name: " + deptName);
	        System.out.println("Total Employees: " + totalEmployees);
	        System.out.println("Location: " + location);
	    }
	}

	class TeachingDepartment extends Department 
	{
	    int noOfProfessors;
	    int noOfStudents;
	    String subject;

	    TeachingDepartment() 
	    {
	        super();
	        this.noOfProfessors = 10;
	        this.noOfStudents = 500;
	        this.subject = "Computer Science";
	    }

	    TeachingDepartment(String deptName, int totalEmployees, String location,
	                       int noOfProfessors, int noOfStudents, String subject)
	    {
	        super(deptName, totalEmployees, location);
	        this.noOfProfessors = noOfProfessors;
	        this.noOfStudents = noOfStudents;
	        this.subject = subject;
	    }

	    public int getNoOfProfessors() {
			return noOfProfessors;
		}

		public void setNoOfProfessors(int noOfProfessors) {
			this.noOfProfessors = noOfProfessors;
		}

		public int getNoOfStudents() {
			return noOfStudents;
		}

		public void setNoOfStudents(int noOfStudents) {
			this.noOfStudents = noOfStudents;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		void display() 
		{
	        super.display();
	        System.out.println("No. of Professors: " + noOfProfessors);
	        System.out.println("No. of Students: " + noOfStudents);
	        System.out.println("Subject: " + subject);
	    }
	}

	class NonTeachingDepartment extends Department
	{
	    int staffCount;
	    String section;
	    String headName;

	    NonTeachingDepartment() {
	        super();
	        this.staffCount = 8;
	        this.section = "Administration";
	        this.headName = "Mr. Udawant";
	    }

	    NonTeachingDepartment(String deptName, int totalEmployees, String location,
	                          int staffCount, String section, String headName)
	    {
	        super(deptName, totalEmployees, location);
	        this.staffCount = staffCount;
	        this.section = section;
	        this.headName = headName;
	    }

	    public int getStaffCount()
	    {
			return staffCount;
		}

		public void setStaffCount(int staffCount)
		{
			this.staffCount = staffCount;
		}

		public String getSection() 
		{
			return section;
		}

		public void setSection(String section)
		{
			this.section = section;
		}

		public String getHeadName() 
		{
			return headName;
		}

		public void setHeadName(String headName) 
		{
			this.headName = headName;
		}

		void display()
		{
	        super.display();
	        System.out.println("Staff Count: " + staffCount);
	        System.out.println("Section: " + section);
	        System.out.println("Head Name: " + headName);
	    }
	}

	class DepartmentDemo
	{
	    public static void main(String[] args) {
	        System.out.println("Default Teaching Department:");
	        TeachingDepartment t1 = new TeachingDepartment();
	        t1.display();

	        System.out.println("\nParameterized Teaching Department:");
	        TeachingDepartment t2 = new TeachingDepartment("Computer Dept", 60, "Block A", 15, 600, "AI & ML");
	        t2.display();

	        System.out.println("\nDefault Non-Teaching Department:");
	        NonTeachingDepartment n1 = new NonTeachingDepartment();
	        n1.display();

	        System.out.println("\nParameterized Non-Teaching Department:");
	        NonTeachingDepartment n2 = new NonTeachingDepartment("Admin Dept", 30, "Block B", 12, "Finance", "Mrs.Patil");


}
	    }
