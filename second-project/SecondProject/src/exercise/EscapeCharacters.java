package exercise;

public class EscapeCharacters {
	
	
	public static void main(String[] args) {
		
		
		// \t -> gives a tab between two words.
		System.out.println();
		
		// This \n escape sequence is for a new line.
	    System.out.println();
	    
		// the main ones to know are ... \t, \n, and \"
		
		
		// for the language java \ (slash) is the escape character
		
		
		
		// basic formating with tabs
		System.out.println("1\tOne\t\tCol3");
	
		System.out.println("10\tTen\t\tCol3");
		//this one is long so it only needs 1 tab for the 3rd column
		System.out.println("100\tOne Hundred\tCol3"); 
		System.out.print("-------------------------\n");
		
		// this is an example of a new line character \n
		System.out.println("This is line 1\nThis is line 2");
		System.out.println("This is line 3");
		System.out.println("This is line 4");
		
		System.out.print("-------------------------\n");
		
		// what happens if I want to print just a \
		System.out.println("To get a slash to print we need 2 of them \\");
		
		// what happens if I want a " in my string
		System.out.println("This is a quote \" in a string ");

	}

	
		
}


