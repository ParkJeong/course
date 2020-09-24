package collection.list;

import java.util.List;
import java.util.ArrayList;

public class Generic {
	// List<?> - 타입 상관없이 무엇이든 들어갈 수 있다.
	// List<? extends String> 
	// -> String과 String의 자식클래스는 전달가능.
	// List<? super Integer>
	// -> Integer의 형태를 가지고 있다면, 전달가능.
	
	public static void add(List<?> list) {
		
	}
	
	public static void add2(List<? extends String> list) {
		
	}

	public static void add3(List<? super Integer> list) {
		
	}
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();

		add(list1);
		add(list2);
		add(list3);
		
		add2(list1);
		//add2(list2); // String이거나 String의 자식타입이 아니기 때문에 x
		//add2(list3); // String이거나 String의 자식타입이 아니기 때문에 x
		
		//add3(list1); // Integer이거나 Integer의 부모타입이 아니기 때문에 x
		add3(list2);
		add3(list3);
	}
}
