// EarlyBindingTest.java
package inheritance;

/*
In early binding, the decision about which method code and field will be accessed is made by the compiler at compile time. 
For a method call, the compiler decides which method from which class will be executed when the code having the method call is executed. 
For a field access, the compiler decides which field from which class will be accessed when the code having the field access is executed.
Early binding is used for the following types of methods and fields of a class in Java:
    • All types of fields: static and non-static
    • Static methods
    • Non-static final methods
In early binding, a method or a field is accessed based on the declared type (or compile-time type) of the variable
(or expression) accessing the method or the field.

Раннее связывание(статическое или compile-time) использует вызов метод (статического или финального) или поля класса типа! объекта. 
Поздннее связывание (runtime) использует вызов метода(нестатического или нефинального) конкретного объекта (сабкласса). 
Сабобъект содержит все поля и их значения и сабкласса и суперкласса, даже если эти поля переопределены в сабклассе. 
Используя downcasting можно обратиться к значениям поля суперкласса, а не сабкласса!!!, т.е. выполнить early binding. Но нельзя так вызвать метод суперкласса.
Using keyword super, you can call method of superclass from subclass (т.е. выполнить early binding внутри subclass). 
*/
public class EarlyBindingTest {
	public static void main(String[] args) {
		EarlyBindingSuper ebSuper = new EarlyBindingSuper();
		EarlyBindingSub ebSub = new EarlyBindingSub();
	
		System.out.println(ebSuper.str);    // Will access EarlyBindingSuper.str 
		System.out.println(ebSuper.count);  // Will access EarlyBindingSuper.count 
		ebSuper.print();    // Will access EarlyBindingSuper.print() 

		System.out.println("------------------------------");

		
		System.out.println(ebSub.str);      // Will access EarlyBindingSub.str 		
		System.out.println(ebSub.count);    // Will access EarlyBindingSub.count 		
		ebSub.print();      // Will access EarlyBindingSub.print() 

		System.out.println("------------------------------");
	
		System.out.println(((EarlyBindingSuper)ebSub).str);     // Will access EarlyBindingSuper.str 
		System.out.println(((EarlyBindingSuper)ebSub).count);   // Will access EarlyBindingSuper.count 	
		((EarlyBindingSuper)ebSub).print(); // Will access EarlyBindingSuper.print() 

		System.out.println("------------------------------");

		ebSuper = ebSub;    // Upcasting: Assign the ebSub to ebSuper 

		/* Now access methods and fields using ebSuper variable, which is referring to a EarlyBindingSub object */
		System.out.println(ebSuper.str);    // Will access EarlyBindingSuper.str 	
		System.out.println(ebSuper.count);  // Will access EarlyBindingSuper.count 	
		ebSuper.print();    // Will access EarlyBindingSuper.print() 
	}
}
