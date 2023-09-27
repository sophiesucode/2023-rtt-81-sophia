package loops;

import java.util.Scanner;

public class LoopsExample {
	
	public static void main(String[] args) {
		
		for(int i= 1;  i <= 10; i++) {
			System.out.println("Welcome to Java World!: "+i);
		}
	


	    int n = 5;
	    // for loop  
	    for (int i = 1; i <= n; ++i) {
	      System.out.println("Java is fun");
	  
	}
	    int sum = 0;
	    int n1 = 1000;
	    // for loop
	    for (int i = 1; i <= n1; ++i) {
	      // body inside for loop
	      sum += i;     // sum = sum + i
	    }
	    System.out.println("Sum = " + sum);
	    
	   
	    	       String original, reverse = ""; // Objects of String class
	    	       Scanner in = new Scanner(System.in);
	    	System.out.println("Enter a string/number to check if it is a palindrome");
	    	       original = in.nextLine();
	    	       int length = original.length();
	    	       for ( int i = length - 1; i >= 0; i-- )
	    	           reverse = reverse + original.charAt(i);
	    	       if (original.equals(reverse)) {
	    	         System.out.println("Entered string/number is a palindrome.");
	    	       }else{
	    	         System.out.println("Entered string/number isn't a palindrome.");
	    	       
	    	       
	    	       

	    	   }
	    	       
	    	       for(int i=1;i<=5;i++){
	    	    	   for(int j=1;j<=i;j++){
	    	    	       System.out.print("* ");
	    	    	   }
	    	    	   System.out.println();//new line
	    	       
	    	       }
	}
	}




