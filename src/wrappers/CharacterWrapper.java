
package wrappers;

/**
 * An object of the Character class wraps a char value. 
 * The class contains several constants and methods that are useful while working with characters.
 * @author Alex
 */
public class CharacterWrapper {
    public static void main(String[] args) {
        // Using the constructor
        Character c1 = new Character('A');
        
        // Using the factory method - preferred
        Character c2 = Character.valueOf('2');
        Character c3 = Character.valueOf('ñ');
        
        // Getting the wrapped char values
        char cc1 = c1.charValue();
        char cc2 = c2.charValue();
        char cc3 = c3.charValue();
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        
        // Using some Character class methods on c1
        System.out.println("isLowerCase c1 = " + Character.isLowerCase(cc1));
        System.out.println("isDigit c1 = " + Character.isDigit(cc1));
        System.out.println("isLetter c1 = " + Character.isLetter(cc1));
        System.out.println("Lowercase of c1 = " + Character.toLowerCase(cc1));
        
        // Using some Character class methods on c2
        System.out.println("isLowerCase c2 = " + Character.isLowerCase(cc2));
        System.out.println("isDigit c2 = " + Character.isDigit(cc2));
        System.out.println("isLetter c2 = " + Character.isLetter(cc2));
        System.out.println("Lowercase of c2 = " + Character.toLowerCase(cc2));
        System.out.println("Uppercase of c3 = " + Character.toUpperCase(cc3));
        
    }
}
