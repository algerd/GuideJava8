
package wrappers;

/**
 * The automatic wrapping from a primitive data type (byte, short, int, long, float, double, char and boolean)
 * to its corresponding wrapper object (Byte, Integer, Long, Float, Double, Character and Boolean) is called
 * autoboxingThe reverse, unwrapping from wrapper object to its corresponding primitive data type, is called unboxing.
 * !!! Autoboxing/unboxing is performed when you compile the code. The JVM is completely unaware of the boxing
 * and unboxing performed by the compiler.
 * @author Alex
 */
public class Boxing {
    
    public static void main(String[] args) {
        
        Integer n1 = 200;   // Boxing - similary Integer.valueOf(200)
        int a = n1;         // Unboxing - similary n.intValue()
        Integer n2 = 300;
        Integer n3 = n1 + n2; // Unboxing n1 and n2, add n1 + n2, boxing sum into n3
       
        // Beware of Null Values !!!
        Integer n4 = null;
        //int i = 5 + n4;     // Unboxing n4 => NullPointerException - primitive types cannot be null(reference type)

        /*
        The rule for a method invocation that uses autoboxing/unboxing follows a two-step process.
            1. If the actual argument being passed is a primitive type (as in test(10)),
                a. Try to find a method with the primitive type argument. If there is no exact match, try
                    widening the primitive type to find a match.
                b. If the previous step fails, box the primitive type and try to find a match.
            2. If the actual argument being passed is a reference type (as in test(new Integer(101)),
                a. Try to find a method with the reference type argument. If there is match, call that
                    method. In this case, a match does not have to be exact. It should follow the subtype
                    and super type assignment rule.
                    Reference type is never widened. That is, an Integer is never widened to Long.
                b. If the previous step fails, unbox the reference type to the corresponding primitive type
                    and try to find an exact match, or widen the primitive type and find a match. 
                Reference type is never widened. That is, an Integer is never widened to Long.    
        */
        Boxing boxtest = new Boxing();
        // test1
        boxtest.test1(101);                 // test1(int)=101
        boxtest.test1(new Integer(101));    // test1(Integer)=101
        // test2
        boxtest.test2(101);                 // test2(long)=101
        boxtest.test2(new Integer(101));    // test2(Integer)=101
        // test3
        boxtest.test3(101);                 // test3(long)=101
        boxtest.test3(new Integer(101));    // test3(long)=101
        // test4
        boxtest.test4(101);                 // test4(Object)=101
        boxtest.test4(new Integer(101));    // test4(Object)=101
        
        /*
        Comparison Operators and AutoBoxing/Unboxing: ==, >, >=, <, <=.
        1.If a numeric wrapper object is used with >, >=, <, <= operators, it is unboxed and the corresponding primitive type used in the comparison.
            If you mix the two types, reference and primitive, with these comparison operators, you still get the same results. 
            First, the reference type is unboxed and a comparison with the two primitive types takes place.
        2. ==
            If both operands are primitive types, they are compared as primitive types using a value comparison. 
            If both operands are reference types, their references arecompared. In these two cases, no autoboxing/unboxing takes place. 
            When one operand is a reference type and another is a primitive type, the reference type is unboxed to a primitive type and a value comparison takes place.
        */
        Integer aa = 100;
        Integer b = 100;
        System.out.println("aa > b: " + (aa > b)); // false
        System.out.println("a >= b: " + (aa >= b)); // true
        System.out.println("a < b: " + (aa < b)); // false
        System.out.println("a <= b: " + (aa <= b)); // true
        
        // comparison == primitive type
        int ap = 100;
        int bp = 100;
        int cp = 505;
        System.out.println(ap == bp); // true
        System.out.println(ap == cp); // false
        
        // comparison == reference type
        Integer ar = new Integer(100);
        Integer br = new Integer(100);
        Integer cr = ar;
        System.out.println(ar == br); // false
        System.out.println(ar == cr); // true
        
        // comparison == values reference type
        Integer aaa = 100; // Boxing – Integer.valueOf(100) object is cashed
        Integer bbb = 100; // Boxing – Integer.valueOf(100) object is cashed
        Integer ccc = 505; // Boxing – Integer.valueOf(505) outside the range –128 to 127, new object is created
        Integer ddd = 505; // Boxing – Integer.valueOf(505) outside the range –128 to 127, new object is created
        System.out.println(aaa == bbb); // true
        System.out.println(aaa == ccc); // false
        System.out.println(ccc == ddd); // false
        
        /*
        Collections and Autoboxing/Unboxing:
            Collections work only with reference types. 
            Примитивные типы, имеющие wrapper классы, автоматически враппятся (autoboxing) и полученный объект используется в Collections.
            Если указывать тип generic wrapper класса (напр Integer), то в случае необходимости методы коллекции будут возвращать unboxing primitive type (напр int)
        */
        // Collections with reference types
        java.util.List list = new java.util.ArrayList();
        list.add(new Integer(101));
        Integer num = (Integer)list.get(0);
        int aValue = num.intValue();
        
        // Collections with autoboxing primitive types
        java.util.List list2 = new java.util.ArrayList();
        list2.add(101); // Autoboxing will work here
        Integer num2 = (Integer)list2.get(0);
        int aValue2 = num2.intValue();
        /*int aValue = list.get(0); */ // autounboxing won't compile
        
        // Collections with generic and autoboxing/autounboxing primitive types
        java.util.List<Integer> list3 = new java.util.ArrayList<>();
        list3.add(101); // autoboxing will work
        int aValue3 = list3.get(0); // autounboxing will work, too
        
    }
    
    // Overloaded Methods and Autoboxing/Unboxing
    // test1
    public void test1(Integer iObject) {
        System.out.println("test1(Integer)=" + iObject);
    }
    public void test1(int iValue) {
        System.out.println("test1(int)=" + iValue);
    }
    // test2
    public void test2(Integer iObject) {
        System.out.println("test2(Integer)=" + iObject);
    }
    public void test2(long iValue) {
        System.out.println("test2(long)=" + iValue);
    }
    // test3
    public void test3(Long lObject) {
        System.out.println("test3(Long)=" + lObject);
    }
    public void test3(long lValue) {
        System.out.println("test3(long)=" + lValue);
    }
    // test4
    public void test4(Long lObject) {
        System.out.println("test4(Long)=" + lObject);
    }
    public void test4(Object obj) {
        System.out.println("test4(Object)=" + obj);
    }
}
