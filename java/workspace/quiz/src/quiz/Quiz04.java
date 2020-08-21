package quiz;

public class Quiz04 {
	public static void main(String[] args) {
		/*
		 * 1~150까지 랜덤한 정수를 발생시키고, 사과의 개수라고 가정
		 * bucket은 사과를 10개 담을 수 있는 바구니
		 * 
		 * 랜덤한 사과의 개수에 따라서 필요한 bucket의 개수를 구하는 3항 연산식
		 */
		final int MAX_APPLE = 10;
		
		int appleNum = (int)(Math.random()*150) + 1;
		int bucketNum = (appleNum % MAX_APPLE) == 0 ? (appleNum / MAX_APPLE) : (appleNum / MAX_APPLE) + 1;
		
		System.out.println("사과의 개수: " + appleNum);
		System.out.println("필요한 바구니의 개수: " + bucketNum);
		
	}
}
