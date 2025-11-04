class Distance {
    double kilometers;
    double meters;

    void setKilometers(double km) {
        this.kilometers = km;
    }

    void setMeters(double m) {
        this.meters = m;
    }
     double getKilometers()
{
    return this.kilometers;

}
    double getMeters()
{
    return this.meters;
}
   void display()
{
System.out.println("Kilometers:"+this.kilometers);
System.out.println("Meters:"+this.meters);
}
}// distance ends here 

class DistanceTest
{
    public static void main(String[] args) 
{
        Distance d1 = new Distance(); // create object of Distance class

        d1.setKilometers(6.3);
        d1.setMeters(450);
        d1.display();

        System.out.println("Distance Details:");
        System.out.println("Kilometers: " + d1.kilometers);
        System.out.println("Meters: " + d1.meters);

        double totalMeters = (d1.kilometers * 1000) + d1.meters;
        System.out.println("Total Distance in meters: " + totalMeters);
    }
}
