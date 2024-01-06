package homework303_7_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
public static void main(String[] args) {
	/*Task 11: Write some Java code that asks the user how many favorite things they have. Based on their answer, you should create a String array of the correct size. Then ask the user to enter the things and store them in the array you created. Finally, print out the contents of the array.


	Example
	How many favorite things do you have?
	7

	Enter your thing: phone
	Enter your thing: tv
	Enter your thing: xbox
	Enter your thing: wine
	Enter your thing: beer
	Enter your thing: sofa
	Enter your thing: book
	Your favorite  things are:
	phone tv xbox wine beer sofa book
	*/
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("How many favorite things do you have? ");
	
	int numOfFaves=scan.nextInt();
	
	String [] faveThings= new String[numOfFaves];
	String faveThing="";
	
	for(int i=0; i<faveThings.length;i++) {
		
		System.out.println("Enter a fave thing of yours: ");
		
		faveThing=scan.next();
		
		faveThings[i]=faveThing;
		
		
	
	}
	scan.close();
	//System.out.println(Arrays.toString(faveThings));
	
	for(String fave:faveThings) {
		System.out.print(fave+" ");
	}
	
	
	

}
}
