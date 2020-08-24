package chapter04;

public class BreakExample2 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) {
			sum += num;
			if(sum >= 100)
				break;
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
		sum = 0;
		for(num = 1; ; num++) {
			sum += num;
			if(sum > 500)
				break;
		}
		System.out.println(sum);
		System.out.println(num);
	}
}
