package practice;

class Factorial{
	public int Factorial(int x) {
		if(x != 0) {
			return x * Factorial(x-1); 
		}
		return 1;
	}
	
	public int Factorial2(int n) {
		int fact = 1;
		while(n > 1){
			fact *= n--;
		}
		return fact;
	}
}

public class Q1 {

}
