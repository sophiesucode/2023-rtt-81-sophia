package calculator;

import java.util.Scanner;

public class Calc{
	
	
	
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public double substract(int a, int b) {
		return a-b;
	}
	
	public double multiply(double a, double b) {
		return a*b;
	}
	
	public double divide(int a, int b) {
		return a/b;
	}
	
	public double modulo(int a, int b) {
		return a%b;
	}
	
//	String operation="";
public void menu(String operation, double a,double b){
	if(operation.equals("*")) {
		System.out.println(multiply(a,b));
	}
	
}
	
	
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a= scan.nextInt();
		
		System.out.println("Enter second number: ");
		int b=scan.nextInt();
		
		System.out.println("Choose operation");
		
		String operation = scan.next();
		
		Calculator calc= new Calculator();
		
//		System.out.println(calc.add(3, 5));
//		System.out.println(calc.substract(6, 4));
	
	}
	
	

}