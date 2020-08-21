package quiz;

public class Test02 {
	public static void main(String[] args) {
		/* 
		 * A~Z까지 반복문을 통해서 문자열을 붙여서 출력.
		 * ex) ABCDEF...Z
		 *  
		 */
		char start = 'A';
		char startPoint = 'A' - '0';
		char endPoint = 'Z' - '0';
		int gap = endPoint - startPoint;
		
		for (int i = 0; i <= gap; i++) {
			System.out.print(start++);
		}
	}
}
