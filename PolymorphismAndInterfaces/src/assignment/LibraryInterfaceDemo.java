package assignment;

public class LibraryInterfaceDemo {
	
	
	public static void main(String[] args) {
		
		KidUser kidaccount = new KidUser(10,"kids");
		
		KidUser kidaccount2= new KidUser(18,"fiction");
		
		kidaccount.registerAccount();
		
		kidaccount.requestBook();
		
		kidaccount2.registerAccount();
		kidaccount2.requestBook();
		
		System.out.println("________________________________________");
		
		AdultUser adultaccount= new AdultUser(23,"fiction");
		
		adultaccount.registerAccount();
		adultaccount.requestBook();
		
		
		AdultUser adultaccount2= new AdultUser(5, "kids");
		
		adultaccount2.registerAccount();
		adultaccount2.requestBook();
		
	}

}



