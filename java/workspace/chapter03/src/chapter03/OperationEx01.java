package chapter03;

public class OperationEx01 {
	public static void main(String[] args) {
		final double SUBJECT_NUM = 3.0;
		
		int korScore = 100;
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / SUBJECT_NUM;
		System.out.println(avgScore);
	}
}
