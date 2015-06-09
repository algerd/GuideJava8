
package inheritance;

public class EarlyBindingSub extends EarlyBindingSuper{

	public String str = "EarlyBindingSub";
	public static int count = 200;

	public static void print() {
		System.out.println("Inside EarlyBindingSub.print()");
	}
}
