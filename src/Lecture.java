public class Lecture {

    public static void main(String[] args) {
        aircraft cessna172 = new aircraft();
        aircraft piperSaratoga = new aircraft();

        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5;

        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed =201;
        piperSaratoga.fuelCapacity = 102.5;
        piperSaratoga.fuelBurnRate = 20.5;


        System.out.println("For Cessna172 to fly up to 4.2 hours, it takes " + cessna172.fuelNeeded(4.2) + "gallons");
        System.out.println("For Saratoga to fly up to 7 hours, it takes " + piperSaratoga.fuelNeeded(4.2) + "gallons");


    }
    static class aircraft {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;


    double calculateEndurance () {
        double endurance;
        endurance = fuelCapacity/fuelBurnRate;
        return endurance;
    }
    double fuelNeeded (double time) {
        return fuelBurnRate * time;
    }
    }
}
