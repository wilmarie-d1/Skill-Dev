package carShop;

public class Dealership {
//Create a DealershipApp class, which will contain your main method. This is where you test the following,
// not in Review -in main(), you will make new Customer and Car objects, then sout out the return of Customer's describe() implementation.
            public static void main(String[] args) {
                Customer princesa = new Customer("Wilmarie", "De La Cruz");
                Car benzo = new Car("GLE 63 AMG", "Mercedes-Benz", "Red", 2021);
                System.out.println(princesa.describe("Hello Miss ") + princesa.getLastName() + ", "
                        + "your "+ benzo.getColor() + " " + benzo.getYear() + " " + benzo.getModel() + " " + benzo.getMake() + " is ready to be picked up.");

}

}
