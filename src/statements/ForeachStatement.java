
package statements;

/**
 * It is used for iterating over elements of arrays and collections.
 * @author Alex
 */
public class ForeachStatement {
    public static void main(String[] args) {
        /* 
        The general syntax for a for-each loop is as follows:
            for(Type element : a_collection_or_an_array) {
                // This code will be executed once for each element in the collection/array.
                // Each time this code is executed, the element variable holds the reference
                // of the current element in the collection/array
            }
        */
        int[] numList = {10, 20, 30, 40};
        for(int num : numList) {
            System.out.println(num);
        }
    }            
}
