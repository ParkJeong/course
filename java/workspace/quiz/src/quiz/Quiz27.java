package quiz;

public class Quiz27 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i += 3) {
			
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t", i, j, i*j);
				System.out.printf("%d x %d = %d\t", i+1, j, (i+1)*j);
				System.out.printf("%d x %d = %d\n", i+2, j, (i+2)*j);
			}
			System.out.println();
		}
	}
}
