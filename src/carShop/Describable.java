package carShop;
//Create an interface named Describable
//
public interface Describable {
//-Specify an instance method named describe that accepts a String 'details' parameters and returns a string
        String describe(String details);

    }
//-Make your Customer class implement the Describable interface
//
//-The implementation of the describe method on the Customer class should return something like the following message:
//
//Hey there firstName lastName, it looks like your color, year, make, model is ready to go!`
//Create a DealershipApp class, which will contain your main method. This is where you test the following, not in Review -in main(), you will make new Customer and Car objects, then sout out the return of Customer's describe() implementation.

