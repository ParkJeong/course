package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;

public class ArrayListEx {
	public static void main(String[] args) {
		
		Collection<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		ArrayList<String> list3 = new ArrayList<>();
		
		
		list2.add("JAVA");
		list2.add("DataBase");
		list2.add("JSP");
		list2.add("SPRING");
		list2.add("JAVA");
		
		// list의 크기 size()
		System.out.println(list2.size());
		
		// list의 저장된 객체를 문자열로 확인 toString()
		System.out.println(list2.toString());
		
		// list의 중간에 추가 add(index, 값)
		list2.add(2, "ORACLE");
		System.out.println(list2.toString());

		// list의 값의 얻기 get(index)
		String value = list2.get(2);
		System.out.println("2번째 인덱스 값: " + value);
		
		// list의 특정 값 포함 여부 contains(값)
		if(list2.contains("JSP")) {
			System.out.println("JSP가 포함되어 있음");
		}
		
		// list 삭제 reomve(값), remove(index);
		list2.remove(0);
		System.out.println(list2.toString());
		
		list2.remove("JSP");
		System.out.println(list2.toString());
		
		
		// addAll(리스트)
		
		String[] arr = {"React", "AWS"};
		List<String> list4 = Arrays.asList(arr);
		
		list2.addAll(list4);
		System.out.println(list2.toString());
	}
}
