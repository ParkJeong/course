package practice;

public class Q3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int size = 0;
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				arr[size] = i;
				size++;
			}
		}
		
		for(int i : arr) {
			sum += i;
			System.out.println(i);
		}
		System.out.println(sum);
	}
}
