package loops;
import java.lang.Math;
import java.util.Scanner;

public class GuessTheNumber {
public static void main(String [] args) {
//	Write a program that randomly generates an integer between 0 and 100, inclusive. The program should prompt the user to enter a number repeatedly until the number matches the randomly generated number.
//	For each user input, the program tells the user whether the input is too low or too high.
//	When the user discovers the correct answer, the program outputs a congratulatory message, and then provides the user with the opportunity to play again.

	Scanner scan= new Scanner(System.in);
	
	int randomNum = (int)(Math.random() * 101);
	
	System.out.println("Guess a number between 0 and 100. Enter a number: ");
	int userGuess=scan.nextInt();
	

	while(userGuess!=randomNum) {
		
		
	
	if(userGuess<randomNum) {
		System.out.println("Too low. Try again!");
		
		
	}if(userGuess>randomNum) {
		System.out.println("Too high.Try again");
	 
	}
	System.out.println("Please Enter a number: ");
	 userGuess=scan.nextInt();
	 	
	
}
	
	System.out.println("Congrats! You guessed the number. The number is: " + randomNum);
		
}
}

//psuedocode
//generate random num
//prompt user to enter number
//if num is lower than ran num tell user "too low", if higher, output: "too high"
//continue game( while userguess is false)"Ask user to try again.
//if num is equal to ran num, output congratulatory message
//ask user if they'd like to play again'
//if user says yes, restart game, if user says no, end game