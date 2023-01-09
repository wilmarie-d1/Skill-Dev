public class Lecture {

    public static void main(String[] args) {
        aircraft cessna172 = new aircraft(94, 140, 56.6, 9.5);
        aircraft piperSaratoga = new aircraft(6, 201, 102.5, 20.5);

        System.out.println("For Cessna172 to fly up to 4.2 hours, it takes " + cessna172.fuelNeeded(4.2) + "gallons");
        System.out.println("For Saratoga to fly up to 7 hours, it takes " + piperSaratoga.fuelNeeded(4.2) + "gallons");


    }
    static class aircraft {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;

    aircraft (int p, int c, double fc, double fbr) {
        passengers = p;
        cruiseSpeed = c;
        fuelCapacity = fc;
        fuelBurnRate = fbr;
    }


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
