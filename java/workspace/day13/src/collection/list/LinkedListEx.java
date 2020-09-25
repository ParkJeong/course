package collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListEx {
	public static void main(String[] args) {
		// 링크드 리스트는 큐와 리스트를 동시에 구현하고 있기 때문에
		// Queue에 저장하면 큐처럼 동작, 
		// 
		Queue<String> list = new LinkedList<>();
		
		list.add("홍길동");
		list.add("홍길자");
		
		System.out.println(list.size());
		
		System.out.println(list.peek()); // 값을 꺼냄
		System.out.println(list.poll()); // 값을 꺼내고 지움
		System.out.println(list.poll());
		
		// 리스트와 동일하게 동작
		// List<String> list2 = new LinkedList<>();
		
		LinkedList<String> list2 = new LinkedList<>();
		
		list2.add("홍길동");
		list2.add("홍길자");
		list2.add("김길동");
		list2.addFirst("이순신"); // 처음에 추가
		list2.addLast("김유신"); // 마지막에 추가

		list2.add("김길동2");
		list2.add("김길동3");
		list2.add("김길동4");
		
		System.out.println(list2.toString());

		System.out.println("2번째 인덱스에 있는 값:" + list2.get(1));
	}
}
