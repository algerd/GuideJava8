
/**
 * import <<fully qualified name of a type>>
 * There are two types of import declarations:
 *   - Single-type import declaration
 *   - Import-on-demand declaration .
 * When you compile your code, the compiler replaces the simple name of a type with its fully qualified name.
 * It is to be emphasized that using import declarations in your Java program does not affect the size of your compiled code or runtime performance.
 */
package classes_beginning1;

/*
    Type Search Order: 
        - The current compilation unit
        - Single-type import declarations
        - Types declared in the same package
        - Import-on-demand declarations
        Не использовать Import-on-demand declarations, чтобы не было наложений типов. Их тяжело отлавливать, т.к. компилятор не выдаёт ощибку.
        В случае совпадения типов в первых трёх случаях компилятор выдаст ошибку. Чтобы её обойти, надо 
        использовать полное имя класса вместо импорта.
*/

/* 
    A single-type import declaration imports only one type from a package. If you want to import more than one type
    (e.g. three classes) from a package (or from different packages), you need to use a separate import declaration for each type.
*/
import classes_beginning2.ImportTestHelper1;
import classes_beginning2.ImportTestHelper2;

/*
    An import-on-demand declaration is used to import multiple types from a package using one import declaration.
    Использовать только в редких случаях, когда одиночные импорт из одного паккажа очень множественные
*/
import classes_beginning2.*;            // import only classes with classes_beginning2 package
import classes_beginning2.innerpack.*;  // import only classes with classes_beginning2.innerpack package
// import classes_beginning2.*.*        // error. allow only one asterisk! (only after dot)

/*
    Automatic Import Declarations
*/
import java.lang.*; // Will be ignored because it is automatically done for you

/*
    Static Import Declarations
    It imports static members (static variables/methods) of a type into a compilation unit.
    Sometimes static imports may introduce subtle bugs in your program, which may be hard to debug.
    You are advised not use static imports at all, or only in very rare circumstances.
*/
// Single-static-import declaration: import static <<package name>>.<<type name>>.<<static member name>>; 
import static classes_beginning2.ImportTestHelper1.counter;
import static classes_beginning2.ImportTestHelper1.count;

// Static-import-on-demand declaration : import static <<package name>>.<<type name>>.*;
import static classes_beginning2.ImportTestHelper1.*;


/**
 * @author Alex
 */
public class ImportTest {
    public static void main ( String[] args ) {
        // without import
        classes_beginning2.ImportTestHelper1 test1;
        
        // single-type import
        ImportTestHelper1 test2;
        ImportTestHelper2 test3;
        
        // import-on-demand
        ImportTestHelper3 test4;
        ImportTestHelper4 test5;  
        
        // Automatic Import Declarations
        String a;
        java.lang.String b; // full type
        
        // Static Import Declarations
        // int counter = 0; // локальная переменная скроет статическую и приведёт к багу в коде
        counter = 10; // такое упрощение имён сттических переменных может привести к наложению имён (напр. локалбных)
        count();
        // Full Static Import Declarations !!!
        classes_beginning2.ImportTestHelper1.counter = 100; // с именем паккажа
        ImportTestHelper1.counter = 20; // с именем класса, если класс импортирован
        
        
    }
    
    
}
