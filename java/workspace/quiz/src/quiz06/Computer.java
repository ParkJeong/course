package quiz06;

public class Computer extends Calculator{
	@Override
	double circle(int radius) {
		return Math.PI * radius * radius;
	}
	
	double rect(double length) {
		return length * length;
	}
	
	double rect(double width, double height) {
		return width * height;
	}
	
	double rect(double width, double height, double length) {
		return width * height * length;
	}
	
	
}
