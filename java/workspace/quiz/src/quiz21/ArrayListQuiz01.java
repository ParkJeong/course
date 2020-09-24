package quiz21;

import java.util.List;
import java.util.ArrayList;

public class ArrayListQuiz01 {
	
	public String name;
	public int size;
	public Type type;
	
	public enum Type{
		RUNNING
	}
	
	public static void main(String[] args) {
		// list에 1~20까지 정수를 저장
		// 저장한 값을 반복문으로 출력
		
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 1; i <= 20; i++) {
			arr.add(i);
		}
		for(int i = 0; i < 20; i++) {
			System.out.println(arr.get(i));
		}
		
	     
	        ArrayListQuiz01 shoes = new ArrayListQuiz01();
	         
	        shoes.name = "나이키";
	        shoes.size = 230;
	        shoes.type = Type.RUNNING;
	         
	        System.out.println("신발 이름 = " + shoes.name);
	        System.out.println("신발 사이즈 = " + shoes.size);
	        System.out.println("신발 종류 = " + shoes.type);
	        System.out.println(Type.RUNNING.ordinal());
	}
}
