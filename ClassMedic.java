// Create a class called ClassMedic.java.
// We want to extend which means make this a child class of ClassLifeform class
public class ClassMedic extends LifeForm {

    // Create a constructor for the class
    // This is a special method that is called when you create an object.
    // The constructor is used to initialize the properties of the class.
    // The constructor has the same name as the class.
    // The constructor does not have a return type.
    public ClassMedic( String description, String name){
        // Initialize the Description property by setting it to the value passed in the description parameter. 
        super(description);
    }

    // Create a method to heal the user
    public void Heal(){
        // Display a message to the user.
        System.out.println("You have been healed.");
    }
    // Create a method to treat the user
    public void Treated (){
        // Display a message to the user.
        System.out.println("You have been Treated.");
    }
    // Create a method to train the user
    public void Recover (){
        // Display a message to the user.
        System.out.println("You have been recovered from training.");
    }
    
    
}
