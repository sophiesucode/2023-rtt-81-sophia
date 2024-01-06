package loops;

public class Loops {
	
	
	public static int totalSum(int x, int y) {
		int sum=0;
		for(int  i=x; i<y;i++) {
			
			sum+=i;
			
		}
		return sum;
	}
	

	
	
	//write a for loop that calculates the sum of the remainders of each number divided 2 between 1 and 100;
	
	public static int sumOfRemainders(int x, int y) {
		int sum=0;
		
		for(int i=x; i<y;i++) {
		
		sum+=(i%2);
		
	}
		return sum;
	}
	
	//write a for loop that calculates the sum of the divisors of each number divided by 2 between 1 and 100
	
	public static int sumOfDivisors(int x, int y) {
		int sum=0;
		
		for(int i=x; i<y;i++) {
		
		sum+=(i/2);
		
	}
		return sum;
	}
	
	
	//write a while loop...while a number is greater than 0 subtract 1 from the number starting at 10
	
	
	public static void main(String[] args) {
		
		System.out.println(totalSum(1,100));
		
		System.out.println(sumOfRemainders(1,100));
		
		System.out.println(sumOfDivisors(1,100));
		
		
	}

}
