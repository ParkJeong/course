package day04;

public class WhileEx03 {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		
		while(i <= 100) {
			
			if(i % 2 == 0) {
				count++;
			}
			
			i++;
		}
		System.out.println(count);
	}
}
