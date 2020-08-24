package quiz;

public class Quiz12 {
	public static void main(String[] args) {
		String[] arr = {"안녕", "hello", "니하오", "@#$"};
		
		/*
		 * Math.random()을 이용해서 0~3까지 랜덤수를 만든다.
		 * 해당 랜덤수를 배열에 index에 적용해서
		 * 선택된 단어가 한국어, 영어, 중국어 인지 처리
		 * 
		 */
		
		int randomNum = (int)(Math.random()*arr.length);
		String lang ="";
		
		
		switch (randomNum) {
		case 0:
			lang = "한국어";
			break;
		case 1:
			lang = "영어";
			break;
		case 2:
			lang = "중국어";
			break;
		case 3:
			lang = "특수문자";
			break;
		default:
		}
		System.out.println(arr[randomNum] + "은 " + lang + "입니다.");
	}
}
