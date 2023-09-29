package calculator;

import java.util.Scanner;

public class Calculator {
	
	
	
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public double substract(int a, int b) {
		return a-b;
	}
	
	public double multiply(int a, int b) {
		return a*b;
	}
	
	public double divide(int a, int b) {
		return a/b;
	}
	
	public double modulo(int a, int b) {
		return a%b;
	}
	
	  public double menu(String operation, double a, double b) {
	        switch (operation) {
	            case "+":
	                return add(a, b);
	            case "-":
	                return substract((int) a, (int) b);
	            case "*":
	                return multiply((int) a, (int) b);
	            case "/":
	                return divide((int) a, (int) b);
	            case "%":
	                return modulo((int) a, (int) b);
	            default:
	                System.out.println("please enter correct operation");
	               return 0;
	        }
	    }
	
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
	      System.out.println("Enter first number: ");
	        double a = scan.nextDouble();

	        System.out.println("Enter second number: ");
	        double b = scan.nextDouble();

	        System.out.println("Choose operation (+, -, *, /, %): ");
	        String operation = scan.next();

	        Calculator calc = new Calculator();
	        double result = calc.menu(operation, a, b);

	        System.out.println("Result: " + result);
			
		}
		
	{
	
	

}
}
