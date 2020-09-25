package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		set.add("JAVA");
		set.add("JSP");
		set.add("SPRING");
		set.add("ORACLE");
		set.add("JAVA");
		
		// set에 저장된 크기 size()
		System.out.println("set의 크기:" + set.size());
		System.out.println(set.toString());
		
		// set에 저장된 객체를 확인하려면, 반복자를 통해 한번씩 확인한다.
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		// set의 검색
		if(set.contains("JSP")) {
			System.out.println("JSP가 포함되어 있음");
		}
		
		// set의 삭제
		set.remove("JAVA");
	}
}
