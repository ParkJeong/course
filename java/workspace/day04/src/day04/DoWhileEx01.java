package day04;

public class DoWhileEx01 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum += i;
			i++;
		}
		
		
		System.out.println("1~10까지 합:" + sum);
		
		i = 1;
		sum = 0;
		
		do {
			sum += i;
			i++;
		} while(i <= 10);

		System.out.println("1~10까지 합:" + sum);
		
	}
}
