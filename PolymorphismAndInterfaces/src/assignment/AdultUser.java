package assignment;

public class AdultUser implements LibraryUser {
	
	int age;
	
	String bookType;

	public AdultUser(int age, String bookType) {

		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		
		if(age>=12) {
			System.out.println("You have successfully registered under an Adult Account");
		}else {
			System.out.println("Sorry, age must be greater than 12 to register as an adult.");
		}
		
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType.equalsIgnoreCase("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days.");
		}else {
			System.out.println("Oops, you are allowed to take only adult Fiction books.");
		}
		
	}
	
	
	
	

}
/*
 .	registerAccount : If age >= 12, a message displaying “You have successfully registered under an Adult Account.” should be displayed in the console. 
If age <= 11, a message displaying, “Sorry, age must be greater than 12 to register as an adult.” should be displayed in the console. 
	1.	requestBook : If bookType is “Fiction,” a message displaying “Book Issued successfully, please return the book within 7 days.” should be displayed in the console. 
Else, a message displaying, “Oops, you are allowed to take only adult Fiction books.” should be displayed in the console. 
 */
