package quiz20;

public class MathQuiz01 {
	public static void main(String[] args) {
		/*
		 * 올림 메서드를 이용해서 1-10이 전달되면 1이 반환되는 page()를 생성
		 * 11-20이 전달되면 2가 반환된다.
		 * 
		 */
		
		System.out.println(page(10));
		System.out.println(page(2));
		System.out.println(page(5));
		

		System.out.println(page(11));
		System.out.println(page(12));
		System.out.println(page(15));
	}
	
	public static int page(int num) {
	
		return (int)Math.ceil(num/10.0);
	}
}
