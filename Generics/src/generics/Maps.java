package generics;

import java.util.HashMap;
import java.util.Map;

public class Maps {
public static void main(String[] args) {
	
	Map<String,Integer> stringMap= new HashMap<>();
	
	
	stringMap.put("one",1);
	stringMap.put("two", 2);
	
	Integer one= stringMap.get("one");
	
	Integer two= stringMap.get("two");
	
//	System.out.println(stringMap.get("one"));
	
	
	
	Map<Integer,String> numbers= new HashMap<>();
	
	numbers.put(1,"1st");
	numbers.put(2, "second");
	numbers.put(3, "third");
	numbers.put(4, "fourth");
	
	for(Integer num:numbers.keySet()) {
		//we have to use the key to look up the value.
System.out.println(num+" ="+numbers.get(num));
}




}
}

