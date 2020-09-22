package exception.myexception;

public class MainClass {
	public static void main(String[] args) {
		Account account = new Account();
		account.setBalance(10000L);

		try {
			account.withDraw(20000l);
			
		} catch(MyException e) {
			System.out.println(e.getMessage());
		}
		
		int[] arr = {1, 2};
		

//		System.out.println("num1: " + arr[0]);
//		System.out.println("num2: " + arr[1]);
//		swap(arr);
//		System.out.println("num1: " + arr[0]);
//		System.out.println("num2: " + arr[1]);
//		

		System.out.println("num1: " + arr[0]);
		System.out.println("num2: " + arr[1]);
		swap2(arr);
		System.out.println("num1: " + arr[0]);
		System.out.println("num2: " + arr[1]);
	}
	
	
	public static void swap (int[] arr) {
		arr[0] = arr[0] + arr[1];
		arr[1] = arr[0] - arr[1];
		arr[0] = arr[0] - arr[1];
	}
	
	public static void swap2 (int[] arr) {
		arr[0] = arr[0] ^ arr[1];
		arr[1] = arr[0] ^ arr[1];
		arr[0] = arr[0] ^ arr[1];
	}
}
