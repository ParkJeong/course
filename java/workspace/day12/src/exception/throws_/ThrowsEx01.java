package exception.throws_;

public class ThrowsEx01 {
	public static void main(String[] args) {
		try {
			greet(3);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("2이하의 정수");
		} 
	}
	
	private static String[] greetings = {"헬로", "안녕", "니하오"};
	
	public static void greet(int index) throws Exception{
		System.out.println(greetings[index]);
	}
}
