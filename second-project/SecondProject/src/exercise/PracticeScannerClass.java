package exercise;
import java.util.Scanner;

public class PracticeScannerClass {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Sophie's Digital Cafe! Before I get your order started, May I have your name? ");
		System.out.println("Enter name:");
		String name= scan.next();
		
		
		System.out.println("Thanks "+name + "! What will you be having today?");
		System.out.println("Enter order:");
		String customerOrder= scan.next();
		
		
		
		System.out.println("Great! "+ name + "one  "+ customerOrder+ " coming right up!");
	}

}
