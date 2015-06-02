// CollatorStringComparison.java
package string;

import java.text.Collator;
import java.util.Locale;

public class CollatorStringComparison {
	public static void main(String[] args) {        
		// Create a Locale object for US 
		Locale USLocale = new Locale("en", "US");

		// Get collator instance for US 
		Collator c = Collator.getInstance(USLocale);		
		String str1 = "cat";
		String str2 = "Dog";

        /*
        Use the compare() method of the java.text.Collator class to perform language-sensitive (dictionary order)
        string comparisons. The method takes two strings to be compared as arguments. It returns 0 if two strings are the
        same, 1 if the first string comes after the second, and -1 if the first string comes before the second.
        */
		int diff = c.compare(str1, str2);
		System.out.print("Comparing using Collator class: ");
		print(diff, str1, str2);

		System.out.print("Comparing using String class: ");
		diff = str1.compareTo(str2);
		print(diff, str1, str2);
	}

	public static void print(int diff, String str1, String str2) {
		if (diff > 0) {
			System.out.println(str1 + " comes after " + str2);
		}
		else if (diff < 0) {
			System.out.println(str1 + " comes before " + str2);
		}
		else {
			System.out.println(str1 + " and " + str2 + " are considered the same." 	);
		}
	}
}
