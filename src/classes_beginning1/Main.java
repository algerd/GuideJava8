
package classes_beginning1;

/**
 *
 * @author Alex
 */
public class Main {
    
    int num;
    
    public static void main ( String[] args ) {
        /*
            Create object, read and change fields 
        */
        Human jack = new Human();
        Human.count++;
        jack.name = "Jack Parker";
        // Read and print the values of name, gender and count
        String jackName = jack.name;
        long population = Human.count;
        
        /*
            Java has a special reference type called null type.
            The null reference type is assignment compatible with any other reference type.
        */
        Human john = null;  // john is not referring to any object
        if (john == null) {
            System.out.println("Human john = " + john);
        }
        // You cannot assign null to a primitive type variable.
        int num = 0;
        //if (num == null); // A compile-time error. Cannot compare a primitive type to a reference type
        
        /*
        There are only two valid values for <<access level modifier>>in a class declaration: 
            - no value: it can be accessed only within the package in which it has been declared 
            - public: it can be accessed from any package in the application.
        */
        classes_beginning2.ClassAccessTestPublic testPublic; // OK. public class
        //classes_beginning2.ClassAccessTestDefault testDefault; // Error. default(package) class
        
        /*
            Local Variables
        */
        Main main = new Main(5);
        main.localVar();
        
        /*
            Invokation of main-method another class
        */
        classes_beginning2.Main.main(args);
   
        /*
        Java supports the following four types of parameter passing mechanisms:
            - Pass by value (primitive types)
            - Pass by constant value (final primitive types - cannot be change inside method)
            - Pass by reference value (reference types)
            - Pass by constant reference value (final reference types - cannot change reference type, but can change values of reference type)
        */
        // Create a Car object and assign its reference to myCar and change model, year and price of Car object using myCar
        Car myCar = new Car();
        myCar.model = "Civic LX";
        myCar.year = 1999;
        myCar.price = 16000.0;
        System.out.println("#1: model = " + myCar.model + ", year = " + myCar.year + ", price = " + myCar.price);
        
        // адрес ссылки на объект в myCar заменяется в методе новым адресом на другой объект и затем myCar уничтожается как лок. переменная
        passReferenceNew(myCar);
        // myCar didn't change 
        System.out.println("#4: model = " + myCar.model + ", year = " + myCar.year + ", price = " + myCar.price);
        
        // адрес ссылки на объект в myCar используется и изменяется свойство переданного объекта
        passReferenceChange(myCar);
        // myCar change:
        System.out.println("#7: model = " + myCar.model + ", year = " + myCar.year + ", price = " + myCar.price);

        // Pass by constant reference value (final reference types - cannot change reference type, but can change values of reference type)
        passConstReference(myCar);
        
        /*
            String object is immutable, meaning that its content cannot be changed after it is created. 
            If you need to change the content of a String object, you must create a new String object with the new content.
        */
        String s1 = "hi";
        System.out.println("#1: s1 = " + s1);
        // адрес ссылки на объект в s1 заменяется в методе новым адресом на другой объект и затем s1 уничтожается как лок. переменная
        changeString(s1);
        System.out.println("#4: s1 = " + s1);
        
    }
    
    /*
        Default Constructor:
            The Java compiler adds(if don't exist yet) a default constructor for a top-level class as well as for a nested class.
            public Main() {}
            If construct exist with or without args so default construct is not created.
            Access level of default construct match access level of class.
            !!! It is good programming practice to add a constructor explicitly to all your classes rather than letting the compiler add a default constructor for your classes.
    */
    public Main(int n) {} // default construct is not created
     
    /*
        The signature of a method is the combination of its name and its parameter’s number, types, and order. 
        Modifiers, return types, and parameter name not part of the signature. Table 6-1 lists some examples of method declarations and their signatures.
    */
    public void add(int n1, int n2) { }
    //void add(int n1, int n2) { }
    //public int add(int n1, int n2) { return 0; }
    //public void add(int n3, int n4) { }
    public void add(int n1) { }
    public void add(int n1, double d1) { }
    public void add(double d1, int n1) { }
    
    /*
        You can have multiple methods in a class, which can be named main as long as they do not have the same signature.
    */
    public void main(int n) {}
       
    /*
        Local Variables
    */
    public void localVar() {
        /*
        Rule1: 
            Local variables are not initialized by default. Note that this rule is the opposite of the rule for instance/class
            variable’s initialization. When an instance/class variable is declared, it is initialized with a default value.
        */
        int sum; // sum is empty (no 0)
        
        /*
        Rule2:
            A local variable cannot be accessed in the program until it is assigned a value.
        */      
        //System.out.println(sum);// A compile-time error. Cannot read sum because it is not assigned a value yet.
        sum = 10;
        System.out.println(sum); // Ok
        
        /*
        Rule3:
            A local variable can be declared anywhere in the body of a method. However, it must be declared before it is used.
        */
        int k; // OK
        
        /*
        Rule4:
            A local variable hides the name of an instance variable and a class variable with the same name.
        */
        num = 10; // object var
        int num = 666; // local var
        System.out.println("local num = " + num);
        
        /*
        this:
            You need to qualify an instance variable with the keyword this and a class variable with the class name only
            when the instance variable or the class variable is hidden by another variable with the same name.
            Чтобы избежать скрытия полей локальными переменными, лучше всегда использовать this вместе с вызовом поля внутри объекта.
            Имена методов не скрываются, поэтому с ними нет смысла использовать this.
        */    
        System.out.println("object num = " + this.num);
    }
      
    /*
        Pass by reference value (reference types)
    */
    public static void passReferenceNew(Car xyCar) {
        System.out.println("#2: model = " + xyCar.model + ", year = " + xyCar.year + ", price = " + xyCar.price);
        // Let’s make xyCar refer to a new Car object
        xyCar = new Car();
        System.out.println("#3: model = " + xyCar.model + ", year = " + xyCar.year + ", price = " + xyCar.price);
    }
    public static void passReferenceChange(Car xyCar) {
        System.out.println("#5: model = " + xyCar.model + ", year = " + xyCar.year + ", price = " + xyCar.price);
        // Let’s make xyCar refer to a new Car object
        xyCar.model = "Renault";
        System.out.println("#6: model = " + xyCar.model + ", year = " + xyCar.year + ", price = " + xyCar.price);
    } 
    /*
        Pass by constant reference value (final reference types - cannot change reference type, but can change values of reference type)
    */
    public static void passConstReference(final Car xyCar) {
        // Can read the object referenced by xyzCar
        String model = xyCar.model;
        // Can modify object referenced by xyzCar
        xyCar.year = 2001;
        // Cannot change type xzyCar (new, null or other reference). 
        //xyCar = null;         // A compile-time error. Cannot modify xyzCar
        //xyCar = new Car();    // A compile-time error. Cannot modify xyzCar
        Car ccc = new Car();
        //xyCar = ccc;          // A compile-time error. Cannot modify xyzCar
    }
    
    public static void changeString(String s2) {
        System.out.println("#2: s2 = " + s2);
        // creates a new String object in memory with content of "... there" returns its reference.
        s2 = s2 + " there";
        System.out.println("#3: s2 = " + s2);
    }
    
}
