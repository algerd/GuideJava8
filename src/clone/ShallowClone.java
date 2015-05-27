
package clone;

/**
 * super.clone() осуществляет клонирование только объекта  и его примитивных свойств, но не его свойств-ссылок. Свойства ссылки копируются как ссылки.
 * Такое клонирование называется Shallow.
 * Чтобы клонировать весь объект с его свойствами-ссылками, надо предусмотреть клонирование и его свойств-ссылок
 * @author Alex
 */
public class ShallowClone implements Cloneable {
    
    public static void main(String[] args) {
        /*
        Данный пример показывает, что при Shallow Clone любое изменение свойства-ссылки оригинала 
        приведёт к аналогичному изменению свойства-ссылки клона
        */
        ShallowClone sc = new ShallowClone(100.00);
		ShallowClone scClone = sc.clone();
	
		// Print the value in original and clone
		System.out.println("Original:" + sc.getValue());    // 100
		System.out.println("Clone :" + scClone.getValue()); // 100
	
		// Change the value in original and it will change the value for clone too because we have done shallow cloning 
		sc.setValue(200.00);
	
		// Print the value in original and clone 
		System.out.println("Original:" + sc.getValue());    // 200 - Change the value in original
		System.out.println("Clone :" + scClone.getValue()); // 200 - Change the value in clone   
    }
    
    // reference field
	private DoubleHolder holder = new DoubleHolder(0.0);

	public ShallowClone(double value) {
		this.holder.setValue(value);
	}

	public void setValue(double value) {
		this.holder.setValue(value);
	}

	public double getValue() {
		return this.holder.getValue();
	}
	
    @Override
	public ShallowClone clone() {
		ShallowClone copy = null;
		try {
			copy = (ShallowClone)super.clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return copy;
	}
}
