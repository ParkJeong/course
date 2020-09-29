package ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;


public class MainClass02 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
		
		for(int i = 0 ; i < 100; i++) {
			list.add(r.nextInt(100) + 1);	
		}
		
		System.out.println("처음:" + list.toString());
		
		System.out.println("---------------------------");
		
		//중복 제거 distinct()
		list.stream().distinct().forEach((s) -> System.out.print(s + " "));
		System.out.println("----------------------");
		
		list.stream().distinct().sorted().forEach((s) -> System.out.print(s + " "));
		System.out.println("--------------------------------------");
		
		list.stream().distinct().sorted().filter((t) -> t % 2 == 0).forEach((s) ->System.out.print(s + " "));
		System.out.println("--------------------------------------");
		
		
		// map() - 람다안에 정의된 새로운 stream타입으로 반환
		list.stream().distinct().sorted().map(new Function<Integer, String>() {
			@Override
			public String apply(Integer t) {
				return t % 2 == 0 ? "짝수" : "홀수";
			}
		}).forEach((s) -> System.out.print(s + " "));
		
		System.out.println("--------------------------------------");
		List<Integer> result = list.stream().sorted().filter((t) ->  t % 3 == 0)
				.collect(Collectors.toList());
		System.out.println(result.toString());
		
		System.out.println("------------------------------");
		
		System.out.println(list.stream().distinct().max((a, b) -> a - b));
		
	}
}
