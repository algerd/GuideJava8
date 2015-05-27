
package classes_beginning1;

/**
 * “Varargs” is shorthand for “variable-length arguments.” 
 * It lets you declare a method or constructor that accepts a variable number of arguments (or parameters).
 * @author Alex
 */
public class Vararg {
    
    //  main(String[] args) as vararg:
    public static void main(String...args) {
        int max = Vararg.max(10, 15, 5, 65, 4);
        Vararg.max(); // Passing no argument to int...num is ok
        int max2 = Vararg.maxForeach(10, 15, 5, 65, 4);
        
        
        System.out.println("max from (10, 15, 5, 65, 4) = " + max);
        System.out.println("max from (13, -233, 69, 43) = " + Vararg.max2args(13, -233, 69, 43));
        //int max1 = Vararg.max2args(13); // A compile-time error
    }
    /*
    Rules:
        1. A varargs method can have a maximum of one variable-length argument.
        2. The variable-length argument of a varargs method must be the last argument in the argument list:
            public static int max(int n, int...num)
        3. Variable-length argument is optional:
            public static int max(int n, int...num) n - mandatory, int...num - optional
            max(10);
    
    Declareing Vararg: adding whitespaces before and after ellipsis is optional.
        public static int max(int ... num)
        public static int max(int... num)
        public static void (int...num) 
    
    The same overloading rules for methods also apply to a varargs method.
    If a varargs method is overloaded, Java uses the more specific version of the method instead of using a varargs
    method. Java uses varargs method as the last resort to resolve a method call.
    
    A varargs method is implemented by Java compiler using an array. 
    If your method signature is m1(XXX...args), it is changed to m1(XXX[] args) by the compiler.
    */   
    
    // max from some numbers
    public static int max(int...num) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
    
    public static int maxForeach(int...num) {
        int max = Integer.MIN_VALUE;
        for(int currentNumber : num) {
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
        return max;
    }
    
    public static int max2args(int n1, int n2, int... num) {
        // Initialize max to teh maximu of n1 and n2
        int max = (n1 > n2 ? n1 : n2);
        for(int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
    
      
}
