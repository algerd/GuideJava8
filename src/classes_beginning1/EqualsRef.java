
package classes_beginning1;

/**
 * Reimplement(override) the equals() method.
 * @author Alex
 */
public class EqualsRef {
    public static void main(String[] args) {
        EqualsRef obj1 = new EqualsRef("John");
        EqualsRef obj2 = new EqualsRef("Mike");
        EqualsRef obj3 = new EqualsRef("John");
        EqualsRef obj4 = obj1;
        
        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2)); // false
        System.out.println("obj1.equals(obj3) = " + obj1.equals(obj3)); // true
        System.out.println("obj1.equals(obj4) = " + obj1.equals(obj4)); // true
    }
    /*
    Here are specifications for the equals() method’s implementation. Assume that x, y, and z are non-null references of three objects.
        - Reflexivity: It should be reflexive. The expression x.equals(x) should return true. That is, an
            object must be equal to itself.
        - Symmetry: It should be symmetric. If x.equals(y) returns true, y.equals(x) must return
            true. That is, if x is equal to y, y must be equal to x.
        - Transitivity: It should be transitive. If x.equals(y) returns true and y.equals(z) returns
            true, x.equals(z) must return true. That is, if x is equal to y and y is equal to z, x must be equal to z.
        - Consistency: It should be consistent. If x.equals(y) returns true, it should keep returning
            true until the state of x or y is modified. If x.equals(y) returns false, it should keep returning false until the state of x or y is modified.
        - Comparison with null reference: An object of any class should not be equal to a null reference.
            The expression x.equals(null) should always return false.
        - Relationship with hashCode() method: If x.equals(y) returns true, x.hashCode() must return
            the same value as y.hashCode(). That is, if two objects are equal according to the equals()
            method, they must have the same hash code values returned from their hashCode() methods.
            However, the opposite may not be true. If two objects have the same hash codes, that does not
            imply that they must be equal according to the equals() method. That is, if x.hashCode() is
            equal to y.hashCode(), that does not imply that x.equals(y) will return true.
    */
    
    private String name;
    
    public EqualsRef(String name) {
        this.name = name;
    }
    /* Reimplement the equals() method */
    @Override
    public boolean equals(Object otherObject) {
        // Are they the same?
        if (this == otherObject) {
            return true;
        }
        // Is otherObject a null reference?
        if (otherObject == null) {
            return false;
        }
        // Do they belong to the same class?
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }
        // Get the reference of otherObject is a SmartCat variable
        EqualsRef otherCat = (EqualsRef)otherObject;
        
        // Do they have the same names
        boolean isSameName = (this.name == null? otherCat.name == null : this.name.equals(otherCat.name));
        
        return isSameName;
    }
    
    /* Reimplement the hashCode() method, which is a requirement when you reimplement equals() method */
    @Override
    public int hashCode() {
        return (this.name == null? 0 : this.name.hashCode());
    }
}
