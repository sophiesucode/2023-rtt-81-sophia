package arrays;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
	  System.out.println("Enter the first number: ");
		
		int firstNum =scan.nextInt();
		
		System.out.println("Enter the second number: ");

		int secondNum= scan.nextInt();
		
		int top=Math.min(firstNum, secondNum);
	
		int maxPositive=0;
		int maxCommonDen=0;
		if(firstNum>=secondNum) {
			maxPositive=firstNum;
		}else if(secondNum>firstNum) {
			maxPositive=secondNum;
		}
	
		System.out.println(maxPositive +" Greater ");
		
		for(int i=1;i<=maxPositive;i++) {
			if(firstNum%i==0&& secondNum%i==0&&i>maxCommonDen) {
				maxCommonDen=i;
			}
		}
		System.out.println(maxCommonDen);
		
//		
//		for(int k=1; k<=min;k++) {
			
		}
	
	}
	
	
	
	
	
	

