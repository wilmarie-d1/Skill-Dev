public class classExercise {
    public static void main(String[] args) {
        groceryStore houstonStore = new groceryStore();
        groceryStore seattleStore = new groceryStore();
        groceryStore orlandoStore = new groceryStore();

        houstonStore.applesSoldYearly = 534;
        houstonStore.appleRetailPrice =0.99;
        houstonStore.orangesSoldYearly = 429;
        houstonStore.orangeRetailPrice = 0.87;
        System.out.println("Houston Store");
        System.out.println("\nThe amount of apples sold in Houston yearly is: " + houstonStore.applesSoldYearly);
        System.out.println("The retail price of apples sold in Houston is: " + houstonStore.appleRetailPrice);
        System.out.println("\n The amount of oranges sold in Houston yearly is: " + houstonStore.orangesSoldYearly);
        System.out.println("The retail price of oranges sold in Houston is: " + houstonStore.orangeRetailPrice);
        seattleStore.applesSoldYearly = 765;
        seattleStore.appleRetailPrice = 0.86;
        seattleStore.orangesSoldYearly = 842;
        seattleStore.orangeRetailPrice = 0.79;
        System.out.println("\n Seattle Store");
        System.out.println("\n The amount of apples sold in Seattle yearly is: " + seattleStore.applesSoldYearly);
        System.out.println("The retail price of oranges sold in Seattle is: " + seattleStore.appleRetailPrice);
        System.out.println("\n The amount of oranges sold in Seattle yearly is: " + seattleStore.orangesSoldYearly);
        System.out.println("The retail price of oranges sold in Seattle is: " + seattleStore.orangeRetailPrice);

        orlandoStore.applesSoldYearly = 402;
        orlandoStore.appleRetailPrice = 0.77;
        orlandoStore.orangesSoldYearly = 398;
        orlandoStore.orangeRetailPrice = 0.79;
        System.out.println("\n Seattle Store");
        System.out.println(" \n The amount of apples sold in Orlando yearly is: " + orlandoStore.applesSoldYearly);
        System.out.println("The retail price of apples sold in Orlando is: " + orlandoStore.appleRetailPrice);
 System.out.println("\n The amount of oranges sold in Orlando yearly is: " + orlandoStore.orangesSoldYearly);
        System.out.println("The retail price of oranges sold in Orlando is: " + orlandoStore.orangeRetailPrice);

    }

}

class groceryStore {
    int applesSoldYearly;
    double appleRetailPrice;
     int orangesSoldYearly;
    double orangeRetailPrice;


}