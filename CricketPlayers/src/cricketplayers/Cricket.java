package cricketplayers;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cricket {

	int[] playerIDs;
	
	
	
	void cricket() {
		playerIDs= new int[11];
		for(int i=1; i<playerIDs.length;i++) {
			playerIDs[i]=1;
		}
		System.out.println("A new cricket team has been formed");
	}
	
	void calculateAvgAge(int[] age) {
		int sum=0;
		int lavgAge= sum/age.length;
		
		for(int i=0;i<age.length;i++) {
			sum+=age[i];
		}
		
		DecimalFormat df= new DecimalFormat("#,##0.00");
		
		System.out.println("The average age of the team is "+ df.format(lavgAge));
	}
	
	ArrayList<Integer> retiredPlayers= new ArrayList<>();
	
	//next, assign -1 to the player at this index/id
	//if the player is not found or has -1 say player already retired
	void retirePlaver(int id) {
		System.out.println("Plaver with id: <id! has retired");
	}
	
	
}
//1. Class Cricket should have the variable int/1 plaverlDs. The 1-based index of a plaver is the player's ID.
//It should have the following methods:
//Cricket(): Initialize the empty array player|Ds to store 11 integer values. Assign the value 1 to each element in player|Ds.
//Print "A new cricket team has been formed".
//• void calculateAvgAge(intIl age): age contains the age of every player. 
//Print the average age of the team with two digits after the decimal in the form "The average age of the team is lavgAge!".
//• void retirePlaver(int id): Assian -1 to blaverlds idl.
//Print "Plaver with id: <id! has retired". If the plaver has already retired, print "Plaver has already retired".