// LateBindingSub.java
package inheritance;

public class LateBindingSub extends LateBindingSuper{
    
    public String str;
    
    public LateBindingSub() {
        this.str = "LateBindingSub";
    }
    
	public void print() {
		System.out.println("Inside LateBindingSub.print()");
	}
}