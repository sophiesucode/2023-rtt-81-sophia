package assignment;
//runtime or dynamic polymorphism
public class KidUser implements LibraryUser{
	
	int age;
	
	String bookType;
	
	public KidUser(int age, String bookType) {
		
		this.age=age;
		this.bookType=bookType;
				
	}

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(age>=11) {
			System.out.println("Sorry age must be less than 12 to register as a kid");
		}else {
			System.out.println("You have successfully registered under a Kids Account");
		}
		
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		
		if(bookType.equalsIgnoreCase("kids")) {
			System.out.println("Book issued successfully, please return the book within 10 days");
		}else {
			System.out.println("Oops, you are allowed to take only kids books.");
		}
		
		
		
	}
	
	//this is method overloading /happening at compile 
	public void example() {
		
	}
	
	public void example(int a) {
		
	}
	
	public void example(int a,double b) {
		
	}
	
	public void example(double b,int a) {
		
	}

	

}
//runtime/dynamic polymorphism: this happens at runtime , method overloading is static polymorphism or compile time polymorphism