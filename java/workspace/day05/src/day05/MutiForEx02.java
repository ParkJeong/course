package day05;

public class MutiForEx02 {
	public static void main(String[] args) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		int lineCount = 5;
		int starCount = 1;
		
		for(int i = 0; i < lineCount; i++) {
			for(int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			starCount++;
			System.out.println();
		}
		System.out.println("===============");
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		starCount = 5;
		
		for(int i = 0; i < lineCount; i++) {
			for(int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			starCount--;
			System.out.println();
		}
		System.out.println("==================");
		
		/*
		 *    *
		 *   ***
		 *  *****
		 * *******
		 */
		starCount = 1;
		int spaceCount = 4;
		for(int i = 0; i < lineCount; i++) {
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			
			starCount += 2;
			spaceCount -= 1;
			System.out.println();
			
		}
		
	}
}
