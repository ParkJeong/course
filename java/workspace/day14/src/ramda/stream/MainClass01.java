package ramda.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

interface Test {
	public default void test() {
		
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("박찬호");
		list.add("김유신");
		list.add("홍길자");
		
		Iterator<String> ir = list.iterator();
		
		while(ir.hasNext()) {
			String element = ir.next();
		}
		
		Stream<String> stream = list.stream();
		
//		stream.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
		stream.forEach((t) -> System.out.println(t));
	}
}
