package quiz06;

public class Calculator {
	double result = 0;
	double pi = 3.14;
	
	void add(int num) {
		result += num;
	}
	void sub(int num) {
		result -= num;
	}
	void multi(int num) {
		result *= num;
	}
	void div(int num) {
		result /= num;
	}
	
	double circle(int radius) {
		return pi * radius * radius;
	}
}
