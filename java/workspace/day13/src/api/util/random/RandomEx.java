package api.util.random;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int x1 = ran.nextInt();
		System.out.println(x1);
		
		int x2 = ran.nextInt(10);
		System.out.println(x2);
		
		double d1 = ran.nextDouble();
		double d2 = Math.random();
	}
}
