package carShop;

 class Customer implements Describable{
    //Inside carShop create another class called Customer and make instance fields that can't be accessed outside Customer, these fields should be string called firstName and lastName. Create a constructor that sets firstName and lastName. Write getters and setters for each property.

    private String firstName;
    private String lastName;

    public Customer (String first, String last){
        this.firstName = first;
        this.lastName = last;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String first) {
        this.firstName = first;
    }
    public void setLastName(String last) {
        this.lastName = last;
    }

     @Override
     public String describe(String details) {
         return details;
     }

//
//Create an interface named Describable
//
//-Specify an instance method named describe that accepts a String 'details' parameters and returns a string
//
//-Make your Customer class implement the Describable interface
//
//-The implementation of the describe method on the Customer class should return something like the following message:
//
//Hey there firstName lastName, it looks like your color, year, make, model is ready to go!`
//Create a DealershipApp class, which will contain your main method. This is where you test the following, not in Review -in main(), you will make new Customer and Car objects, then sout out the return of Customer's describe() implementation.
}
