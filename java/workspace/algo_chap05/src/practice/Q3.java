package practice;

public class Q3 {
	public static int gcdArray(int[] a, int start, int no) {
		if(no == 1) {
			return a[0];
		}else if(no == 2) {
			return gcd(a[start], a[start+1]);
		}else {
			return gcd(a[start], gcdArray(a, start + 1, no-1));
		}
	}

	public static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}
		return gcd(y, x % y);
	}
}
