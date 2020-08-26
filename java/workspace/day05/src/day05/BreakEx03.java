package day05;

public class BreakEx03 {
	public static void main(String[] args) {
		
//		boolean bool = false; // 탈출을 하기 위한 변수
//		
//		for(char u = 'A'; u <= 'Z'; u++) {
//			for(char l = 'a'; l <= 'z'; l++) {
//				System.out.println(u + "-" + l);
//				
//				if(l == 'c') {
//					bool = true;
//					break;
//				}
//			}
//			if(bool) break;
//		}
		
		start:for(char u = 'A'; u <= 'Z'; u++) {
			for(char l = 'a'; l <= 'z'; l++) {
				System.out.println(u + "-" + l);
				
				if(l == 'c') {
					break start;
				}
			}
		}
		
	}
}
