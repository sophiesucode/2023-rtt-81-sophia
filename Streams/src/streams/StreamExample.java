package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		
		List<String> names= new ArrayList<>();
		
		names.add("Lisa");
		names.add("Mary");
		names.add("James");
		names.add("Conan");
		names.add("Ellen");
		
		//enhanced for loop
		
		for(String name: names) {
			System.out.println(name);
		}
		
		//using a list as a stream to do a for loop
		names.stream().forEach(name->{
				
				String name1=name.toUpperCase();
		System.out.println(name1);
		
	});
	
}
}