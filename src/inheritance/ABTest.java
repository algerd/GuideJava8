
package inheritance;


/**
 * You can use a variable of an super type to invoke any methods declared only in the super class.
 * Super тип переменной накладывает ограничение на использование объектом методов только этого super класса.
 * Если методы переопределены сабклассом, то при обращении к методу из типа суперкласса объекта сабкласса будет 
 * всё равно вызываться переопределённый метод сабкласса (не суперкласса)
 * @author Alex
 */
public class ABTest {
    public static void main(String[] args) {
        
        B b = new B();
        b.getA();   // OK. Using B, you can access only the getA() method of A object (super)
        b.getB();   // OK. Using B, you can access only the getB() method of B object
        b.print();  // Ok. Using A, you invoke override method from inheritance class B
        
        A a = new B();
        a.getA();   // OK. Using A, you can access only the getA() method of A object
        //a.getB(); // error
        a.print();  // Ok. Using A, you invoke override method from inheritance class B (not A)
    }
}
