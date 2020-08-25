package quiz;


import java.util.Arrays;

public class Quiz20 {
	public static void main(String[] args) {
		// 금액을 큰 금액부터 거슬러 각각 몇개가 나와야 하는지 처리
		
		int[] coin = {1000, 500, 100, 50, 10};
		int money = 17780;
		
		
		int[] change = new int[coin.length];
		
		int i = 0;
		while(i < change.length) {
			change[i] = money/coin[i];
			money %= coin[i];
			i++;
		}
		
		i = 0;
		while(i < change.length) {
			System.out.println(coin[i] + ":" + change[i] + "개");
			i++;
		}
		
		System.out.println("거스름돈" + Arrays.toString(change));
	}
}
