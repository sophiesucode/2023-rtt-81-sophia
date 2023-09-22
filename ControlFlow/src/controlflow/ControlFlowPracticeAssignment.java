package controlflow;

import java.util.Scanner;

public class ControlFlowPracticeAssignment {
	public static void main (String[]args) {
		
		
		/*1. Write a program that declares 1 integer variable x, and then assigns 7 to it. 
		Write an if statement to print out “Less than 10” if x is less than 10. Change x
		to equal 15, and notice the result (console should not display anything).*/
		
		int x=7;
		if(x <10) {
			System.out.println("Less than 10");
		}
		
		
		/*2. Write a program that declares 1 integer variable x, and then assigns 7 to it.
		Write an if-else statement that prints out “Less than 10” if x is less than 10, 
		and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.*/
		int a=7;
		if(a<10) {
			System.out.println("Less than 10");
		}else if(a>10) {
			System.out.println("Greater than 10");
		}
		
		/*3. Write a program that declares 1 integer variable x, and then assigns 15 to it. 
		Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
		“Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or 
		equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.*/
		
		int y=15;
		if(y<10) {
			System.out.println("Less than  10");
		}else if(y >10&&y<20) {
			System.out.println("Between 10 and 20");
		}else if(y>=20) {
			System.out.println( "Greater than or equal to 20");
		}
		
		/*4. Write a program that declares 1 integer variable x, and then assigns 15 to it. Write
		an if-else statement that prints “Out of range” if the number is less than 10 or greater 
		than 20 and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20). 
		Change x to 5 and notice the result.*/
		int b=15;
		if(b<10 ||b>20) {
			System.out.println("Out of range");
		}else if(b>=10&&b<=20) {
			System.out.println("In range");
		}
		
		/*5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F, 
		according to the following criteria:
			A: 90-100
			B: 80-89
			C: 70-79
			D: 60-69
			F: <60
			Use the Scanner class to accept a number score from the user to determine the 
			letter grade. Print out “Score out of range” if the score is less than 0 or greater than 100.*/

			Scanner scan = new Scanner(System.in);
 
			System.out.println("Please enter score: ");

			int score= scan.nextInt();
			
			if(score >=90 && score <=100) {
			System.out.println("grade:A");
			
			}else if(score >=80 && score <90) {
				System.out.println("grade:B");
			}else if(score >=70 && score <80) {
				System.out.println("grade:C");
			}else if(score >=60 && score <70) {
				System.out.println("grade:D");
			}else if(score<60&& score >0) {
				System.out.println("grade:F");
			}else {
				System.out.println("Score out of range");
			}



		
		/*6. Write a program that accepts an integer between 1 and 7 from the user. Use a 
		switch statement to print out the corresponding weekday. Print “Out of range” if 
		the number is less than 1 or greater than 7. Do not forget to include “break” 
		statements in each of your cases.*/
			
			
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Please enter a number between 1 and 7: ");
			 
			int num= sc.nextInt();
			
			switch(num){
			
			case 1: System.out.println("Sunday");
			break;
			
			case 2: System.out.println("Monday");
			break;
			
			case 3: System.out.println("Tuesday");
			break;
			
			case 4: System.out.println("Wednesday");
			break;
			
			case 5:System.out.println("Thursday");
			break;
			case 6:System.out.println("Friday");
			break;
			case 7:System.out.println("Saturday");
			break;
			default: System.out.println("Out of range");
				
			}
		
		
		/*7. Create a program that lets the users input their filing status and income. Display 
		how much tax the user would have to pay according to status and income.
		The U.S. federal personal income tax is calculated based on the filing status and 
		taxable income. 
		There are four filing statuses: Single, Married Filing Jointly, Married Filing 
		Separately, and Head of Household. */

System.out.println("   \n");

Scanner input= new Scanner(System.in);
System.out.println("Please enter the letter for your filing status:\nA.)Single \nB.)Married Filing Jointly\nC.)Married Filing Seperately\nD.)Head of Household ");
//input.nextLine();
char status= input.next().charAt(0);

double taxRate=0.00;


System.out.println("Please enter your income: ");
double income= input.nextDouble();

double incomeTax=income*taxRate;

if((status=='A'||status=='C'&&income<=8350)||status=='B'&&income<=16700.00||status=='D'&&income<11950) {
	
	taxRate=.10;
	System.out.println("your tax rate is "+ taxRate);
}else if((status=='A'||status=='C'&&income<=33950.00)||(status=='B'&&income>=16701.00&&income<=67900.00)||status=='D'&&income>=11951&&income<=45500.00) {
	taxRate=.15;
}else if(status=='A'&&income>33950.00&&income<=82250.00||status=='B'&&income>16701.00&&income<=137050.00||status=='C'&&income<33950.00&&income<=68525.00||status=='D'&&income>45500.00&&income<=117450.00) {
	taxRate=.25;
}else if(status=='A'&&income>=82251.00&&income<=171550.00||status=='B'&&income>137050.00&&income<=208850.00||status=='C'&&income>6825.00&&income<=104425.00||status=='D'&&income>=117451.00&&income<=190200.00) {
	taxRate=.28;
}else if(status=='A'&&income>171550.00&&income<=372950.00||status=='B'&&income>208850.00&&income<=372950.00||status=='C'&&income>104425.00&&income<=186475.00||status=='D'&&income>190201.00&&income<=372950.00) {
	taxRate=.33;
}else if(status=='A'&&income>=372951.00||status=='B'&&income>=372951.00||status=='C'&&income>=186476.00||status=='D'&&income>=372951.00) {
	taxRate=.35;
}
//next thing to do is actually calculate accurate income tax for user and output result for user.

	}

}
