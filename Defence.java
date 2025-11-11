package Defence.java;

class Defence {
	    String NameofHead;
	    int NoofVehicles;
	    String CountryName;
	    int noofCasualities;
	    int noofMission;
	    int noofDept;
	    String locationofHeadquarters;

	    Defence() {
	        this.NameofHead = "Shershah";
	        this.NoofVehicles = 39;
	        this.CountryName = "India";
	        this.noofCasualities = 34;
	        this.noofMission = 74;
	        this.noofDept = 30;
	        this.locationofHeadquarters = "Pune";
	    }

	    Defence(String NameofHead, int NoofVehicles, String CountryName,
	            int noofCasualities, int noofMission, int noofDept,
	            String locationofHeadquarters) {

	        this.NameofHead = NameofHead;
	        this.NoofVehicles = NoofVehicles;
	        this.CountryName = CountryName;
	        this.noofCasualities = noofCasualities;
	        this.noofMission = noofMission;
	        this.noofDept = noofDept;
	        this.locationofHeadquarters = locationofHeadquarters;
	    }

	    void display() {
	        System.out.println("Head: " + NameofHead);
	        System.out.println("Vehicles: " + NoofVehicles);
	        System.out.println("Country: " + CountryName);
	        System.out.println("Casualties: " + noofCasualities);
	        System.out.println("Missions: " + noofMission);
	        System.out.println("Departments: " + noofDept);
	        System.out.println("Headquarters: " + locationofHeadquarters);
	    }
	}

	class Army extends Defence {

	    int noofTanks;
	    int noofGuns;
	    int noofGranties;
	    int noofBattelians;

	    Army() {
	        super();
	        this.noofTanks = 40;
	        this.noofGuns = 80;
	        this.noofGranties = 60;
	        this.noofBattelians = 100;
	    }

	    Army(String NameofHead, int NoofVehicles, String CountryName,
	         int noofCasualities, int noofMission, int noofDept,
	         String locationofHeadquarters,
	         int noofTanks, int noofGuns, int noofGranties, int noofBattelians) {

	        super(NameofHead, NoofVehicles, CountryName,
	                noofCasualities, noofMission, noofDept, locationofHeadquarters);

	        this.noofTanks = noofTanks;
	        this.noofGuns = noofGuns;
	        this.noofGranties = noofGranties;
	        this.noofBattelians = noofBattelians;
	    }

	    void display() {
	        super.display();
	        System.out.println("Tanks: " + noofTanks);
	        System.out.println("Guns: " + noofGuns);
	        System.out.println("Grantees: " + noofGranties);
	        System.out.println("Battalions: " + noofBattelians);
	    }
	}

	class Navy extends Defence {

	    int noofShips;
	    int noofSubmarines;
	    int noofTorpedoes;
	    String nameofShip;

	    Navy() {
	        super();
	        this.noofShips = 65;
	        this.noofSubmarines = 35;
	        this.noofTorpedoes = 45;
	        this.nameofShip = "Titanic";
	    }

	    Navy(String NameofHead, int NoofVehicles, String CountryName,
	         int noofCasualities, int noofMission, int noofDept,
	         String locationofHeadquarters,
	         int noofShips, int noofSubmarines, int noofTorpedoes, String nameofShip) {

	        super(NameofHead, NoofVehicles, CountryName,
	                noofCasualities, noofMission, noofDept, locationofHeadquarters);

	        this.noofShips = noofShips;
	        this.noofSubmarines = noofSubmarines;
	        this.noofTorpedoes = noofTorpedoes;
	        this.nameofShip = nameofShip;
	    }

	    void display() {
	        super.display();
	        System.out.println("Ships: " + noofShips);
	        System.out.println("Submarines: " + noofSubmarines);
	        System.out.println("Torpedoes: " + noofTorpedoes);
	        System.out.println("Main Ship: " + nameofShip);
	    }
	}


	class AirForce extends Defence {

	    int noofMissionsAF;
	    int noofAirCraft;
	    int noofSquadrons;

	    AirForce() {
	        super();
	        this.noofMissionsAF = 90;
	        this.noofAirCraft = 87;
	        this.noofSquadrons = 78;
	    }

	    AirForce(String NameofHead, int NoofVehicles, String CountryName,
	             int noofCasualities, int noofMission, int noofDept,
	             String locationofHeadquarters,
	             int noofMissionsAF, int noofAirCraft, int noofSquadrons) {

	        super(NameofHead, NoofVehicles, CountryName,
	                noofCasualities, noofMission, noofDept, locationofHeadquarters);

	        this.noofMissionsAF = noofMissionsAF;
	        this.noofAirCraft = noofAirCraft;
	        this.noofSquadrons = noofSquadrons;
	    }

	    void display() {
	        super.display();
	        System.out.println("Air Missions: " + noofMissionsAF);
	        System.out.println("Aircraft: " + noofAirCraft);
	        System.out.println("Squadrons: " + noofSquadrons);
	    }
	}


	class DemoDefence {

	    public static void main(String[] args) {

	        Army a1 = new Army();
	        a1.display();

	        System.out.println("\nArmy");
	        Army a2 = new Army("Gabbar", 45, "India", 54, 76, 34,
	                "Mumbai", 120, 200, 90, 150);
	        a2.display();

	        System.out.println("\n Navy");
	        Navy n1 = new Navy();
	        n1.display();

	        System.out.println("\nNavy");
	        Navy n2 = new Navy("Shyam", 80, "India", 22, 78, 30,
	                "Goa", 50, 20, 40, "INS Kochi");
	        n2.display();

	        System.out.println("\nAir Force");
	        AirForce f1 = new AirForce();
	        f1.display();

	        System.out.println("\nAir Force");
	        AirForce f2 = new AirForce("Raj", 70, "India", 15, 45, 20,
	                "Bengaluru", 120, 150, 20);
	        f2.display();
	    }
	}
