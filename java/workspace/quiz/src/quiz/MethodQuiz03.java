package quiz;

import java.util.Arrays;

public class MethodQuiz03 {
	public static void main(String[] args) {
		String str = java(5);
		System.out.println(str);
		
		str = java(9);
		System.out.println(str);
		System.out.println(sumOfAliquot(5));
		System.out.println(sumOfAliquot(6));
		
		//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37
		System.out.println(primeNum(10)); // 4
		System.out.println(primeNum(19)); // 8
		System.out.println(primeNum(37)); // 12
		
		
		System.out.println("7~9의 사이의 수의 합: " + sumNum(7, 9));
		System.out.println("9~7의 사이의 수의 합: " + sumNum(9, 7));
		System.out.println("5~5의 사이의 수의 합: " + sumNum(5, 5));
		
		int[] arr = lottoNum();
		long money = lottoRun(arr);
		System.out.println("당첨되기까지 사용한 금액은 " + money + "원입니다.");
		
		String[] participant = {"홍길동", "홍길자", "이순신", "신사임당", "이순신"};
		String[] completion = {"홍길자", "홍길동", "신사임당", "이순신"};
		
		
		System.out.println("완주하지 못한 사람: " + solution(participant, completion));
	}
	
	// Quiz18
	static String java(int num) {
		String str = "";
		for(int i = 0; i < num; i++) {
			str += i % 2 == 0 ? "자" : "바";
		}
		return str;
	}
	
	// Quiz19
	static int sumOfAliquot(int num) {
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	// Quiz20
	static int primeNum(int num) {
		int count = 0;
		boolean isPrimary;
		
		for(int i = 2; i <= num; i++) {
			
			isPrimary = true;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					isPrimary = false;
				}
			}
			if(isPrimary) {
				count++;
			}
		}
		
		return count;
	}
	
	// Quiz 21
	static int sumNum(int num1, int num2) {
		int sum = 0;
		int start = num1 <= num2 ? num1 : num2;
		int end = num1 > num2 ? num1 : num2;
		
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
	
	// Quiz 22
	static int[] lottoNum() {
		int[] lotto = new int[6];
		boolean isFound;
		int randomNum;
		int count = 0;
		
		while(count <= 5) {
			
			randomNum = (int)(Math.random() * 45) + 1;
			
			isFound = true;
			for(int i = 0; i < count; i++) {
				if(lotto[i] == randomNum) {
					isFound = false;
					break;
				}
			}
			if(isFound) {
				lotto[count] = randomNum;
				count++;
			}
		}
		
		return lotto;
	}
	
	static long lottoRun(int[] lottoNum) {
		long cost = 0;
		boolean isWon = false;
		int[] lottery;
		
		while(!isWon) {
			cost += 1000;
			lottery = lottoNum();
			
			isWon = true;
			Arrays.sort(lottoNum);
			Arrays.sort(lottery);
			
			isWon = Arrays.equals(lottoNum, lottery);
			
//			for(int i = 0 ; i < lottoNum.length; i++) {
//				if(lottoNum[i] != lottery[i]) {
//					isWon = false;
//					break;
//				}
//			}
			
		}
		
		return cost;
	}
	
	// Quiz 23
	static String solution(String[] participants, String[] completions) {
		
		Arrays.sort(participants);
		Arrays.sort(completions);
		
		for(int i = 0; i < completions.length; i++) {
			if(participants[i] != completions[i]) {
				return participants[i];
			}
		}
		
		return participants[participants.length - 1];
	}
}
