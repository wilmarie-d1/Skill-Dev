package bigDinner;

public class dinnerApp {
    public static void main(String[] args) {
        //Create a package called bigDinner. Inside bigDinner create a class called dinnerApp where your main method will be in order to test the following questions
        //
            Dinner tonight = new Dinner("wings", "coke", "fries", "cheeseburger", "flan");
        System.out.println(tonight.myDinner());

    }
    //Inside bigDinner create a new class called Dinner. Make instance fields that can't be accessed outside Dinner. These fields should be of type String named appetizer, drink, side, meal, and dessert. Create a constructor that sets the appetizer, drink, side, meal, and dessert. Write getters and setters for each property.
//    class Dinner implements Sentence {
//    private String appetizer;
//    private  String drink;
//    private String side;
//    private  String meal;
//    private String dessert;
//
//        public Dinner(String appetizer, String drink, String side, String meal, String dessert) {
//            this.appetizer = appetizer;
//            this.drink = drink;
//            this.side = side;
//            this.meal = meal;
//            this.dessert = dessert;
//        }
//
//
//    public String getAppetizer(){
//        return appetizer;
//    }
//    public String getDrink() {
//        return drink;
//    }
//    public String getSide(){
//        return side;
//    }
//    public String getMeal(){
//        return meal;
//    }
//    public String getDessert() {
//        return dessert;
//    }
//
//    public void setAppetizer (String appetizer){
//        this.appetizer = appetizer;
//    }
//    public void setDrink(String drink){
//        this.drink = drink;
//    }
//    public void setSide(String side) {
//        this.side = side;
//    }
//    public void setMeal(String meal) {
//        this.meal = meal;
//    }
//    public void setDessert(String dessert) {
//        this.dessert = dessert;
//    }
//
//        public String myDinner(String string) {return "WOW! You have " + getAppetizer() + " " + getMeal() + " " + getSide() + " " +  getDrink() + " and a " + getDessert() + " to top it off? That's one big dinner!\n";
//        }
//
//        //
//    //Create an interface named Sentence inside bigDinner
//    //
//    //Specify an instance method named myDinner that accepts no arguments and returns a String.
//    //Change your Dinner class so that it implements the Sentence interface.
//    //
//    //The implementation of the myDinner method on Dinner class should return the following message:
//    //
//    //WOW! You have appetizer, meal, side, drink, and a dessert to top it off? That's one big dinner!
//    //Remember to replace the instance properties of appetizer, drink, side, meal, and dessert to display the assigned values.
//    //
//    //Inside dinnerApp create a new instance of Dinner and make your new instance of Dinner use the Sentence interface# Oberon-Java-Asessment-Prep-Day2
//
//}
 }
