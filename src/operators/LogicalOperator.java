
package operators;

/**
 * Logical Operators: 
 *  Unary: !
 *  Binary: &, &&, |, ||, ^, &=, |=, ^= 
 *  Ternary: ? : .
 * @author Alex
 */
public class LogicalOperator {
    public static void main ( String[] args ) {
        /* 
            Logical NOT Operator (!) : 
                !operand 
        */
        boolean b;
        b = !true;  // Assigns false to b
        b = !false; // Assigns true to b
        int i = 10;
        int j = 15;
        boolean b1 = true;
        b = !b1;    // Assigns false to b
        b = !(i > j); // Assigns true to b, because i > j returns false
        
        /*
            The logical short-circuit AND operator (&&) is used in the form: 
                operand1 && operand2
            The operator returns true if both operands are true. If either operand is false, it returns false. 
            It is called a short-circuit AND operator because if operand1 (the left-hand operand) evaluates to false, 
            it returns false without evaluating operand2 (the right-hand operand).
            Рекомендуется операнды, которые имеют большую вероятность получения false,
            ставить вперёд, чтобы сократить действия по вычислению && .
        */
        i = 10;
        j = 15;        
        b = (i > 5 && j > 10); // true : i > 5 true => j > 10 true => true and true - b = true
        b = (i < 5 && j > 10); // false: i < 5 false => b = false
        
        i = 10;
        j = 10;
        // ((j = 20) > 5) is not evaluated because i > 25 returns false
        b = (i > 25 && ((j = 20) > 15));
        System.out.println ("b = " + b + " i = " + i + " j = " + j); // b = false i = 10 j = 10
       
        /*
            Logical AND Operator (&): 
                operand1 & operand2
            The operator (&) works the same way as the logical short-circuit AND operator (&&), except for one difference.
            The logical AND operator (&) evaluates its right-hand operand even if its left-hand operand evaluates to false.    
            Используется, если требуется, чтобы в правом операнде были обязательно произведены какие-то критические операции
        */
        i = 10;
        j = 15;
        b = (i > 5 & j > 10); // Assigns true to b
        // ((j = 20) > 5) is evaluated even if i > 25 returns false
        b = (i > 25 & ((j = 20) > 15));
        System.out.println ("b = " + b + " i = " + i + " j = " + j); // b = false i = 10 j = 20
        
        /*
            The logical short-circuit OR operator (||) is used in the form
                operand1 || operand2
            The logical short-circuit OR operator returns true if either operand is true. If both operands are false, it returns false. 
            It is called a short-circuit OR operator because if operand1 evaluates to true, it returns true without evaluating operand2.
            Рекомендуется операнды, которые имеют большую вероятность получения true,
            ставить вперёд, чтобы сократить действия по вычислению || .
        */         
        i = 10;
        j = 15;
        b = (i > 5 || j > 10); // true : i > 5 - true => b = true
        b = (i > 20 || j > 10);// false: i > 20 - false => j > 10 - false => false || false = false
        
        /*
            The logical OR operator (|) is used in the form
                operand1 | operand2
            logical OR operator works the same way as the logical short-circuit OR operator, except for one difference. 
            The logical operator evaluates its right-hand operand even if its left-hand operand evaluates to true. 
            Используется, если требуется, чтобы в правом операнде были обязательно произведены какие-то критические операции
        */        
        b = (i > 5 | j > 20); // true : i > 5 - true, j > 10 - false => true || false = true 
        
        /*
            The logical XOR operator (^) is used in the form
                operand1 ^ operand2
            The logical XOR operator returns true if operand1 and operand2 are different. 
            That is, it returns true if one of the operands is true, but not both. 
            If both operands are the same, it returns false.
        */
        i = 10;
        b = true ^ true;    // false
        b = true ^ false;   // true
        b = false ^ true;   // true
        b = false ^ false;  // false
        b = (i > 5 ^ i < 15); // false
        
        /*
            Compound Logical Assignment Operators and Their Equivalents
                operand1 &= operand2  =>  operand1 = operand1 & operand2
                operand1 |= operand2  =>  operand1 = operand1 | operand2
                operand1 ^= operand2  =>  operand1 = operand1 ^ operand2   
            The operand1 must be a boolean variable and op may be &, |, ^.    
        */ 
        // With the &= operator, if both operands evaluate to true, &= returns true. Otherwise, it returns false.
        b = true;
        b &= true; // Assigns true to b
        b &= false; // Assigns false to b
        
        // With the != operator, if either operand evaluates to true, != returns true. Otherwise, it returns false.
        b = false;
        b |= true; // Assigns true to b
        b |= false; // Assigns false to b
        
        // With the ^= operator, if both operands evaluate to different values, that is, one of the operands is true but not both, ^= returns true. Otherwise, it returns false.
        b = true;
        b ^= true; // Assigns false to b
        b ^= false; // Assigns true to b
        
        /*
            Ternary Operator (? :):
                boolean-expression ? true-expression : false-expression
            If the boolean-expression evaluates to true, it evaluates the true-expression; otherwise, it evaluates false-expression.    
        */
        int num1 = 50;
        int num2 = 25;
        // Assigns num2 to minNum, because num2 is less than num1
        int minNum = (num1 < num2 ? num1 : num2);
        
    } 
}
