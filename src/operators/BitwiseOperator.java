
package operators;

/**
 * Bitwise operators:
 *  Unary: ~
 *  Binary: &, |, ^, <<, >>, >>>
 *  Compound: &=, !=, ^=, <<=, >>=, >>>= .
 * All bitwise operators work with only integers variables >=32 bit (int, long) or both primitive data type operands(literals).
 * @author Alex
 */
public class BitwiseOperator {
    public static void main ( String[] args ) {
        
        byte b1 = 15; 
        byte b2 = 5;
        byte b3; 
        //b3 = b1 & 5;  // error: do not allow to cast int to byte
        //b3 = b1 & b2; // error: do not allow to cast int to byte
        b3 = 15 & 5;    // вычисление литералов происходит на стадии компиляции и результат присваивается b3 в скомпилированном коде
        long l1 = 13;
        long l2 = l1 & 3;
        
        float f1 = 1.2F;
        //float f2 = f1 & 2; //error
        //float f2 = 1.2F & 2; //error
        
        /* &
        The bitwise AND (&) operator operates on corresponding bits of its two operands and returns 1 if both bits are 1, and 0 otherwise. 
        Note that the bitwise AND (&) operates on each bit of the respective operands, not on the operands as a whole.
        */
        int i = 13 & 3; // 1
        /*
        13       00000000 00000000 00000000 00001101
        3        00000000 00000000 00000000 00000011
        ----------------------------------------------
        13 & 3 - 00000000 00000000 00000000 00000001 (Equal to decimal 1)
        */
        
        /* |
        The bitwise OR (|) operates on corresponding bits of its operands and returns 1 if either bit is 1, and 0 otherwise.
        */
        i = 13 | 3; // 15
        /*
        13     00000000 00000000 00000000 00001101
        3      00000000 00000000 00000000 00000011
        --------------------------------------------
        13 | 3 00000000 00000000 00000000 00001111 (Equal to decimal 15)
        */
        
        /* ^
        The bitwise XOR (^) operates on corresponding bits of its operands and returns 1 if only one of the bits is 1. Otherwise, it returns 0.
        */
        i = 13 ^ 3; // 14
        /*
        13     00000000 00000000 00000000 00001101
        3      00000000 00000000 00000000 00000011
        -------------------------------------------
        13 ^ 3 00000000 00000000 00000000 00001110 (Equal to decimal 14)
        */
        
        /* ~
        The bitwise NOT (~) operates on each bit of its operand. It inverts the bits, that is, 1 is changed to 0 and 0 is changed to 1
        */
        i = ~13; // -14
        /*
        13  00000000 00000000 00000000 00001101 
        ------------------------------------------
        ~13 11111111 11111111 11111111 11110010 (Equal to decimal -14)      
        */
        
        /* <<
        The bitwise left shift operator (<<) shifts all the bits to the left by the number of bits specified as its right-hand operand. 
        It inserts zeros at the lower-order bits. The effect of shifting 1 bit to left is same as multiplying the number by 2.
        Therefore, 9 << 1 will produce 18, whereas 9 << 2 produces 36.
        */
        i = 13 << 4; // 208
        /*
        13      00000000 00000000 00000000 00001101 <-
        13 << 4 00000000 00000000 00000000 11010000 (Equal to decimal 208: 32*(2*2*2*2)) 
        */
          
        i = -13 << 2;   // -52 (-13*2*2)   
        /*
        -13      11111111 11111111 11111111 11110011 <-
        -13 << 2 11111111 11111111 11111111 11001100 (Equal to decimal -52)
        */ 
        i = 13 << 35;       // Equal 13 << (35 % 32) = 13 << 3 = 104
        long val = 13;
        long result;
        result = val << 35; // Equal 13 << (35 % 64) = 13 << 35 = 446676598784
        
        /* >>
        The bitwise signed right shift operator (>>) shifts all the bits to the right by the number specified as its right-hand operand. 
        If the most significant digit of the left-hand operand is 1 (for negative numbers), all higher order bits are filled with 1s after the shift operation. 
        If the most significant bit is 0 (for positive numbers), all higher order bits are filled with 0s. 
        Because the sign bit after right shift operation (>>) remains the same, it is called a signed right shift operator.
        */
        i = 13 >> 2;   // 3       
        /*
        13      00000000 00000000 00000000 00001101 ->
        13 >> 2 00000000 00000000 00000000 00000011 (Equal to decimal : 3) 
        */
        
        i = -13 >> 2;   // -4
        /*
        -13      11111111 11111111 11111111 11110011 ->
        -13 << 2 11111111 11111111 11111111 11111100 (Equal to decimal : -4) 
        */
        
        /*
        The unsigned right shift operator (>>>) works the same as the signed right shift operator (>>), except for one difference. 
        It always fills the higher order bits with zero.
        */
        i = 13 >>> 2;  // 3;  equal 13 >> 2 
        i = -13 >>> 2; // 1073741820
        /*
        -13       11111111 11111111 11111111 11110011 ->
        -13 >>> 4 00111100 11111111 11111111 11111100 (Equal to decimal :1073741820)
        */
        
        /* &=, |=, ^=, <<=, >>=, and >>>=
        A compound bitwise assignment operator is used in the following form:
            operand1 op= operand2
        Here, op is one of the bitwise operators of &, |, ^, <<, >>, and >>>. operand1 and operand2 are of primitive integral
        data type where operand1 must be a variable. The above expression is equivalent to the following expression:
            operand1 = (Type of operand1) (operand1 op operand2)
        */
        i = 13;
        i >>= 2; // i = i >> 2 = 13 >> 2 = 3
        System.out.println (i);        
    }
    
}
