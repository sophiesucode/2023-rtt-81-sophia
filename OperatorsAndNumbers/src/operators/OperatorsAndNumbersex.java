package operators;

public class OperatorsAndNumbersex {
public static void main(String[] args) {
//1.)binary version
	//1.)
	//int x=2;
	int r=9;
	int y=17;
	int z=88;
	
	//System.out.println(Integer.toBinaryString(x));
	System.out.println(Integer.toBinaryString(r));
	System.out.println(Integer.toBinaryString(y));
	System.out.println(Integer.toBinaryString(z));
	System.out.println(" \n");

//2.Write a program that declares a variable x, and assigns 150 to it, and prints out the
//binary string version of the number. Now use the right shift operator
//(>>) to shift by 2 and assign the result to x. Write a comment indicating 
//what you anticipate the decimal and binary values to be. Now print the value of 
//x and the binary string.
//Perform the preceding exercise with the following values:
//225
//1555
//32456
	
	int x=150;
	int a=225;
	int b=1555;
	int c=32456;
	
		x = x >> 2; // it will shift the bits 2 positions to the right
	
	a>>=2;
	b>>=2;
	c>>=2;
	System.out.println("The original binary version of x is "+ Integer.toBinaryString(x));
	System.out.println("New value of x after using right shift operator to shift by 2: "+ x);
	System.out.println("Binary of "+x+ "is "+Integer.toBinaryString(x));
	
	 System.out.println("The original binary version of a is "+ Integer.toBinaryString(a));
	 System.out.println("New value of a after using right shift operator to shift by 2: " + a);
     System.out.println("Binary of " + a + " is: " + Integer.toBinaryString(a));
     
    
     System.out.println("The original binary version of b is "+ Integer.toBinaryString(b));
     System.out.println("New value of b after using right shift operator by 2: " + b);
     System.out.println("Binary of " + b + " is: " + Integer.toBinaryString(b));
	
     
     
     System.out.println("The original binary version of c is "+ Integer.toBinaryString(c));
     System.out.println("New value of c after shifting by 2: " + c);
     System.out.println("Binary of " + c + " is: " + Integer.toBinaryString(c));
 	System.out.println(" \n");
    



//3.)Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
//Write a comment that indicates what you predict will be the result of the bitwise and
//operation on x and y. Now use the bitwise AND (&) operator to derive the decimal and binary 
//values,and assign the result to z.
 	
 	int j=7;
 	int k=17;

 	 int l = x & y;
 	 
 	 System.out.println(l);
	

// 4.Now, with the preceding values, use the bitwise and operator to calculate the “or” value
// 	between x and y. As before, write a comment that indicates what you predict the values
// 	to be before printing them out.
 	 
 	 int orValue=j|k;
 	 System.out.println(orValue);
 	 
 	 
// 	5.Write a program that declares an integer variable, assigns a number, and 
// 	 uses a postfix increment operator to increase the value. Print the value before 
// 	 and after the increment operator.
 	 
 	 int numOfApples=5;
 	 System.out.println(numOfApples);
 	 
 	 numOfApples++;
 	 System.out.println(numOfApples);
 	 
 	 


//6.Write a program that demonstrates at least three ways to increment a
//variable by 1 and does this multiple times. Assign a value to an integer 
//variable, print it, increment by 1, print it again, increment by 1, and 
//then print it again.
 	 
 	 int numOfStudents= 10;
 	 numOfStudents++;
 	 numOfStudents+=1;
 	 numOfStudents=numOfStudents+1;
 	 
 	 
 	 
// 	7.)Write a program that declares two integer variables: x, and y, and then assigns 5 to x 
// 	and 8 to y. Create another variable sum and assign the value of ++x added to y, and
// 	print the result. Notice the value of the sum (should be 14). Now change the
// 	increment operator to postfix (x++) and re-run the program. 
// 	Notice what the value of the sum is. The first configuration incremented x, and
// 	then calculated the sum, while the second configuration calculated the sum, and
// 	then incremented x.

 	 int m=3;
 	int n=7;
 	
 	int sum= ++m + n;
 	System.out.println(sum);
 	
 	  m = 3;
      n = 7;
      int newSum=n+m++;
      System.out.println(newSum);


 	 
	
}	

}

