package homework303_5_1;
import java.util.Scanner;

public class tasks {

 public static void main(String[] args) {
	 //multiplication table
	 
	  int multiTable = 12; // 
      
      // Outer loop for the rows
      for (int i = 1; i <= multiTable; i++) {
          // Inner loop for the columns
          for (int j = 1; j <= multiTable; j++) {
        	  System.out.printf("%3d", i * j);
          }
          System.out.println(); 
      }
	 
	 
	 
	 
	 
			Scanner scan = new Scanner(System.in);
			
//			Write a program that prompts the user to enter two positive integers, 
//			and find their greatest common divisor (GCD).

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
		
			
			
			for(int i=1;i<=maxPositive;i++) {
				if(firstNum%i==0&& secondNum%i==0&&i>maxCommonDen) {
					maxCommonDen=i;
				}
			}
			System.out.println(maxCommonDen);
			
//			Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year. 
//			In how many years will the tuition be doubled?

			
			        double startingTuition = 10000.0; 
			        double yearlyIncrease = 0.07;   
			        double doubledTuition = 20000.0; 

			        int years = 0;

			        while (startingTuition < doubledTuition) {
			            startingTuition += startingTuition * yearlyIncrease;
			            years++; // Increment the number of years
			        }

			        System.out.println("The tuition will be double in  " + years+ " years.");
			    }
			

				
			}
		
		

