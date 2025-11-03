class Distance {
    double kilometers;
    double meters;

    void setKilometers(double km) {
        this.kilometers = km;
    }

    void setMeters(double m) {
        this.meters = m;
    }

    public static void main(String[] args) {
        Distance d1 = new Distance(); // create object of Distance class

        // setting values
        d1.setKilometers(6.3);
        d1.setMeters(450);

        // displaying details
        System.out.println("Distance Details:");
        System.out.println("Kilometers: " + d1.kilometers);
        System.out.println("Meters: " + d1.meters);

        // total distance conversion (optional)
        double totalMeters = (d1.kilometers * 1000) + d1.meters;
        System.out.println("Total Distance in meters: " + totalMeters);
    }
}
