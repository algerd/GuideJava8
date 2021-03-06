
package inheritance;

/**
 * Использование конструктора суперкласса super()
 * @author Alex
 */
public class ConstructSub extends ConstructSuper {
    
    /*
    Если не прописывать конструктор явно, то компилятор автоматически допишет дефолтный конструктор:
        super();
    И это вызовет ошибку, потому что конструктор суперкласса(родителя), к которому идёт обращение, имеет входной аргумент.
    Поэтому надо всегда прописывать конструктор вручную.
    Чтобы избежать такие ситуации, желательно переопределять дефолтный конструктор (см. закоммент. в ConstructSuper).
    При наследовании конструкторов следить за их уровнем доступа и уровнем доступа классов.
    */
    // 
    public ConstructSub() {
        // int i; // error: super() должен быть первым выражением
        // super();     // при переопределённом дефолтном конструкторе в ConstructSuper
        super("John");  // при непереопределённом дефолтном конструкторе в ConstructSuper
    }
    
    public ConstructSub(String str) {
        super(str);     // при непереопределённом дефолтном конструкторе в ConstructSuper
    }
    
}
