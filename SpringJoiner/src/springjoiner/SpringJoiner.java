package springjoiner;

import java.util.StringJoiner;

public class SpringJoiner {
	
	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner("&","=", "="); 

		joinNames.add("Java");
		joinNames.add("Python");
		joinNames.add("C Sharp");
		joinNames.add("Javascript");
//				
//		System.out.println(joinNames);
//		
		
		
		
		
		StringJoiner joinNames1 = new StringJoiner("*", "[", "]");
		/* passing comma(,) and square-brackets as delimiter */
		// ----- Adding values to StringJoiner---
		joinNames1.add("New York");
		joinNames1.add("New Jersey");
		System.out.println("________________________________________________________");
		// ---- Creating StringJoiner with :(colon) delimiter
		StringJoiner joinNames2 = new StringJoiner(":", "[", "]");
		/* passing colon(:) and square-brackets as delimiter */

		// ---Adding values to StringJoiner-----
		joinNames2.add("Dallas");
		joinNames2.add("Chicago");
//		// ---- Merging two StringJoiner ----
		StringJoiner merge = joinNames1.merge(joinNames2);
		System.out.println(merge);
		
		
		
		
	}
	
}
