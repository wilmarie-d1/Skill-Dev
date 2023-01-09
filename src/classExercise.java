public class classExercise {
    public static void main(String[] args) {
        groceryStore houstonStore = new groceryStore(534, 0.99, 429, 0.87);
        groceryStore seattleStore = new groceryStore(765, 0.86, 842, 0.91);
        groceryStore orlandoStore = new groceryStore(402, 0.77, 398, 0.79);


        System.out.println("Houston Store");
        System.out.println("\nThe amount of apples sold in Houston yearly is: " + houstonStore.applesSoldYearly);
        System.out.println("The retail price of apples sold in Houston is: " + houstonStore.appleRetailPrice);
        System.out.println("\n The amount of oranges sold in Houston yearly is: " + houstonStore.orangesSoldYearly);
        System.out.println("The retail price of oranges sold in Houston is: " + houstonStore.orangeRetailPrice);

        System.out.println("\n Seattle Store");
        System.out.println("\n The amount of apples sold in Seattle yearly is: " + seattleStore.applesSoldYearly);
        System.out.println("The retail price of oranges sold in Seattle is: " + seattleStore.appleRetailPrice);
        System.out.println("\n The amount of oranges sold in Seattle yearly is: " + seattleStore.orangesSoldYearly);
        System.out.println("The retail price of oranges sold in Seattle is: " + seattleStore.orangeRetailPrice);

        System.out.println("\n Seattle Store");
        System.out.println(" \n The amount of apples sold in Orlando yearly is: " + orlandoStore.applesSoldYearly);
        System.out.println("The retail price of apples sold in Orlando is: " + orlandoStore.appleRetailPrice);
 System.out.println("\n The amount of oranges sold in Orlando yearly is: " + orlandoStore.orangesSoldYearly);
        System.out.println("The retail price of oranges sold in Orlando is: " + orlandoStore.orangeRetailPrice);

//        double houstonRevenue, orlandoRevenue, seattleRevenue;
//        houstonRevenue = (houstonStore.appleRetailPrice * houstonStore.applesSoldYearly) + (houstonStore.orangeRetailPrice * houstonStore.orangesSoldYearly);
//        orlandoRevenue = (orlandoStore.appleRetailPrice * orlandoStore.applesSoldYearly) + (orlandoStore.orangeRetailPrice * orlandoStore.orangesSoldYearly);
//        seattleRevenue = (seattleStore.appleRetailPrice * seattleStore.applesSoldYearly) + (seattleStore.orangesSoldYearly * seattleStore.orangeRetailPrice);
//        System.out.println("\n The total yearly revenue for apple and oranges in Houston is $" + houstonRevenue);
//        System.out.println("The total yearly revenue for apple and oranges in Orlando is $" + orlandoRevenue);
//        System.out.println("The total yearly revenue for apple and oranges in Seattle is $" + seattleRevenue);


        System.out.println("Orlando Store");
        System.out.println("To hit the target of $1000, the store needs to sell " + orlandoStore.appleRevenueTarget(1000) + "apples");
        System.out.println("To hit the target of $800, the store needs to sell " + orlandoStore.orangeRevenueTarget(800) + "oranges");
        System.out.println("The gross revenue for this store is " + orlandoStore.grossRevenue());
        System.out.println("Houston Store");
        System.out.println("To hit the target of $1000, the store needs to sell " + houstonStore.appleRevenueTarget(1000) + "apples");
        System.out.println("To hit the target of $800, the store needs to sell " + houstonStore.orangeRevenueTarget(800) + "apples");
        System.out.println("The gross revenue for this store is " + houstonStore.grossRevenue());
        System.out.println("Seattle Store");
        System.out.println("To hit the target of $1000, the store needs to sell " + seattleStore.appleRevenueTarget(1000) + "apples");
        System.out.println("To hit the target of $800, the store needs to sell " + seattleStore.orangeRevenueTarget(800) + "oranges");
        System.out.println("The gross revenue for this store is " + seattleStore.grossRevenue());
//
//        System.out.println("Houston target is $1050 of apple sales..");
//        System.out.println("It needs to sell " + houstonStore.appleRevenueTarget(1050) + " apples");
//        System.out.println("\nSeattle target is 620 of apple sales..");
//        System.out.println("It needs to sell " + seattleStore.orangeRevenueTarget(620) + " oranges");
//        System.out.println("\nOrlando target is $744 of apple sales..");
//        System.out.println("It needs to sell " + orlandoStore.appleRevenueTarget(744) + " apples");

    }

}

class groceryStore {
    int applesSoldYearly;
    double appleRetailPrice;
    int orangesSoldYearly;
    double orangeRetailPrice;

    groceryStore(int asy, double arp, int osy, double orp) {
        applesSoldYearly = asy;
        appleRetailPrice = arp;
        orangesSoldYearly = osy;
        orangeRetailPrice = orp;
    }
    double grossRevenue () {
        double revenue;
        revenue = (applesSoldYearly * appleRetailPrice) + (orangesSoldYearly * orangeRetailPrice);
    return revenue;
}
        double appleRevenueTarget (double revenue){
    return revenue/appleRetailPrice;
        }
        double orangeRevenueTarget (double revenue) {
    return revenue/orangeRetailPrice;
        }
}

