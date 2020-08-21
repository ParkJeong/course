package quiz;

public class Quiz02 {
	public static void main(String[] args) {
		// 1~100까지 랜덤한 정수를 발생시킨 다음에 짝수인지 홀수인지 출력하는 3항 연산식.
		
		int randomNum = (int)(Math.random()*100 + 1);
		String result = (randomNum%2) == 0 ? "짝수" : "홀수";
		
		System.out.println("랜덤값: " + randomNum + "은(는) " + result + "입니다.");
	}
}
