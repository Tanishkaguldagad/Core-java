package Farmer.java;

class Farmer 
{
    int Farmerid;
    String FarmerName;
    int LandArea;
    String City;
    int AnnualIncome;

    Farmer() 
    {
        this.Farmerid = 101;
        this.FarmerName = "Ram";
        this.LandArea = 35;
        this.City = "Ahilyanagar";
        this.AnnualIncome = 500000;
    }

    Farmer(int Farmerid, String FarmerName, int LandArea, String City, int AnnualIncome) {
        this.Farmerid = Farmerid;
        this.FarmerName = FarmerName;
        this.LandArea = LandArea;
        this.City = City;
        this.AnnualIncome = AnnualIncome;
    }

    void display() {
        System.out.println("Farmer ID: " + Farmerid);
        System.out.println("Farmer Name: " + FarmerName);
        System.out.println("Land Area: " + LandArea + " acres");
        System.out.println("City: " + City);
        System.out.println("Annual Income: " + AnnualIncome);
    }
}

class DairyFarmer extends Farmer {
    int noofCattles;
    int DairyLicenceno;
    double MilkProduction;
    int noofCows;

    DairyFarmer() {
        super();
        this.noofCattles = 45;
        this.DairyLicenceno = 101;
        this.MilkProduction = 180.0;
        this.noofCows = 50;
    }

    DairyFarmer(int Farmerid, String FarmerName, int LandArea, String City, int AnnualIncome,
                int noofCattles, int DairyLicenceno, double MilkProduction, int noofCows) {
        super(Farmerid, FarmerName, LandArea, City, AnnualIncome);
        this.noofCattles = noofCattles;
        this.DairyLicenceno = DairyLicenceno;
        this.MilkProduction = MilkProduction;
        this.noofCows = noofCows;
    }

    void display() {
        super.display();
        System.out.println("No. of Cattles: " + noofCattles);
        System.out.println("Dairy Licence No: " + DairyLicenceno);
        System.out.println("Milk Production: " + MilkProduction + " liters/day");
        System.out.println("No. of Cows: " + noofCows);
    }
}

class PoultryFarmer extends Farmer {
    int noofChickens;
    int licenceNo;
    double eggProductionPerDay;
    int noofWorkers;

    PoultryFarmer() {
        super();
        this.noofChickens = 200;
        this.licenceNo = 410;
        this.eggProductionPerDay = 420;
        this.noofWorkers = 150;
    }

    PoultryFarmer(int Farmerid, String FarmerName, int LandArea, String City, int AnnualIncome,
                  int noofChickens, int licenceNo, double eggProductionPerDay, int noofWorkers) {
        super(Farmerid, FarmerName, LandArea, City, AnnualIncome);
        this.noofChickens = noofChickens;
        this.licenceNo = licenceNo;
        this.eggProductionPerDay = eggProductionPerDay;
        this.noofWorkers = noofWorkers;
    }

    void display() {
        super.display();
        System.out.println("No. of Chickens: " + noofChickens);
        System.out.println("Licence No: " + licenceNo);
        System.out.println("Egg Production/Day: " + eggProductionPerDay);
        System.out.println("No. of Workers: " + noofWorkers);
    }
}
class FarmerDemo {
    public static void main(String[] args) {
        System.out.println("Default Dairy Farmer");
        DairyFarmer d1 = new DairyFarmer();
        d1.display();

        System.out.println("\nParameterized Dairy Farmer");
        DairyFarmer d2 = new DairyFarmer(342, "Shyam", 36, "Mumbai", 900000, 65, 76, 87.9, 234);
        d2.display();

        System.out.println("\nDefault Poultry Farmer");
        PoultryFarmer p1 = new PoultryFarmer();
        p1.display();

        System.out.println("\nParameterized Poultry Farmer");
        PoultryFarmer p2 = new PoultryFarmer(123, "Dev", 54, "Ahilyanagar", 650000, 76, 98, 304.5, 12);
        p2.display();
    }
}
