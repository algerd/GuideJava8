
package operators;

/**
 * Primitive data type:
 *  boolean ;
 *  Numeric Integer Types: byte, short, int, long, char ;
 *  Numeric Floating-Point Types: float, double .
 * @author Alex
 */
public class PrimitiveDataType {
    public static void main(String[] args) {
        /*
        byte  8b    -128 to 127(-2E7 to 2E7 - 1)
        short 16b   -32768 to 32767 (or -2E15 to 2E15 - 1)
        int   32b   -2,147,483,648 to 2,147,483,647 (-2E31 to 2E31 - 1)
        long  64b   -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807(-2E63 to 2E63 - 1)
        
        Integer(byte, short, int, long) literals can also be expressed in
            • Decimal number format (10)        5
            • Octal number format (8)           05
            • Hexadecimal number format (16)    0x5 (0X)5
            • Binary number format (2)          0b101 (0B)101
        
        Underscores are allowed in numeric literals only between digits. This means that you cannot use underscores in
        the beginning or end of a numeric literal. You cannot use underscores with prefixes such as 0x for hexadecimal format
        and 0b for binary format, and suffixes such as L for long literal and F for float literal.
        123_456_789 -> 123456789
        0b0111___1011_0001
        0_3661 underscore after 0 ok only for octal
        
        Java does not allow you to assign the value of a variable of a higher range data type to the variable of a lower range
        data type because there is a possible loss of precision in making such an assignment (because of overflow).
        byte, short -> int OK!
        long, int -> short Error!
        
        При явном приведении(cast: (byte), (short), (int)) к типу старшие разряды приводимого значения, не попадающего в диапазон типа, будут отброшены
        */                  
        intType();
        longType();
        byteType();
        shortType();
        
        /*
        char - unsigned 16 bits 0 to 65535.
        char -> int, long implicitly
        char -> byte, short cast explicitly (byte), (short)
        byte, short, int, long -> char cast explicitly (char)
        */
        charType();
        
        // !!!boolean variable cannot be cast to any other data type and vice versa.
        booleanType();
        
        /*
        float  32 bits +-1.4x10E-45 to +-3.4x10E38 (approx.) 6-7 decimal digits before E
        double 64 bits +-4.9x10-324 to +-1.7x10308 (approx.) 15 decimal digits before E     
        The value of all integral types (int, long, byte, short, and char) can be assigned to a variable of the float(double) data type without using an explicit cast.
        A float(double) value must be cast before it is assigned to a variable of any integral data type int, long, byte, short, or char. Cast(Approximation) to least side
        float -> double cast explicitly (float)
        */    
        floatType();
        doubleType();
	}
    
    /**
     * The int data type is a 32-bit(4 bytes) signed Java primitive data type(-2,147,483,648 to 2,147,483,647 (-2E31 to 2E31 - 1)).
     */
    private static void intType() {
        System.out.println("---------------------------int-----------------------------");
        // Decimal number format (10)
        int dec = 21;
        int dec0 = 0;
        System.out.println("Decimal 21="+dec+" Decimal 0="+dec0);
        
        // Octal number format (digits 0-7) - starts with a zero and has at least one digits after zero
        int oct = 021;
        int oct0 = 00;
        System.out.println("Octal 21="+oct+" Octal 0="+oct0);
        
        // Hexadecimal number format (16) - start with 0x or 0X and has at least one hexadecimal digit.
        // hexadecimal number format uses 16 digits, 0-9 and A-F (or a-f )
        int hexLowerX = 0xd25c;
        int hexUpperX = 0Xd25c;
        int hexMix = 0xD25c;
        int hex0 = 0x0;
        System.out.println("Hexadecimal 0xd25c="+hexLowerX+" Hexadecimal 0Xd25c="+hexUpperX);
        System.out.println("Hexadecimal 0xD25c="+hexMix+" Hexadecimal 0x0="+hex0);
        
        // Binary number format - start with 0b or 0B and has at least one digits
        int binLowerX = 0b10101;
        int binUpperX = 0B10101;
        int bin0 = 0b0;
        System.out.println("Binary 0b10101="+binLowerX+" Binary 0B10101="+binUpperX+" Binary 0b0="+bin0);
        
        // Для удобочитаемости вводимого большого числа для отделения порядков можно использовать _ , который выбросится компилятором
        int decUnderscore = 123_456_789;
        int binUnderscore = 0b1001_0111_1001_0110;       
        System.out.println("Decimal underscore 123_456_789="+decUnderscore);
        System.out.println("Binary underscore 0b1001_0111_1001_0110="+binUnderscore);
        
        // maximum and minimum values for the int data type (-2,147,483,648 to 2,147,483,647 (-2E31 to 2E31 - 1)).
        System.out.println("Integer.MAX_VALUE="+Integer.MAX_VALUE+" Integer.MIN_VALUE="+Integer.MIN_VALUE);
        System.out.println("int takes " + Integer.BYTES + " bytes");
    }
    
    /**
     * The long data type is a 64-bit(8 bites) signed Java primitive data type (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807(-2E63 to 2E63 - 1)).
     * An integer literal of type long always ends with L(or lowercase l). 
     */
    private static void longType() {
        System.out.println("---------------------------long-----------------------------");
        // An integer literal of type long always ends with L(or lowercase l) 
        long longUppercase = -211L; 
        // but l (lowercase L) is often confused with 1 (digit one) in print, so don't recommend.
        long longLowercase = 5611l;
        
        // Integer literals of long type can also be expressed in octal, hexadecimal, and binary formats. For example
        long longDecimal = 25L;       
        long longOctal = 031L;      
        long longHexadecimal = 0X19L;      
        long longBinary = 0b11001L;
        System.out.println("longBinary = "+longBinary);
        
        // One more than maximum positive value for long. This will generate a compiler error
        // long num1 = 9223372036854775808L;
        
        // Because the int data type has a lower range than long data type, the value stored in an int variable can always be assigned to a long variable.
        int intVar = 125;
        long longVar = intVar;
        
        // You cannot simply assign the value stored in a long variable to an int variable. There is a possibility of value overflow.
        // To guard against overflow, Java does not allow you to write code like (Even if the value stored in a long variable is well within the range of the int data type)
        // intVar = longVar;
        
        // If you want to assign the value of a long variable to an int variable, you have to cast long type to int:
        intVar = (int)longVar;
        // Java will use only the 32 least significant bits
        longVar = 2_147_483_999L;   // 2,147,483,999 > 2,147,483,647 (Integer.MAX_VALUE)
        intVar = (int)longVar;      // -2,147,483,297
        System.out.println("(int)2,147,483,999L = " + intVar);

        // maximum and minimum values for the long data type (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        System.out.println("Long.MAX_VALUE="+Long.MAX_VALUE+" Long.MIN_VALUE="+Long.MIN_VALUE);  
        System.out.println("long takes " + Long.BYTES + " bytes");
    }
    
    /**
     * The byte data type is a 8-bit(1 bytes) signed Java primitive data type (-128 to 127(-2E7 to 2E7 - 1)).
     */
    private static void byteType() { 
        System.out.println("---------------------------byte-----------------------------");
        byte byteVar = -121;
        // If you assign an int(short, long) literal to a byte variable and the value is outside the range of the byte data type, Java generates a compiler error.
        int intVar = 10;
        // byteVar = intVar;
        // byteVar = 135;
        
        // Cast int to byte
        byteVar = (byte)intVar;     
        // Cast with out range (higher order bits (9th to 32nd) are ignored)
        int intVarOver = 135;       // 135 > 127
        byteVar = (byte)intVarOver; // -121
        System.out.println("(byte)135 = " + byteVar);
        
        // maximum and minimum values for the byte data type (-128 to 127(-2E7 to 2E7 - 1)).
        System.out.println("Byte.MAX_VALUE=" + Byte.MAX_VALUE + " Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("byte takes " + Byte.BYTES + " bytes");
    }
    
    /**
     * The byte data type is a 16-bit(2 bytes) signed Java primitive data type (-32768 to 32767 (or -2E15 to 2E15 - 1)).
     */
    private static void shortType() {  
        System.out.println("---------------------------short-----------------------------");
        short shortVar = 15;        // ok
        //shortVar = 35000;         // A compile-time error of an int literal outside the short range
        
        byte byteVar = 10; 
        shortVar = byteVar;         // ok
        
        int intVar = 10; 
        //shortVar = intVar;        // A compile-time error
        shortVar = (short)intVar;   // ok because of cast from int to short
                   
        long longVar = 555L;
        //shortVar = longVar;       // A compile-time error
        shortVar = (short)longVar;  // ok because of the cast from long to short
        shortVar = (short)555L;     // ok because of the cast from long to short   
        
        // Cast with out range (higher order bits (16th to 32nd) are ignored)
        int intVarOver = 40000;       // 40000 >  32767
        shortVar = (short)intVarOver; // -25536
        System.out.println("(short)40000 = " + shortVar);
        
        // maximum and minimum values for the short data type (-32768 to 32767 (or -2E15 to 2E15 - 1)).
        System.out.println("Short.MAX_VALUE=" + Short.MAX_VALUE+" Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("short takes " + Short.BYTES + " bytes");
    }
    
    /**
     * The char data type is a 16-bit unsigned Java primitive data type (0 to 65535).
     * It represents a Unicode character (utf-16).
     */
    private static void charType() {
        System.out.println("----------------------------char----------------------------");
        // A character enclosed in single quotes
        char c1 = 'A';
        char c2 = '5';
        char c3 = '/';
        
        /* A String literal cannot be assigned to a char variable.
           All String literals represent objects of String class in Java and hence they are of reference data type, 
           whereas character char literals represent primitive data type. 
        */
        char c = 'B';   // OK
        String s = "A"; // OK. "A" is a String assigned to a String variable
        //c = s;
        //c = "A";     // An error. Cannot assign a String "A" to char c1
        //c = 'AB';    // An error. A character literal must contain only one character
        //c = (char)s; // An error. String do not convert to char.      
       
        // A character literal can also be expressed as a character escape sequence.
        // There are only eight character escape sequences in Java:
        char 
            lineFeed =      '\n',     
            carriageReturn ='\r',
            formFeed =      '\f',
            backspace =     '\b',
            tab =           '\t',
            backslash =     '\\',
            doubleQuote =   '\"',
            singleQuote =   '\'';
        
        System.out.println("doubleQuote "+doubleQuote+'\"'+" \"\"");
        System.out.println("backslash "+backslash+'\\'+"\\\\");
        /*!!! In character and String literals, the linefeed and carriage return should always be written as \n and \r, respectively, not as \u000A and \u000D. */
        
        // A character literal can also be expressed as a Unicode escape sequence in the form 'u\xxxx'.
        // The value represented by xxxx (four! hexadecimal digits) is the Unicode value for the character.
        char charLiteral = 'A';     // A
        char charUnicode = '\u0041';// A
        char charDecimal = 65;      // A 65(dec) = 0x41. Decimal char range 0-65535
        // A character literal can also be expressed as an octal escape sequence in the form '\nnn'. nnn - 1-3 octal digits(recommend to use 3 digits). Range 0-377 (decimal 0-255) 
        char charOcatal = '\101';   // A 101(oct) = 65(dec) = 0x41
        char charOcatal2 = '\52';   // valid, but do not recommend. Right '\052' (three digits)
        //char charOcatal3 = '\400'; // An error. Out range 400 > 377
        System.out.println("A="+charLiteral+" \u0041="+charUnicode+" 65="+charDecimal+ " charOcatal="+charOcatal);
        
        /*You cannot assign a value stored in a numerical variable to a char variable. The reason is that they is a
          signed data type whereas char is an unsigned data type. You must to cast explicitly integer to char.
          (higher order bits are ignored with 17th)      
        */
        byte byteType = 10;
        short shortType = 15;
        int intType = 150;
        long longType = 20L;
        char charType = 'A';
        
        // byte and char
        //byteType = charType;      // An error. byte 8 bits < char 16 bits
        byteType = (byte)charType;  // Ok
        //charType = byteType;      // An error
        charType = (char)byteType;  // Ok
        
        // short and char
        //shortType = charType;     // An error. short signed 16 bits < char unsigned 16 bits
        shortType = (short)charType;// Ok
        //charType = shortType      // An error
        charType = (char)shortType; // Ok
        
        // int and char
        intType = charType;         // Ok. int 32 bits > char 16 bits
        intType = (int)charType;    // Ok. But, cast is not required. Use intType = charType
        //charType = intType;       // An error
        charType = (char)intType;   // Ok
        charType = 255;             // Ok. 255 is in the range of 0-65535
        //charType = 70000;         // An error. 70000 is out of range 0-65535
        charType = (char)70000;     // Ok. But, will lose the original value
        
        // long and char
        longType = charType;        // Ok. long 64 bits > char 16 bits
        longType = (long)charType;  // Ok. But, cast is not required. Use num2 = c1
        //charType1 = longType;     // An error
        charType = (char)longType;  // Ok
        //charType = 255L;          // An error. 255L is a long literal
        charType = (char)255L;      // Ok. But use c1 = 255 instead
       
        System.out.println("char takes " + Character.BYTES + " bytes");    
    }
    
    /**
     * The boolean data type has only two valid values: true and false.
     */
    private static void booleanType() {
        System.out.println("---------------------------boolean-----------------------------");
        //The boolean data type has only two valid values: true and false.
        //!!!boolean variable cannot be cast to any other data type and vice versa.
        boolean done;
        done = true;
        boolean none = false;
        System.out.println("done="+done+" none="+none);    
    }
    
    /**
     * The float data type uses 32 bits to store a floating-point number (+-1.4x10E-45 to +-3.4x10E38 (approx.) 6-7 decimal digits before E).
     * bits: 1-sign; 2-9-exponent; 10-32-significand (precision 2e23-bin or aprox. 8,388,000-dec).
     */
    private static void floatType() {
         System.out.println("---------------------------float-----------------------------");
        // All real numbers that end with f or F are called float literals.
        // Decimal number format:
        float f1 = 8F;
        float f2 = 8.F;
        float f3 = 8.0F;
        float f4 = 3.51F;
        float f5 = 0.0F;
        float f6 = 16.78f;
        
        // Scientific notation with E or e (3.25):
        f1 = 32.5E-1F;
        f1 = 0.325E+1F;
        f1 = 0.325E1F;
        f1 = 0.0325E2F;
        f1 = 0.0325e2F;
        f1 = 3.25E0F;
         
        // The float data type defines two zeros: +0.0F (or 0.0F) and -0.0F (they equal)    
        float f0Pos = +0F;
        float f0Neg = -0F;
        boolean equalZero = (f0Pos == f0Neg); 
        System.out.println("equal two zeros: +0.0F (or 0.0F) and -0.0F " + equalZero);
        System.out.println("1000 * (+0.0F) == 0.0F " + (10000000 * f0Pos == +0.0F)); 
        System.out.println("1000 * (+0.0F) == 0 " + (10000000 * f0Pos == 0));
        System.out.println("1000 * (+0.0F) == -0.0F " + (10000000 * f0Pos == -0.0F));
        System.out.println("1/(1/Infinity) == 0 " + (1/(1/0.0F) == 0));
        
        // dividing 0.0F is Infinity (special value of the float data type called Infinity).
        System.out.println("dividing 0.0F = "+3.2F/0);
        // NaN is the result of arithmetic operations that do not have meaningful results, such as dividing zero by zero, the square root of a negative number, adding -Infinity to +Infinity, etc.
        System.out.println("Math.sqrt(-5) * 5 + 10 = " + (Math.sqrt(-5) * 5 + 10));
        
        // Print sone float constants
		System.out.println("Max float = " + Float.MAX_VALUE); // 3.4028235E38
		System.out.println("Min float = " + Float.MIN_VALUE); // 1.4E-45
		System.out.println("Positive infinity for float = " + Float.POSITIVE_INFINITY); // Infinity
		System.out.println("Negative infinity for float = " + Float.NEGATIVE_INFINITY); // -Infinity
		System.out.println("Not-a-Number for float = " + Float.NaN); // NaN
		System.out.println("float takes " + Float.BYTES + " bytes"); // 4 bytes
        
        float fInf = Float.POSITIVE_INFINITY;   // Ok. Assigns positive infinity to the fInf variable
        float fNan = Float.NaN;                 // Ok. Assigns Not-a-Number(не число) to fNan variable
        float bigNum = Float.MAX_VALUE;         // Assigns maximum float value
               
        // Неправильная и правильная проверки
        if (fNan != Float.NaN) System.out.println("No correct check value NaN");
        if (Float.isNaN(fNan)) System.out.println("Correct check value NaN");
        if (Float.isInfinite(fInf)) System.out.println("Correct check value Infinity");
        
        // A compile-time error. Cannot assign a float literal to a float variable greater than the maximum value of float(3.4E38F approx)
        //float fTooBig = 3.5E38F;
        // A compile-time error. Cannot assign a float literal to a float variable less than the minimum value (greater than zero) of float 1.4E-45F
        //float fTooSmall = 1.4E-46F;     
        
        // The value of all integral types (int, long, byte, short, and char) can be assigned to a variable of the float data type without using an explicit cast.
        int intType = 15000;
        long longType = 1226L;
        float floatType = intType;  // Ok. int variable to float
        floatType = 12455;          // Ok. int literal to float
        floatType = longType;       // Ok, a long variable to float
        floatType  = 'A';           // Ok. Assigns 65.0F to justAChar
                   
        // A float value must be cast before it is assigned to a variable of any integral data type int, long, byte, short, or char.
        // Cast(Approximation) to least side
        //intType = floatType;      // An error. Cannot assign float to int
        intType = (int)floatType;   // Ok
        short shortType = (short)12.8F; // Ok. 12
        System.out.println("12.8 cast to short " + shortType); //
        
        //The assignment of int and long to float may result in loss of precision
        int num1 = 1029989998;  // Stores an integer in num1
        float num2 = num1;      // Assigns the value stored in num1 to num2
        int num3 = (int)num2;   // Assigns the value stored in num2 to num3
        System.out.println("int 1029989998 cast to float = " + num3);  
    }
    
    /**
     * The double data type uses 64 bits to store a floating-point number (4.9 x 10-324 and as big as 1.7 x 10308 (approx.) 15 decimal digits before E)).
     * bits: 1-sign; 2-12-exponent; 13-64-significand (precision 2e53-binary)
     */
    private static void doubleType() {
         System.out.println("---------------------------double-----------------------------");
        // The suffix d or D is optional in double literals
        double d1 = 8D;
        double d2 = 8.;
        double d3 = 8.0;
        double d4 = 8.D;
        double d5 = 78.9867;
        double d6 = 45.0;
        // scientific notation 3.25
        d1 = 32.5E-1;
        d1 = 0.325E+1;
        d1 = 0.325E1;
        d1 = 0.0325E2;
        d1 = 0.0325e2;
        d1 = 32.5E-1D;
        d1 = 0.325E+1d;
        d1 = 0.325E1d;
        d1 = 0.0325E2d;
        
        // Hexadecimal Scientific notation (P or p insted E), степень - в десятичной форме
        d1 = 0x22.B3p15;
        d1 = 0x2.BA1P-25;

        // Print sone double constants
        System.out.println("Max double = " + Double.MAX_VALUE); // 1.7976931348623157E308
        System.out.println("Min double = " + Double.MIN_VALUE); // 4.9E-324
        System.out.println("Positive infinity for double = " + Double.POSITIVE_INFINITY); // Infinity
        System.out.println("Negative infinity for double = " + Double.NEGATIVE_INFINITY); // -Infinity
        System.out.println("Not-a-Number for double = " + Double.NaN); // NaN
        System.out.println("double takes " + Double.BYTES + " bytes"); // 8 bytes
        
        double dInf = Double.POSITIVE_INFINITY; // Ok. Assigns positive infinity to dInf variable
        double dNan = Double.NaN;// Ok. Assigns Not-a-Number to dNan variable
        
        // Неправильная и правильная проверки
        if (dNan != Float.NaN) System.out.println("No correct check value NaN");
        if (Double.isNaN(dNan)) System.out.println("Correct check value NaN");
        if (Double.isInfinite(dInf)) System.out.println("Correct check value Infinity");
        
        // dividing 0.0 is Infinity (special value of the float data type called NaN (Not-a-Number)).
        System.out.println("dividing 0.0="+3.2/0.);
        
        //The value of all integral types (int, long, byte, short, char) and float can be assigned to a variable of the double data type without using an explicit cast.
        int intType = 15000;
        double doubleType = intType; // Ok. int variable to double
        float floatType = 10.1F;
        doubleType = 110;  // Ok. int literals to double
        doubleType = floatType; //Ok. float variable to double
                 
        // A compile-time error. Cannot assign a double literal to a double variable greater than the maximum value of double (1.7E308 approx)
        //double dTooBig = 1.8E308;
        // A compile-time error. Cannot assign a double literal to a double variable less than the minimum value (greater than zero) of double 4.9E-324
        //double dTooSmall = 4.9E-325;
        
        // A double value must be cast to the integral type before it is assigned to a variable of any integral data type (int, long, byte, short, or char).
        // The assignment of int and long to double may result in loss of precision
        //intType = doubleType;     // A compile-time error. Cannot assign double to int
        //intType = 10.1;           // A compile-time error. Cannot assign double to int
        intType = (int)doubleType;  // Now Ok.
        //floatType = doubleType;   // A compile-time error. Cannot assign double to float
        floatType = (float)doubleType; //Ok       
    }
          
}

