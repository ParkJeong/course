package day04;

public class ForEx01 {
	public static void main(String[] args) {
		//1~100합
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
