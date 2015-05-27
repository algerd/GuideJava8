
package clone;

/**
 * super.clone() осуществляет клонирование только объекта и его примитивных свойств, но не его свойств-ссылок. Свойства ссылки копируются как ссылки.
 * Такое клонирование называется Shallow.
 * Чтобы клонировать весь объект с его свойствами-ссылками, надо предусмотреть клонирование и его свойств-ссылок
 * @author Alex
 */
public class DeepClone implements Cloneable {
    
    public static void main(String[] args) {
        /*
        Данный пример показывает, что при Deep Clone любое изменение свойства-ссылки оригинала 
        не приведёт к аналогичному изменению свойства-ссылки клона
        */
        DeepClone dc = new DeepClone(100.00);
		DeepClone scClone = dc.clone();
	
		// Print the value in original and clone
		System.out.println("Original:" + dc.getValue());    // 100
		System.out.println("Clone :" + scClone.getValue()); // 100
	
		// Change the value in original and it will not change the value for clone
		dc.setValue(200.00);
	
		// Print the value in original and clone 
		System.out.println("Original:" + dc.getValue());    // 200 - Change the value in original
		System.out.println("Clone :" + scClone.getValue()); // 100 - Not change the value in clone   
    }
    
    // reference field
	private DoubleHolder holder = new DoubleHolder(0.0);

	public DeepClone(double value) {
		this.holder.setValue(value);
	}

	public void setValue(double value) {
		this.holder.setValue(value);
	}

	public double getValue() {
		return this.holder.getValue();
	}

    @Override
	public DeepClone clone() {
		DeepClone copy = null;
		try {	     
			copy = (DeepClone)super.clone();
	
			// Need to clone the holder reference variable too
			copy.holder = (DoubleHolder)this.holder.clone();
            
            //What will happen if the DoubleHolder class is not cleanable? In that case, you would not be able to write the
            //above statement to clone the holder instance variable. You could have cloned the holder instance variable as follows:
            //copy.holder = new DoubleHolder(this.holder.getValue());
		} 
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}	
		return copy;
	}
}
