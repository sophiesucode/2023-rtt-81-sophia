package arrays;

public class ArrayExample2 {
	public static void main(String[] args) {
		
		
		int arraySize = 10;

		// this creates a new array of type double with 20 elements ... 0 to 19
		double[] doubleArray = new double[arraySize];

		String[] stringArray = new String[arraySize];
		stringArray[1] = "one";
		stringArray[2] = "two";
		stringArray[0] = "zero";
		stringArray[9] = "nine";
		
		// write a for loop that tells me how many values are not null
		int count = stringArray.length;
		for(int i=0; i< stringArray.length;i++) {
			
			if(stringArray[i]==null) {
				count--;
			}
			
		}
		System.out.println(count+" of the values aren't null");
		
		int notNull=0;
		for(String val:stringArray) {
			if(val!=null) {
				notNull++;
			}
		}
		System.out.println(notNull+" not null values");
		
		// write a for loop that tells me the last position of null in the array
		int indexOfLastNull=0;
		for(int i=0; i<stringArray.length;i++) {
			if(stringArray[i]==null) {
				indexOfLastNull=i;
			}
		}
		System.out.println("The last null position is "+ indexOfLastNull);
		
		// write a for loop that starts at the final position in the array and counts down to the first
				for(int i=stringArray.length-1; i>=0;i--) {
					System.out.println(stringArray[i]);
				}
	}
	
}
