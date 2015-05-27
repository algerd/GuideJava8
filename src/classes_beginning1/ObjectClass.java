
package classes_beginning1;

/**
 * All Java classes, those that are included in the Java class libraries and those that you create, extend the Object class directly or indirectly. 
 * All Java classes are a subclass of the Object class and the Object class is the superclass of all classes.
 * @author Alex
 */
public class ObjectClass {
    public static void main(String[] args) {
        /*
        Rule #1
            A reference variable of the Object class can hold a reference of an object of any class. 
            As any reference variable can store a null reference, so can a reference variable of the Object type.
        */
        Object obj;// Can assign a reference of an object of the Object class
        // Can assign the null reference
        obj = null;
        obj = new Object();
        // Can assign a reference of an object of the Account class
        Car renault = new Car();
        obj = renault;
        // Can assign a reference of object of any class. Assume that the AnyClass class exists
        obj = new Human();
        
        //The opposite of the above rule is not true. You cannot assign a reference of an object of the Object class to a reference variable of any other type.
        //renault = new Object();   // A compile-time error
        renault = (Car)new Object();// Must use a cast
        
        ObjectClass obj1 = new ObjectClass();
        obj1.m1(null);          // Pass null reference
        obj1.m1(new Object());  // Pass a reference of an object of the Object class
        obj1.m1(new Car());     // Pass a reference of an object of the AnyClass class
        
        /*
        Rule #2
            The Object class has nine methods, which are available to be used in all classes in Java.
            1. Methods in the first category have been implemented in the Object class.  You cannot override these methods in any class you create. Their implementation is final:
                getClass(), notify(), notifyAll(), wait().
            2. Methods in the second category have a default implementation in the Object class. You can customize their implementations by reimplementing them in your classes:
                toString(), equals(), hashCode(), clone(), finalize().
        */
        obj1.toString();
        
        /*
            The getClass() method of the Object class returns the reference of the Class object.
        */
        Car c = new Car();
        Class carClass = c.getClass();
        // The Class class has many useful methods:
        String fullName = carClass.getName();   // to get the fully qualified name of the class.
        String simpleName = carClass.getSimpleName(); // to get the simple name of the class.
        
        /*
            The hashCode() computes the hash code of an object by converting the memory address of the object into an integer.
            The hashCode() are used solely for the purpose of efficient retrieval of data from a hash-based collection. 
            If your are not used as keys in hash based collections and you do not override the equals() method in your class,
            you do not need to worry about reimplementing the hashCode() method in your class at all.
        */
        int hash = c.hashCode();
        
        /*     
        Two objects are the same if they have the same identity (or reference in terminology):
        Point pt1 = new Point(10, 10);
        Point pt2 = new Point(10, 10);
        Point pt3 = new Point(12, 19);
        Point pt4 = pt1;
        boolean bool;
        bool = (pt1 == pt2); // false
        bool = (pt2 == pt3); // false
        bool = (pt1 == pt4); // true
        
        Дефолтный equals() аналогичен ==, т.е. он реализует сравнение по ссылке.
        Чтобы сравнивать объекты по идентичности их свойств, а не по ссылке, надо самому реализовать методы equals() и hashCode()
        */
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = car1;
        car1.equals(car2); // false (car1 == car2)
        car1.equals(car3); // true (car1 == car3)
       
    }
    
    public void m1(Object obj) { }
    
}
