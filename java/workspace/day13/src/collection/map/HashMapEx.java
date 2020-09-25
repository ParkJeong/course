package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길동");
		
		System.out.println("맵의 크기는:" + map.size());
		System.out.println(map.toString());
		
		map.put(4, "신사임당");
		System.out.println(map.toString());
		
		String value = map.get(3);
		System.out.println("3번 키에 저장된 값: " + value);
		
		if(map.containsKey(1)) {
			System.out.println("1번 키 존재");
		}
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> ir = keySet.iterator();
		System.out.println(keySet.toString());
		
		while(ir.hasNext()) {
			int key = ir.next();
		}
		
		Set<Entry<Integer, String>> entry = map.entrySet();
		for(Entry<Integer, String> e : entry) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		map.remove(3);
		System.out.println(map.toString());
	}
}
