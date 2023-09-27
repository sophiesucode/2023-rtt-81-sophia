package homework303_7_1;
import java.util.Arrays;

public class ArrayTasks {
public static void main(String[] args) {
	
	/*Task 1: Write a program that creates an array of integers with a length of 3.
	Assign the values 1, 2, and 3 to the indexes. Print out each array element.*/
	
	
	
	int [] intArray= new int[3];
	intArray[0]=1;
	intArray[1]=2;
	intArray[2]=3;
	for(int val:intArray) {
		System.out.println(val);
	}
	
	
	
	/*Task 2: Write a program that returns the middle element in an array. Give the following
	values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
	*/
	
	int[]nums= {13,5,7,68,2};
	
	System.out.println(nums[nums.length/2]);
	
	
	
	
	/*Task 3: Write a program that creates an array of String type and initializes it with the 
	strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy using the clone( ) method. 
	Use the Arrays.toString( ) method on the new array to verify that the original array was copied.*/
	
	
	
	String [] colors= {"red","green","blue","yellow"};
	
	System.out.println("The length of the color array is "+ colors.length);
	
	String[] copyOfArray= Arrays.copyOf(colors, colors.length);
	
	System.out.println(Arrays.toString(copyOfArray));
	
	
	
	/*Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers. 
	Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at 
	index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced. Now try to assign a 
	value to the array index 5. You should get the same type of exception.*/
	
	int[] numbers = {2,4,8,1,5};
	System.out.println(numbers[0]);
	System.out.println(numbers[numbers.length-1]);
	//System.out.println(numbers[5]); exception
	//System.out.println(numbers[numbers.length]); exception
	
	
	
	
//	Task 5: Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the
//	loop control variable (e.g., i) to the corresponding index in the array.
    
	
	int[] arrayOfInts=new int[5];
	
	for(int i=0; i<arrayOfInts.length;i++) {
		arrayOfInts[i]=i;
	}
	System.out.println(Arrays.toString(arrayOfInts));
	
	
	
	
	
	
//	Task 6: Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of the loop 
//	control variable multiplied by 2 to the corresponding index in the array.
	 
	int []ints= new int[5];
	
	for(int i=1;i<ints.length;i++){
	ints[i]=i*2;
	}
	
	System.out.println(Arrays.toString(ints));
	
	
	
	
	
//	Task 7: Write a program where you create an array of 5 elements. Loop through the array and print the value of each element,
//	except for the middle (index 2) element.
	 
	String[] fruits= {"apples","blueberries","mangos","bananas","cherries"};
	
	for(int i=0; i<fruits.length;i++) {
		if(fruits[i]==fruits[fruits.length/2]) {
			continue;
		}
		System.out.println(fruits[i]);
	}
	
	
//	Task 8: Write a program that creates a String array of 5 elements and swaps the first element with the middle element without
//	creating a new array.

	String[] sports= {"baseball","basketball","golf","tennis","polo"};
	
	for(int i=0; i<sports.length;i++) {
		String placeholder=sports[0];
	sports[0]=sports[sports.length/2];
	sports[sports.length/2]=placeholder;
	
		
	}
	System.out.println(Arrays.toString(sports));
	
	
	
//	Task 9: 
//		Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, 
	//and print the smallest and the largest element of the array. The output will look like the following:
//		Array in ascending order: 0, 1, 2, 4, 9, 13
//		The smallest number is 0
//		The biggest number is 13 
	
	int [] array= {4,2,9,13,1,0};
	
	Arrays.sort(array);
	
	System.out.println(Arrays.toString(array));
	
	System.out.println("The smallest number is "+array[0] );
	System.out.println("The largest number is "+array[array.length-1]);
	
	
	
	
	
//   Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.
	 

}
}
