package quiz;

public class Quiz03 {
	public static void main(String[] args) {
		// Math.random()을 이용하여 -5 ~ 5의 랜덤 수를 발생
		// 3항 연산 식을 사용해서, 절댓값을 구하는 식을 세워라.
		// 실행화면
		// 랜덤값:
		// 절댓값:
		
		int randomNum = (int)(Math.random()*11) - 5;
		int absNum = randomNum > 0 ? randomNum : -randomNum;

		System.out.println("랜덤값: " + randomNum);
		System.out.println("절댓값: " + absNum);

	}
}
