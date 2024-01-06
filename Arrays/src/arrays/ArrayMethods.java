package arrays;

import java.util.Arrays;

public class ArrayMethods {
public static void main(String[] args) {
	int [] numbers= {0,1,2,3,4,5};
	System.out.println("original ="+Arrays.toString(numbers));
	int positionToDelete=2;
	
	for(int i=positionToDelete;i <numbers.length-1;i++) {
		numbers[i]=numbers[i+1];	
		}
	System.out.println("after move= "+Arrays.toString(numbers));
	
	//make anew array that is one smaller than the original 
	
	int [] target= new int[numbers.length-1];
	for(int pos=0; pos<target.length;pos++) {
		target[pos]=numbers[pos];
		
	}
	System.out.println("after copy= " +Arrays.toString(target));
}
}
