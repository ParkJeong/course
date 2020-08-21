package quiz;

public class Quiz05 {
	public static void main(String[] args) {
		// -5~5까지 랜덤값을 만들고 0이라면 0출력, 양수라면 양수, 음수라면 음수 출력
		// 삼항 연산식으로 처리
		
		int randomNum = (int)(Math.random()*11) - 5;
		String result = randomNum == 0 ? "0" : randomNum > 0 ? "양수" : "음수";
		
		System.out.println("랜덤값: " + randomNum);
		System.out.println("결과: " + result);
	}
}
