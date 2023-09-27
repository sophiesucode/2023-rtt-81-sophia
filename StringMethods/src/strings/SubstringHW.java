package strings;

public class SubstringHW {
public static void main(String[] args) {
	
	String string="This is a string";
	
	String sub= string.substring(5,7);
	
	System.out.println(sub);
	
	String sub1=string.substring(5);
	System.out.println(sub1);
	
	String filename="someimage.jpg";
	
	int lastDot=filename.lastIndexOf(".");
	
	String ext= filename.substring(filename.lastIndexOf(".")+1);
	System.out.println(ext);
	
	String name="Eric Heilig";
	
	int spacePosition=name.indexOf("");
	
	String firstName=name.substring(0,spacePosition);
	System.out.println(firstName);
	
	String lastname=name.substring(name.indexOf(" ")+1);
	System.out.println(lastname);
	
	
	
	// find the position of the first space in the string
	String example = "This is an example";
	
			for(int i=0; i<example.length();i++) {
		if(example.charAt(i)==' ') {
			System.out.println(i);
			break;
		}
	}
			
			//second solution
			
			
	// find the position of the last space in the string
			for(int i=example.length()-1; i>=0; i--) {
				if(example.charAt(i)==' ') {
					System.out.println(i);
					break;
				}
			}
	// substring of the characters between the first and last space of the string
	System.out.println(example.substring(4, 10));
			
	// do the same thing to find the substring of the first and last vowel of the string**********

	//************Revisit
	// use the string.charAt function and use a for loop to loop over the entire string
	// and print out each character with a new line after it.
	// you need to use the string.length() function also
	
	for(int i=0; i<example.length();i++) {
		
			System.out.println(example.charAt(i)+"\n");
		
		}
	}
	
	
	// using only indexOf(" ") print the substring that contains the word "is"
	// use 2 substrings to do this.
	
	
//******* revisit
	// https://edabit.com/challenges
	// Change to Java / Very Easy or Easy / Strings and try to do some of them

}

