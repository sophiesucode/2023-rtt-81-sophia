package practice;

public class Practice {
	
	
public static void main(String[] args) {
	
	
	int largeNumber=456;
	int sum=0;
	while(largeNumber>0) {
		
		
		
		int num=largeNumber%10;
		
		System.out.println(largeNumber);
		largeNumber/=10;
		sum+=num;
	}
	
 System.out.println(sum);
}
}
