// Turtle.java
package interfaces;

public class Turtle implements Walkable, Swimmable{
	private String name;

	public Turtle(String name) {
		  this.name = name;
	}

	public void bite() {
		System.out.println(name + " (a turtle) is biting.");
	}
	
	// Implementation for the walk() method of the Walkable interface
	public void walk() {
		System.out.println(name + " (a turtle) is walking.");
	}

	// Implementation for the swim() method of the Swimmable interface
	public void swim() {
		System.out.println(name + " (a turtle) is swimming.");
	}
}
