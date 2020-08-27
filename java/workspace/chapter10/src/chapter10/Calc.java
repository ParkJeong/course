package chapter10;

public interface Calc {
	double PI = 3.14;		// 인터페이스에서 선언한 변수는
	int ERROR = -999999999;	// 컴파일 과정에서 상수로 변환됨
	
	int add(int num1, int num2);		// 인터페이스 에서 선언한 메서드는
	int substract(int num1, int num2);	// 컴파일 과정에서 추상 메서드로 변환됨
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
