
package operators;

/**
 * Arithmetic operators: 
 *  Unary: +, -, ++, --
 *  Binary: +, -, *, /, %, +=, -=, *=, /=, %=
 *  Ternary: ?: .
 *  @author Alex
 */
public class ArithmeticOperator {
    public static void main ( String[] args ) {
       
        initVariable();
        arithm();
        division();
        modulus();
        unary();
        compound();
        increment();
        concatination();    
    }
    
    /**
     * !!! It is a good programming practice to initialize a variable at the time of its declaration.
     */
    private static void initVariable() {
        /*** Declaration ***/
        int intVar;
        Object obj;
        int 
            num1, 
            num2, 
            num3;
          
        /*** Assignment ***/
        intVar = 10;
        //num1 = 10, num2 = 20; //An error. 
        obj = new Object();
        
        /*** Initialization = Declaration + Assignment ***/
        int num = 10;
        Object obj1 = new Object();
        int 
            a = 5,
            b = 6;
         
        // Mix (однотипная инициализация)
        int 
            num5, 
            num6 = 10, 
            num7;
        Object 
            obj2 = new Object(), 
            obj3;
        
        //Java will not let you use a variable unless it has been assigned a value either through the process of initialization or assignment.
        //Java implicitly initializes variables declared in a particular context ()
        int num10, num11;
        //num10 = num11 * 10;// An error
        boolean bool1, bool2;
        //bool1 = bool2;// An error
        bool2 = false;
        bool1 = bool2;  // Ok
    }  
    
    /**
     * Эти правила распространяются на все арифметические операции (+-*.%).
     * Если в выражении используется хотя бы одна переменная, то надо использовать следующее правило.
     * The data type of the expression is determined according to one of the four rules:
     *   • If one of the operands is the data type double, the other operand is converted to the double
     *   data type and the whole expression is of type double. Otherwise,
     *   • If one of the operands is the data type float, the other operand is converted to the float data
     *   type and the whole expression is of type float. Otherwise,
     *   • If one of the operands is the data type long, the other operand is converted to the long data
     *   type and the whole expression is of type long. Otherwise,
     *   • If none of the above three rules applies, all operands are converted to int, provided they are
     *   not already of type int, and the whole expression is of type int. 
     */
    private static void arithm() {
        byte b1;
        byte b2 = 2;    // int literal to byte
        byte b3 = 3;
        //b1 = b2 + b3; // A compile-time error. Trying to assign int 5 to byte b1
        b1 = (byte)(b2 + b3);   // Ok now
        //b1 = (byte) b2 + b3;  // An error again
        // На стадии компиляции компилятор может определить тип и значение литералов(констант) и вычислить на стадии компиляции(заменить 3+2 на 5), поэтому такое выражение не даст ошибку
        b1 = 2 + 3; //Ok. 5 is in the range -128 and 127
        // В случае с переменной в выражении компилятор будет приводить к int переменную, а вычисление будет проводиться позже(интерпретатором)
        //b1 = b2 + 3; //An error
       
        short s1 = 100;
        int i = 10;
        int j = 12;
        float f1 = 2.5F;
        float f2;
        double d1 = 20.0;
        
        b1 = 15 + 110;      // Ok. 125 is in the range -128 and 127
        //b1 = i + 5;       // An error. i is promoted to int and i + 5 is of the data type int. int to byte assignment is not permitted
        b1 = (byte)(i + 5); // OK 
        //b1 = s1 + 2;      // An error. s1 is promoted to int and s1 + 2 is of the data type int.int to byte assignment is not permitted
        //b1 = f1 + b2;     // An error. b2 is promoted to float and f1 + b2 is of the data type float.float to byte assignment is not permitted       
        //b1 = f1 + d1;     // An error. f1 is promoted to double and f1 + d1 is of the data type double
        
        f1 = i + f1;        // Ok. i is promoted to float and i + f1 is of the data type float
        //f1 = i + d1;      // An error. i is promoted to double and i + d1 is of data type double.double to float assignment is not permitted
        f1 = (float)(i + d1);// OK
        //f1 = 2.0 + 3.2;   // An error. 2.0 and 3.2 are of the type double. The result of 2.0 + 3.2 is 5.2, which is also of the type double. double to float assignment is not permitted.
        f1 = 2.0F + 3.2F;   // Ok. 2.0F and 3.2F are of the type float. The result of 2.0F + 3.2F, which is 5.2F, is of the type float. 
        d1 = f1 + j;        // Ok. j is promoted to float and f1 + j is of the data type float. float to double assignment is permitted.
        //f2 = f1 + d1;     // An error. double d1 do not cast to float f1
    }
    
    /*
    * Division имеет особенность выполнения операции:
    * 1. If both the operands of the division operator are integers (byte, short, char, int, long) result of division is truncated towards zero to represent an integer.
    * Предварительно byte, short, char приводятся неявно к int, но long не приводится!
    * 2. If either or both of the operands of the division operator are float or double type, floating-point division is performed and the result is not truncated
    * 3. The result of dividing a number by zero depends on the type of division:
    *      - If an integer division is performed on the number, dividing by zero results in a runtime error.
    *      - If a float(double) division is performed on the number, dividing by zero results in POSITIVE_INFINITY or NEGATIVE_INFINITY
    */
    private static void division() {
        short num, num2 = 10, num3 = 3;
        int intVar;
        long ln, ln1 = 100, ln2 = 30;
        float f1;
        double d1;
        
        // Integer division
        num = 5/2;          // Assigns 2 to num
        num = 5/3;          // Assigns 1 to num
        num = 5/6;          // Assigns 0 to num
        num = 5/7;          // Assigns 0 to num
        // num = 1000/2;    // An error. 500 > 127 (short type)
        
        // Предварительно byte, short, char приводятся неявно к int, но long не приводится!
        //num = num2/num3;  // An error. num2 and num3 cast to int, then int result cast to short - error
        intVar = num2/num3; // Ok.
        //intVar = ln1/ln2; // An error. ln1 and ln2 do not cast to int. Result long cast to int intVar - error
        ln1 = ln1/ln2;      // Ok
        
        //Float division
        // 15.0F and 4.0F are of float type. So, the expression 15.0F/4.0F is of the type float.
        // The result 3.75F is assigned to f1.
        f1 = 15.0F/4.0F;
        // 15 is of type int and 4.0F is of type float. The expression 15/4.0F is of type float.
        // The result 3.75F is assigned to f1.
        f1 = 15/4.0F;
        // An error. 15.0 is of the type double and 4.0F is of the type float.
        // The expression 15.0/4.0F is of type double. The result 3.75 is of the type double and cannot be assigned to f1.
        // f1 = 15.0/4.0F;
        f1 = (float)(15.0/4.0F); // Ok. 3.75F is assigned to f1
        // 15 and 4 are of the type int(long). The expression 15/4 is of type int(long).
        // An integer division is performed. The result 3 is assigned to f1, because int(long) to float assignment is allowed
        f1 = 15/4;
        f1 = 15L/4L;
        
        // Integer division by zero
        int i = 2;
        int j = 5; 
        int k = 0;
        //i = j/k; // A runtime error. Divide by zero
        //i = 0/0; // A runtime error. Divide by zero
        
        // Float division by zero
        f1 = 5.0F/0.0F; // Float.POSITIVE_INFINITY is assigned to f1
        f1 = -5.0F/0.0F; // Float.NEGATIVE_INFINITY is assigned to f1
        f1 = -5.0F/-0.0F; // Float.POSITIVE_INFINITY is assigned to f1
        f1 = 5.0F/-0.0F; // Float.NEGATIVE_INFINITY is assigned to f1
        
        // Double division by zero
        d1 = 5.0/0.0; // Double.POSITIVE_INFINITY is assigned to d1
        d1 = -5.0/0.0; // Double.NEGATIVE_INFINITY is assigned to d1
        d1 = -5.0/-0.0; // Double.POSITIVE_INFINITY is assigned to d1
        d1 = 5.0/-0.0; // Double.NEGATIVE_INFINITY is assigned to d1
        
        // 5.0F is of the type float and 0 is of the type int. 5.0F/0 is of type float.
        // Float.POSITIVE_INFINITY is assigned to f1
        f1 = 5.0F/0;
        // A compile-time error. 5.0F is of the type float and 0.0 is of the type double
        // 5.0F/0.0 is of the type double. double to float assignment is not allowed.
        //f1 = 5.0F/0.0;
        f1 = (float)(5.0F/0.0); // f1 is assigned Float.POSITIVE_INFINITY
        
        f1 = 0.0F/0.0F; // Assigns Float.NaN to f1
        d1 = 0.0/0.0;   // Assigns Double.NaN to d1
        d1 = -0.0/0.0;  // Assigns Double.NaN to d1
    }
    
    /**
     * Остаток от деления
     */
    private static void modulus() {
        /* Rule #1 
        *   - If the right-hand operand is not zero, the sign of the result is the same as the sign of the left-hand operand.
        */
        int num;
        num = 15 % 6;   // Assigns 3 to num
        num = -15 % 6;  // Assigns -3 to num
        num = 15 % -6;  // Assigns 3 to num
        num = -15 % -6; // Assigns -3 to num because left-hand operand is -15, which is negative
        
        /* Rule #2 
        *  - If both operands of the modulus operator are integers. It is a runtime error if the right-hand operand is zero.
        */
        //num = 15 % 0; // A runtime error
        
        /* If either operand of the modulus operator is a floating-point number, the following rules are applied to compute the result. */
        /* Rule #3.1
        *   - The operation never results in an error even if the right-hand operand is a floating-point zero.
        */
        float f1 = 15.F/0;
        
        /* Rule #3.2
        *   - The result is NaN if either operand is NaN.
        */
        double d1;
        f1 = Float.NaN % 10.5F;     // Assigns Float.NaN to f1
        f1 = 20.0F % Float.NaN;     // Assigns Float.NaN to f1
        f1 = Float.NaN % Float.NaN; // Assigns Float.NaN to f1
        // A compile-time error. The expression is of the type double. double to float assignment is not allowed
        //f1 = Float.NaN % Double.NaN;
        d1 = Float.NaN % Double.NaN; // Assigns Double.NaN to d1
        
        /* Rule #3.3
        *   - If the right-hand operand is zero, the result is NaN.
        */
        f1 = 15.0F % 0.0F; // Assigns Float.NaN to f1
        
        /* Rule #3.4
        *   - If the left-hand operand is infinity, the result is NaN.
        */
        f1 = Float.POSITIVE_INFINITY % 2.1F; // Assigns Float.NaN to f1
        
        /* Rule #3.4
        *   If none of the above rules apply, the modulus operator returns the remainder of the division of the left-hand operand and the right-hand operand. 
        */
        f1 = 15.5F % 6.5F; // Assigns 2.5F to f1
        d1 = 5.5 % 15.65; // Assigns 5.5 to d1
        d1 = 0.0 % 3.78; // Assigns 0.0 to d1
        d1 = 85.0 % Double.POSITIVE_INFINITY; // Assigns 85.0 to d1
        d1 = -85.0 % Double.POSITIVE_INFINITY; // Assigns -85.0 to d1
        d1 = 85.0 % Double.NEGATIVE_INFINITY; // Assigns 85.0 to d1
        d1 = -85.0 % Double.NEGATIVE_INFINITY; // Assigns -85.0 to d1
        
        System.out.println("15.27 % 2.343 = " + (15.27 % 2.343)); // 1.2119999999999997
    } 
    
    /**
     * Unary operators + and -
     */
    private static void unary() {
        /*
        If the operand is of the byte, short, or char type, the unary plus(minus) operator promotes it to int type. 
        The unary plus is no effect of using this operator.
        The unary minus operator arithmetically negates the value of its operand.
        */
        byte b1 = 10;
        byte b2 = +5;
        b1 = b2;        // Ok. byte to byte assignment
        // A compile-time error. b2 is of the type byte. But, use of the unary plus operator on b2 promoted its type to int. Therefore, +b2 is of the type int.     
        // b1 = +b2;    // int (+b2) to byte (b1) assignment is not allowed.
        // b1 = -b2;    // int (+b2) to byte (b1) assignment is not allowed.
        b1 = (byte)+b2; // Ok
        b1 = (byte)-b2; // Ok
    }
    
    /**
     * Compound arithmetic assignment operators: +=, -=, *=, /=, %=
     */
    private static void compound() {
        /*
        There are two advantages of using the compound arithmetic assignment operators.
            • The operand1 is evaluated only once. 
                For example, in i += 5.5, the variable i is evaluated only once, whereas in i = (int) (i + 5.5), the variable i is evaluated twice.
            • The result is automatically!!! cast to the type of operand1 before assignment.
        */
        int i = 100;
        byte b = 15;      
        b += i;     // =>  b = (byte)((int)b + i)       
        i += 5.5;   // Assigns 105 to i is equivalent to i = (int)((double)i + 5.5)
        
        // Of the compound operators, only the += operator can be used with a String left-hand operand.
        String str1 = "Hello";
        str1 += 100; // Assigns "Hello100" to str1 is equivalent to str1 = str1 + 100
        
        String str = "Hello";
        float f = 120.2F;
        boolean bool = true;
        long ln = 110L;
        i += 10;
        i += ln;         // i = (int)((long)i + ln)
        //i += bool;     // A compile-time error. i=(int)(i + (int)bool);
        //i = (int)bool; // error
        i -= 15;
        i *= 2;
        i /= 2;
        //i /= 0;   // A runtime error . Division by zero error
        f /= 0.0;   // Assigns Float.POSITIVE_INFINITY to f
        i %= 3;     //
        str += " How are you?"; // Assigns "Hello How are you?" to str
        str += f;   // Assigns "Hello120.2" to str. Assuming str was "Hello"
        b += f;
        str += bool;// Assigns "Hellotrue" to str. Assuming str was "Hello"  
    }
    
    /**
     * The increment operator (++) is used with a variable of numeric data type to increment its value by 1, 
     * whereas the decrement operator (--) is used to decrement the value by 1.
     */
    private static void increment() {
        //To increment the value of i by 1, you can use one of the four following expressions:
        int i = 100;
        i = i + 1; // Assigns 101 to i
        i += 1; // Assigns 101 to i
        i++; // Assigns 101 to i
        ++i;
        
        //Post-fix increment: сначала производятся вычисления с переменной, с которой используется инкремент, а потом инкрементируется переменная
        i = 100;
        int j = 50;
        j = i++ + 15; // Assigns 115 to j and i becomes 101 => 1)j=i+15=100+15 2)i=i+1
        
        //Pre-fix increment: сначала инкрементируется переменная, а потом её новое значение используется в вычислениях
        i = 100;
        j = 50;
        j = ++i + 15; // i becomes 101 and assigns 116 to j => 1)i=i+1=101 2)j=i+15=101+15
        
        // Here is a puzzle for Java beginners.
        i = 15;   
        i = i++; // i = 15 1)i=i=15 2)i+1=16 - остаётся в памяти без повторного присвоения к i
        i = ++i; // i = 16 сначала инкрементируется i, а потом полученное значение присвивается к i
        
        // Особые случаи, поведение которых в разных языках разное и требующие особого внимания
        i = 10;
        i = i++ + i; // Assigns 21 to i
        i = 10;
        i = ++i + i++; // Assigns 22 to i
        
        // There are also post-fix and pre-fix decrement operators (e.g. i--, --i). 
        i = 15;
        j = 16;
        i--;
        --i;
        i = 10;
        i = i--; // Assigns 10 to i
        i = 10;
        j = i-- + 10; // Assigns 20 to j and 9 to i
        i = 10;
        j = --i + 10; // Assigns 19 to j and 9 to i
    }
    
    /**
     * 
     */
    private static void concatination () {
		int num = 120;
		double realNum = 25.5F;
		double veryBigNum = 25.8 / 0.0;	
		double garbage = 0.0 / 0.0; 
		boolean test = true;
		
		// Print the value of num  
		System.out.println ("num = " + num);
		
		// Print the value of realNum  
		System.out.println ("realNum = " + realNum);
		
		// Print the value of veryBigNum  
		System.out.println ("veryBigNum = " + veryBigNum);
		
		// Print the value of garbage  
		System.out.println ("garbage = " + garbage);
		
		// Print the value of test  
		System.out.println ("test = " + test);
		
		// Print the maximum value of int type  
		System.out.println ("Maximum int = " + Integer.MAX_VALUE);
		
		// Print the maximum value of double type  
		System.out.println ("Maximum double = " + Double.MAX_VALUE);
		
		// Print the sum of two numbers  
		System.out.println ("12.5 + 100 = " + (12.5 + 100));
		
		// Print the difference of two numbers  
		System.out.println ("12.5 - 100 = " + (12.5 - 100));
		
		// Print the multiplication of two numbers  
		System.out.println ("12.5 * 100 = " + (12.5 * 100));
		
		// Print the result of division   
		System.out.println ("12.5 / 100 = " + (12.5 / 100));
		
		// Print the result of modulus  
		System.out.println ("12.5 % 100 = " + (12.5 % 100));
		
		// Print the result of string concatenation  
		System.out.println ("\"abc\" + \"xyz\" = " + "\"" + ("abc" + "xyz") + "\"");	
	}
    
}
