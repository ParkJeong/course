package collection.set;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		// set과 동일하고, 자동으로 오름차순 정렬
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(100);
		set.add(50);
		set.add(1);
		set.add(70);
		set.add(80);
		
		System.out.println(set.toString());
		
		TreeSet<String> set2 = new TreeSet<>();
		
		set2.add("송아지");
		set2.add("얼룩송아지");
		set2.add("강아지");
		set2.add("강아지");
		set2.add("망아지");
		
		System.out.println(set2.toString());
	}
}
