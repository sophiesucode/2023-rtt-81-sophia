package com.perscholas.java_basics;

public class JavaBasicsClass {
	public static void main(String[] args) {
     	
		
		/*Write a program that declares two integer variables, assigns an integer to each, and adds them together.
		Assign the sum to a variable. Print out the result.*/
		 
		
		int a=20;
		int b=12;
		int sum= a+b;
		System.out.println(sum);
		
		
		
		//Write a program that declares two double variables, assigns a number to each, and adds them together.
		//Assign the sum to a variable. Print out the result.
		double salary=140000.00;
		double bonus= 40000.00;
		double totalComp= salary+bonus;
		System.out.println(totalComp);
		
		
	
		 
		/*Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
		Assign the sum to a variable. Print out the result. What variable type must the sum be?*/
		int num1=3;
		double num2=7;
		double sum2=num1+num2;
		System.out.println(sum2);
		 
		/*Write a program that declares two integer variables, assigns an integer to each, and divides the larger 
		number by the smaller number. Assign the result to a variable. Print out the result. Now change the larger 
		number to a decimal. What happens? What corrections are needed?*/
		
		 
		/*Write a program that declares two double variables, assigns a number to each, and divides the 
		larger by the smaller number. Assign the result to a variable. Print out the result. Now, cast the 
		result to an integer. Print out the result again.*/
		 double price=2.00;
		 double processingFee=0.25;
		 double result= price/processingFee;
		 System.out.println((int)result);
		 
		/*Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y. 
		Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.*/
//	 int x=5;
//	 int y=6;
//	 in
		//Write a program that declares a named constant and uses it in a calculation. Print the result.
		 final double PIE=3.14;
		 double res=PIE*2.0;
		 System.out.println(res);
		 
		 
		/*Write a program where you create three variables that represent products at a cafe. 
		The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices
		to each product. Create two more variables called subtotal and totalSale and complete an “order” for 
		three items of the first product, four items of the second product, and two items of the third product. 
		Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to 
		the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places.*/


	double coffee= 1.20;
	double matcha=3.40;
	double croissant=1.10;
	
	double subTotal=(coffee*3)+(matcha*4)+(croissant*2);
	
	final double SALES_TAX=0.07;
	double totalSale=subTotal+SALES_TAX;
	System.out.println(totalSale);

}
}
