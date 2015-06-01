
package exception;

/**
 *
 * @author Alex
 */
public class TryCatch {
    
    public static void main(String[] args) {
        /*
        When we talk about throwing an exception, we are talking about three things.
            • Occurrence of an exceptional condition
            • Creation of a Java object to represent the exceptional condition
            • Throwing (or passing) the exception object to the exception handler
        */
        
        /*
        If an exception occurs and the Java runtime does not find a programmer-defined exception handler to handle it,
        such an exception is called an uncaught exception. All uncaught exceptions are handled by the Java runtime.
        */
        int x = 10, y = 0, z;
        //z = x/y;
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at com.jdojo.exception.DivideByZero.main(DivideByZero.java:7)
        
        /*
        When the catch block finishes executing its body, the control is transferred to the point following the try-catch block. 
        It is very important to note that after executing the catch block the control is not transferred back to the try block. 
        Rather, it is transferred to the code that follows the try-catch block. 
        If a try block has many catch blocks associated with it, a maximum of one catch block is executed.
        A try block must have either a catch block, a finally block, or both.
        */
        try {
            z = x / y;
            // code will not perfom
            System.out.println("z = " + z);
        }
        catch(ArithmeticException e) {
            // Get the description of the exception
            String msg = e.getMessage();
            // Print a custom error message
            System.out.println("An error has occurred. The error is: " + msg);
        }
        finally {
            // Code for finally block goes here
        }
        System.out.println("At the end of the program.");
        
        /*
        Rule for Multiple catch blocks:
            Multiple catch blocks for a try block must be arranged from the most specific exception type to the
            most generic exception type. Otherwise, a compile-time error occurs. The first catch block should
            handle the most specific exception type and the last the most generic exception type.
        */
        // The ArithmeticException class is a subclass of the RuntimeException class. If both of these exceptions are handled in catch blocks for the same try
        // block, the most specific type, which is ArithmeticException, must appear before the most generic type, which is RuntimeException.
        try {
            z = x / y;
        }
        catch(ArithmeticException e1) {
            // Handle ArithmeticException first
        }
        catch(RuntimeException e2) {
            // Handle RuntimeException after ArithmeticException
        } 
        
        /*
        Multi-Catch Block
        Если catch блок аналогичен для разных исключений, то их можно объединить в Multi-Catch Block 
        с перечислением типов исключений с помощью | (или).
        Альтернативные исключения при этом не могут быть вродстве друг с другом (наследоваться).
        */
        try {
            z = x / y;
            throw new MyException("Some error has occurred.");
        }
        // 
        catch(ArithmeticException | MyException e) { }
        // ArithmeticException наследник RuntimeException - errror
        //catch(ArithmeticException | RuntimeException e) { }
        
        /* 
        If the code in a try block cannot throw a checked exception and its associated catch blocks catch checked exceptions, 
        the compiler will generate an error. 
        */
        //try { z = x / y; }
        //catch(java.io.IOException e1) {}
           
        /*
         Three kinds of exceptional conditions may occur in a Java program:
            1) Exception: Exceptions that have a higher potential to occur, and you can handle them.
                Classes which are subclasses of the Exception class, including the Exception class itself 
                and excluding RuntimeException and all its subclasses, fall into this
            2) Error: If an exception of this kind is thrown at runtime, the runtime will handle it for you by displaying a
                detailed error message and halting the application.
                Classes which are subclasses of the Error class, and the Error class itself, 
                fall into this category.
            3) RuntimeException: If an exception of this kind is thrown at runtime, the runtime will handle it for you 
                by displaying a detailed error message and halting the program.
                Classes which are subclasses of the RuntimeException class, and the RuntimeException class itself, 
                fall into this category.
        */
        
        /*
        The Java compiler forces you to handle a checked exception either by using a try-catch block or by using a
        throws clause in the method or constructor declaration. If a method throws an exception, it should be handled somewhere
        in the call stack. That is, if a method throws an exception, its caller can handle it, or its caller’s caller can handle, and so
        on. If an exception is not handled by any callers in the call stack, it is known as an uncaught exception (or an unhandled
        exception). An uncaught exception is finally handled by the Java runtime, which prints the exception stack trace on the
        standard error and exits the Java application.
        */
        // Пользоватеоьская обработка исключения, выброшенного из вызова метода
        try { 
            System.out.print("Enter some text and then press Enter key: ");
            char c = TryCatch.readChar();
            System.out.print("The first character you entered is: " + c);
        }
        catch(java.io.IOException e) {
            // 
        }
        
        // Для автоматической обработки надо в main методе сделать throws сдфгыу соответствующими исключениями:
        // public static void main(String[] args) throws IOException, ...IOException {}
 
        /*
        Checked Exceptions and Initializers
        */
        // You must handle the Exception when you create an object of the Test class using any of its constructors as
        TryCatch t = null;
        try {
            t = new TryCatch();
        }
        catch (ArithmeticException e) {
        // Handle exception here
        }
    }
    
    /*
        Include a throws clause ikn the method’s declaration.
        Если происходит условие выброса исключения, выполнение метода прекращается, создаётся объект исключения
        типа, указанного в объявлении метода(IOException), и этот объект передаётся в вызов метода(TryCatch.readChar()). 
        Вызов метода должен проверяться на выбрасывание исключения с помощью try-catch или throws clause в методе, из которого 
        был сделан вызов (и так до main метода с throws clause)
    */
    public static char readChar() throws java.io.IOException {
        char c = '\u0000';
        int input = 0;
        input = System.in.read();
        if (input != -1) {
            c = (char)input;
        }
        return c;
    }
    
    /*
    If a piece of code in a static initializer throws a checked exception, it must be handled using a try-catch block inside the initializer itself.
    */
    static {
        try {
            int x = 10, y = 0, z;
            z = x / y;
        }
        catch(ArithmeticException e) {
            
        }
    }
    
    /*
    An instance initializer is called as part of a constructor call for the class. 
    It may throw checked exceptions. However, all those checked exceptions must be included in the throws clause
    of all constructors for that class.
    If an instance initializer throws a checked exception, you must declare a constructor for your class. The compiler
    will add a default constructor to your class if you do not add one. However, the compiler will not add a throws clause
    to the default constructor, which will break the above rule.
    */
    {
        int x = 10, y = 0, z;
        z = x / y;
    }
    // All constructors must specify that they throw ArithmeticException because the instance initializer throws CException
    public TryCatch() throws ArithmeticException {
    // Code goes here
    }

    public TryCatch(int x) throws ArithmeticException {
    // Code goes here
    }

}
