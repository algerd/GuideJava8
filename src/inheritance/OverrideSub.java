
package inheritance;

/**
 *
 * @author Alex
 */
public class OverrideSub extends OverrideSuper {
    public static void main(String[] args) {
        /*
        To summarize the rules of overriding:
            • Name of the method
            • Number of parameters
            • Type of parameters
            • Order of parameters
            • Return type of parameters - allow change on subclass
            • Access level - allow more relaxing level
            • List of checked exceptions in the throws clause - allow remove exception or change on subclass exceptions
        The first four parts must always be the same in the overriding and the overridden methods. If the return type is a
        reference type, overriding a method’s return type could also be a subtype (any descendant) of the return type of the
        overridden method. Access level and list of exceptions in the overridden method may be thought of as its constraints.
        An overriding method may relax (or even remove) the constraints of the overridden method. However, an overriding
        method can never have more restrictive constraints than that of the overridden method.
        */
        
        /*
        super:
            - method call with a super qualifier calls the overridden method in the superclass.
        */
        
     
    }

    // Manager is subclass Employee
    // private Manager getEmp() { // error, private higher protected  
    public Manager getEmp() {
        /*
        super:
            - method call with a super qualifier calls the overridden method in the superclass.
        */
        super.getEmp();
       
        return new Manager();     
    }
    
    /*
    Using the @Override annotation with a method that is supposed to override a superclass method saves you a lot of debugging time. 
    Note that the @Override annotation does not change the way method overriding works. 
    It is used as an indicator to the compiler that it needs to make sure the method really overrides the method of its superclass.
    */
    @Override
    public void getInt( float f, String str) {
        
    }
    
    
}
