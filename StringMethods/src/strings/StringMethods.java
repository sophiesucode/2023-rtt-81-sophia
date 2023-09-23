package strings;
import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		
		/*1.) length() method
		 The length() method returns the length of the string, or it returns the count of the total number 
		 of characters present in the string.*/
		
	     	String str1 = "Java";
	        String str2 = "";
	        String str3="apple";

	        System.out.println(str1.length());  // 4
	        System.out.println(str2.length());  // 0
	        System.out.println("Java".length());  // 4
	        System.out.println("Java\n".length()); // 5
	        System.out.println("Learn Java".length()); // 10
	        
	        System.out.println(str3.length());
	        
	       /* 2.) IsEmpty() method:
	        	This method checks whether the String contains anything or not. If the Java String is empty,
	        	it returns true or false.*/
	        
	        	String s1="";
	        	String s2="hello";
	        	System.out.println(s1.isEmpty()); // true
	        	System.out.println(s2.isEmpty()); // false
	        	
	        	
	        /*3.)Trim() method:
	        	The Java string trim() method removes the leading and trailing spaces. It checks the Unicode
	        	value of the space character (‘\u0020’) before and after the string. If it exists, then remove 
	        	the spaces and return the omitted string.*/
	        	
	        	String s3="  hello   "; 
	        	System.out.println(s3+"how are you");        // without trim() 
	        	System.out.println(s3.trim()+"how are you"); // with trim() 
	        	
	        	
	        	
	       /* 4.) toLowerCase() method:
	        	The toLowerCase() method converts all the characters of the String to lowercase. For example:*/
	        	String s8="HELLO HOW Are You?";
	            String s1lower=s8.toLowerCase();
	            System.out.println(s1lower);
	            
	            
	            
	           /* 5.)Java String toUpper() method:
	            	The toUpperCase() method converts all of the String characters to uppercase. For example:*/
	            
	            String s7="hello how are you"; 
	            String s1upper=s7.toUpperCase(); 
	            System.out.println(s1upper);
	            
	            
	            /*6.)concat() method
	            You can also use the + operator to concatenate two or more strings. But the Java String 
	            class provides the concat() method. This method combines a specific string at the end of 
	            another string, and ultimately returns a combined string. For example:*/
	            
	            //------By using concat method----
	            String str4 = "Learn ";
	            String str5 = "Java";
	            // concatenate str1 and str2
	            System.out.println(str1.concat(str2)); // "Learn Java"

	            // concatenate str2 and str11
	            System.out.println(str2.concat(str1)); // "JavaLearn "
	          //--- By using + operator---
	            String s6 =  "hello";
	            String s71 = "Learners";
	          //  String s5 = s3.concat(s4); or
	               String s10 = s6 + s71;
	          //both of the above statement will give you the same result

	           // Three strings are concatenated
	            String message = "Welcome " + "to " + "Java";

	          // String Chapter is concatenated with number 2
	            String s = "Chapter" + 2; // s becomes Chapter2

	        // String Supplement is concatenated with character B
	            String s0 = "Supplement" + 'B'; // s1 becomes SupplementB



	            /*7.)split() method
	            The split() method divides the string at the specified regex and returns an array of substrings. The syntax of the string split() method is:
	            string.split(String regex, int limit)
	            regex - the string is divided at this regex (can be strings)
	            limit (optional) - controls the number of resulting substrings

	            If the limit parameter is not passed, split() returns all possible substrings.*/

	            // importing Arrays to convert array to string
	            // used for printing arrays
	            

	            
	                String vowels = "a::b::c::d:e";

	                // splitting the string at "::"
	                // storing the result in an array of strings
	                String[] result = vowels.split("::");

	                // converting array to string and printing it
	                System.out.println("result = " + Arrays.toString(result));
	              
	        

	               // 8.)charAt() method:
	                String message1 = "Welcome to Java";
	                System.out.println("The first character in the message is " + message1.charAt(0));
	                

	                //9.)compareTo() method:
	                	/*The Java String compareTo() method compares the given string with the current string. 
	                	It is a method of ‘Comparable’ interface that is implemented by the String class. It either
	                	returns a positive number, a negative number, or 0. For example:*/
	                
	                String s12="hello";
	                String s13="hello";
	                String s14="hemlo";
	                String s15="flag";
	                System.out.println(s12.compareTo(s14)); //-1 because "l" is only one time lower than "m"
	                System.out.println(s12.compareTo(s15)); // 2 because "h" is 2 times greater than "f"
	                
	                /*10.)Substrings() method:

	                	The substring() method extracts a substring from the string and returns it. 
	                	The syntax of the substring() method is*/
	                
	               String str11 = "java is fun";

	               // extract substring from index 0 to 3
	               System.out.println(str11.substring(0, 4));
	               
	               
	               	/*11.) indexOf() method:
	            	  The indexOf() method returns the index of the first occurrence of the specified character/substring
	            	  within the string.*/
	               String str111 = "Java is fun";
	               int result1;

	               // getting index of character 's'
	               result1 = str111.indexOf('s');

	               System.out.println(result1); // 6

	               // getting index of character 'J'
	               result1 = str111.lastIndexOf('J');
	               System.out.println(result1); // 0

	               
	               result1 = str111.lastIndexOf('a');
	               System.out.println(result1); // 3

	               // character not in the string
	               result1 = str111.lastIndexOf('j');
	               System.out.println(result1); // -1

	               // getting the last occurrence of "ava"
	               result1 = str111.lastIndexOf("ava");
	               System.out.println(result1); // 1

	               // substring not in the string
	               result1 = str111.lastIndexOf("java");
	               System.out.println(result1); // -1



	                

	        	
	        	
	        	
	        	
	        	

	        	




	}

}
