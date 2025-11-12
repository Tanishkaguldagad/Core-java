package Hospital;
class Hospital 
{
	  String hospitalName;
	   String location;
	    int totalBeds;

	    
	    Hospital() {
	        this.hospitalName = "CityCare Hospital";
	        this.location = "Pune";
	        this.totalBeds = 200;
	    }

	   
	    Hospital(String hospitalName, String location, int totalBeds) {
	        this.hospitalName = hospitalName;
	        this.location = location;
	        this.totalBeds = totalBeds;
	    }

	    public String getHospitalName() {
			return hospitalName;
		}


		public void setHospitalName(String hospitalName) {
			this.hospitalName = hospitalName;
		}


		public String getLocation() {
			return location;
		}


		public void setLocation(String location) {
			this.location = location;
		}


		public int getTotalBeds() {
			return totalBeds;
		}


		public void setTotalBeds(int totalBeds) {
			this.totalBeds = totalBeds;
		}


		void display() {
	        System.out.println("Hospital Name: " + hospitalName);
	        System.out.println("Location: " + location);
	        System.out.println("Total Beds: " + totalBeds);
	    }
	}

	class Doctor extends Hospital 
	{
	    int doctorId;
	    String specialization;
	    double salary;

	    Doctor() {
	        super(); 
	        this.doctorId = 101;
	        this.specialization = "Cardiologist";
	        this.salary = 85000.50;
	    }

	    Doctor(String hospitalName, String location, int totalBeds,
	           int doctorId, String specialization, double salary) {
	        super(hospitalName, location, totalBeds);
	        this.doctorId = doctorId;
	        this.specialization = specialization;
	        this.salary = salary;
	    }

	    public int getDoctorId() {
			return doctorId;
		}

		public void setDoctorId(int doctorId) {
			this.doctorId = doctorId;
		}

		public String getSpecialization() {
			return specialization;
		}

		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		void display() {
	        super.display();
	        System.out.println("Doctor ID: " + doctorId);
	        System.out.println("Specialization: " + specialization);
	        System.out.println("Salary: " + salary);
	    }
	}

	class Patient extends Hospital {
	    int patientId;
	    String disease;
	    int daysAdmitted;
	    
	    Patient() {
	        super();
	        this.patientId = 501;
	        this.disease = "Fever";
	        this.daysAdmitted = 3;
	    }

	    Patient(String hospitalName, String location, int totalBeds,
	            int patientId, String disease, int daysAdmitted) {
	        super(hospitalName, location, totalBeds);
	        this.patientId = patientId;
	        this.disease = disease;
	        this.daysAdmitted = daysAdmitted;
	    }

	    void display() {
	        super.display();
	        System.out.println("Patient ID: " + patientId);
	        System.out.println("Disease: " + disease);
	        System.out.println("Days Admitted: " + daysAdmitted);
	    }
	}

	class HospitalDemo {
	    public static void main(String[] args) {
	        System.out.println("Default Doctor Details:");
	        Doctor d1 = new Doctor();
	        d1.display();

	        System.out.println("\nParameterized Doctor Details:");
	        Doctor d2 = new Doctor("Healing Touch", "Mumbai", 300, 102, "Neurologist", 95000.00);
	        d2.display();

	        System.out.println("\n Default Patient Details:");
	        Patient p1 = new Patient();
	        p1.display();

	        System.out.println("\n Parameterized Patient Details:");
	        Patient p2 = new Patient("HealthPlus", "Delhi", 400, 502, "Pneumonia", 7);
	        p2.display();
	    }
	}

