package exception.throw_;

public class ThrowEx01 {
	public static void main(String[] args) {
		try {
			System.out.println("결과: " + calc(10));
			System.out.println("결과: " + calc(-10));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	public static int calc(int n) throws Exception{
		if(n < 0) {
			throw new Exception("히히");
		}
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
}
