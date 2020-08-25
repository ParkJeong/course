package chapter06;

public class Student3 {
	private static int serialNum = 1000;
	int cardNum;
	int studentNumber;
	
	public Student3() {
		studentNumber = serialNum;
		cardNum = studentNumber + 100;
		serialNum++;
	}
}
