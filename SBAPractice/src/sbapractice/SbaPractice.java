package sbapractice;

import java.util.ArrayList;

public class SbaPractice {

	
	//
	public static class InvalidStringException extends Exception{
		
//		1. The InvalidStringException class should inherit the inbuilt Exception class. It
//		should also implement the following methods:
//		• InvalidStringException( ): calls the constructor of the parent class.
		
		public InvalidStringException(String message) {
			super(message);
			
		}
		
	}
	
//	The ArrayToList class should implement the interface MyList. It should have one class variable of type ArrayList<String»,
//	arrayToList. It should also implement the following methods:
	
	public static class ArrayToList implements MyList{
		
		static ArrayList<String> arrayToList= new ArrayList<>();
		

		

//		adds the strings in the array a, to the list array ToList. Also prints
//		"I have added the string: (string) at the index: (index}". For example if the string "abed" is added at the index 0, 
//		it should print "I have added the string: abed at index: 0".
		
public static void convert(String[] a) {
			
			for(int i=0; i<a.length;i++) {
				
				String addedString= a[i];
			   arrayToList.add(a[i]);
			   
			   System.out.println("I have added the string: "+ addedString+" at index "+ i);
			}
			
		}
		

//void replace(int idx): replaces the string at the index idx of arrayToList, with an empty string.
//Also prints "I have replaced the string: (string} with a null string". For example if the string
//"abed" is replaced with the empty string, it should print "I have replaced the string: abed with a null string".

public static void replace(int idx) {
	
		String original= arrayToList.get(idx);
		
		arrayToList.set(idx,"");
		
		System.out.println("I have replaced the string: "+original+" with a null string");	
	
}


	}
	
//	ArrayList<String> compact/): It should remove all the empty string from
//	the list and return the resulting list.
	
	
	
	public static ArrayList<String>compact(ArrayList<String> arrayToList) {
		
		for(String element:arrayToList) {
			if(element.equals("")) {
				arrayToList.remove(arrayToList.indexOf(element));
			}
		}
//		arrayToList.removeIf(String::isEmpty); //another way to target null string values
		return arrayToList;
	}
	 
	
	public static void main(String[] args) {
		//toArrayList();
		String[]a= {"fuji","gala","granny"};
		
		SbaPractice.ArrayToList arrayList= new SbaPractice.ArrayToList();
		
arrayList.convert(a);//add values from array to ArrayList(convert array to ArrayList)
		
		

		arrayList.replace(1);//replace this index with null value
	
		
		
		
		
		
		for(int i=0; i<arrayList.arrayToList.size();i++) {
			if(!arrayList.arrayToList.get(i).matches("[a-z]+")) {
				try {
					throw new InvalidStringException("This is not a valid string");
				}
				
			
			catch(InvalidStringException e){
				System.out.println(e.getMessage());
			}
		}
		}
		
		
		System.out.println(ArrayToList.arrayToList);//check list after value at index replaced with string
//		System.out.println(ArrayToList.arrayToList instanceof ArrayList);//checking to make sure array "a"  was converted to ArrayList
		System.out.println(compact(arrayList.arrayToList));//remove index with empty strings
	}


	
}

