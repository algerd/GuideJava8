// LateBindingTest.java
package inheritance;

/*
Позднее связывание (runtime) использует вызов метода (нестатического и нефинального) конкретного объекта (сабкласса).
*/
public class LateBindingTest {
	public static void main(String[] args) {
		LateBindingSuper lbSuper = new LateBindingSuper();
		LateBindingSub lbSub = new LateBindingSub();

		
		lbSuper.print();// Will access EarlyBindingSuper.print() 	
		lbSub.print();  // Will access EarlyBindingSub.print() 
        System.out.println(lbSub.str);
        
		((LateBindingSuper)lbSub).print(); // Will access EarlyBindingSub.print()
        System.out.println(((LateBindingSuper)lbSub).str); //downcasting - early binding поля - обращаемся к значениям поля суперкласса

		lbSuper = lbSub; // Upcasting. Assign the lbSub to lbSuper
        
		lbSuper.print(); // #Will access EarlyBindingSub.print() because lbSuper is referring to a LateBindingSub object
        System.out.println(((LateBindingSuper)lbSub).str); //downcasting - early binding поля - обращаемся к значениям поля суперкласса
    }
}
