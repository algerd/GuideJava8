
package clone;

/**
 * Java does not provide an automatic mechanism to clone (make a copy) an object.
 * Для реализации клонирования надо класс имплементировать от Cloneable, реализовать метод clonе(),
 * в котором клонирование осуществить с помощью метода clonе() суперкласса Object.
 * @author Alex
 */
public class DoubleHolder implements Cloneable {
    
    public static void main(String[] args) {
       DoubleHolder obj1 = new DoubleHolder(1.2);
       DoubleHolder obj2 = obj1.clone();
       System.out.println("obj1 == obj1.clone() = " + (obj1 == obj2));
    }
    
    /*
    Если свойства класса - примитивные типы, то их не надо дополнительно клонировать в методе clone()
    */
	private double value;

	public DoubleHolder(double value) {
		this.value = value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getValue() {
		return this.value;
	}
	
    @Override
	public DoubleHolder clone() {
		DoubleHolder copy = null;
		try {
			// Call the clone() method of the Object class, which will do a bit-by-bit copy and return the reference of the clone
			copy = (DoubleHolder) super.clone();
		}
		catch (CloneNotSupportedException e) {
			// If anything goes wrong during cloning, print the error details
			e.printStackTrace();
		}
		return copy;
	}
}
