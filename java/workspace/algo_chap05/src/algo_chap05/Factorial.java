package algo_chap05;

public class Factorial {
	static int factorial(int n) {
		if(n > 0) {
			return n * factorial(n-1);
		}
		return 1;
	}
}
