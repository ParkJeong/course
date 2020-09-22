package practice;

public class Q1 {
	public static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		
		return max;
	}
	
	public static int min3(int a, int b, int c) {
		int min = a;
		if(a < min) {
			min = a;
		}
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		
		return min;
	}
	
	public static int min4(int a, int b, int c, int d) {
		int min = a;
		if(a < min) {
			min = a;
		}
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		if(d < min) {
			min = d;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println(max4(1, 2, 3, 4));
		System.out.println(max4(4, 3, 2, 1));
		System.out.println(max4(3, 4, 2, 1));
		System.out.println(max4(2, 3, 4, 1));
		System.out.println(max4(4, 4, 1, 2));
		System.out.println(max4(2, 3, 1, 1));

		System.out.println(min3(1, 2, 3));
		System.out.println(min3(3, 2, 3));
		System.out.println(min3(1, 2, 0));
		System.out.println(min3(1, 2, 1));
		
		System.out.println(min4(1, 2, 3, 4));
		System.out.println(min4(3, 2, 3, 1));
		System.out.println(min4(1, 2, 0, 2));
		System.out.println(min4(1, 2, 1, 2));
		
	}
}
