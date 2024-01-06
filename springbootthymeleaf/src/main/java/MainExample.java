import com.suleman.springbootthymeleaf.Customer;

public class MainExample {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		
		c1.setPassword("paper");
		c1.setUsername("name");
		
		System.out.println(c1);
	}
}
