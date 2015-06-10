// TurtleTest.java
package interfaces;

/*
* You can use a variable of an interface type to invoke any methods declared only in the interface.
* Интерфейсный тип переменной накладывает ограничение на использование объектом методов только этого интерфейса
*/
public class TurtleTest {
	public static void main(String[] args) {
		Turtle turti = new Turtle("Turti");
	
		// Using Turtle type as Turtle, Walkable and Swimmable
		letItBite(turti);
		letItWalk(turti);
		letItSwim(turti);	
        
        /*
        When you use a Turtle object as the Walkable type, you can access only the walk() method. When you use
        a Turtle object as the Swimmable type, you can access only the swim() method. The following snippet of code
        demonstrates this rule:
        */
        Turtle t = new Turtle("Trach");
        t.bite();
        t.swim();
        t.walk();
                     
        Walkable w = t;
        w.walk();   // OK. Using w, you can access only the walk() method of Turtle object
        //w.bite(); // error
        //w.swim(); // error
        
        Swimmable s = t;
        s.swim();   // OK. Using s you can access only the swim() method
        //s.bite(); // error
        //s.walk(); // error
	}   
	
	public static void letItBite(Turtle t) {
		t.bite();
        //t.swim(); // OK
	}
	
	public static void letItWalk(Walkable w) {
		w.walk();
        //w.swim(); // error
	}
	
	public static void letItSwim(Swimmable s) {
		s.swim();
        //s.walk(); // error
	}
}
