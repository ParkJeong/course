package exception.trycatch;

public class TryCatchEx01 {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		System.out.println(i + j);
		
		
		// catch 뒤에는 해당 예외를 처리할 예외의 종류가 들어간다. Exception은 모든 예외를 처리할 수 있다.
		try {
			System.out.println(i / j);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외 발생");
		}
		
		System.out.println(i - j);
	}
}
