package quiz07;

public class MainClass {
	public static void main(String[] args) {
		
		ArrayPrint ap = new ArrayPrint();
		
		int[] arr = {1, 2, 34};
		String[] arr2 = {"a", "b", "c", "d"};
		
		System.out.println(ap.printArray(arr));

		System.out.println(ap.printArray(arr2));
		
		String str1 = "ab";
		String str2 = "cd";
		str1 = "test";
		System.out.println(str1 + str2);
	}
}
