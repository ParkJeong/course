package practice;

public class Quiz01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		int result;

		if(operator == '+') {
			result = num1 + num2;
		} 
		else if(operator == '-') {
			result = num1 + num2;			
		} 
		else if(operator == '*') {
			result = num1 * num2;			
		}
		else {
			result = num1 / num2;				
		}
		System.out.println(num1 + "" + operator + num2 + "=" + result);

		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		default:
			result = num1 / num2;
		}
		System.out.println(num1 + "" + operator + num2 + "=" + result);

		System.out.println("===================================");

		for(int i = 1 ; i <= 9; i++) {
			if(i % 2 == 0)
				continue;
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
			System.out.println();
		}
		System.out.println("===================================");

		for(int i = 1; i <= 9; i++) {

			for(int j = 1; j <= i; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
			System.out.println();
		}

		System.out.println("===================================");

		int height = 4;

		for(int i = 1; i <= height; i++) {
			//앞 공백
			for(int j = i; j <= height-1; j++) {
				System.out.print(" ");
			}
			//별
			for(int k = 1; k <= 2*i - 1; k++) {
				System.out.print("*");
			}
			//뒷 공백
			for(int j = i; j <= height-1; j++) {

				System.out.print(" ");
			}
			System.out.println();
		}
		
		int lineCount = 4;
		int spaceCount = lineCount/2 + 1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<starCount; j++) {
				System.out.print("*");
			}
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(" ");
			}
			spaceCount -= 1;
			starCount += 2;
			System.out.println();
		}

		
		
		
		System.out.println("===================================");
		height = 7;
		int topHeight = height/2 + 1;
		int bottomHeight = height/2;
		
		for(int i = 1; i <= topHeight; i++) {
			//앞 공백
			for(int j = i; j <= topHeight-1; j++) {
				System.out.print(" ");
			}
			//별
			for(int k = 1; k <= 2*i - 1; k++) {
				System.out.print("*");
			}
			//뒷 공백
			for(int j = i; j <= topHeight-1; j++) {

				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= bottomHeight; i++) {
			//앞 공백
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			//별
			for(int k = 1; k <= 2*(bottomHeight - i) + 1; k++) {
				System.out.print("*");
			}
			//뒷 공백
			for(int j = 1; j <= i; j++) {

				System.out.print(" ");
			}
			System.out.println();
		}
		
		lineCount = 7;
		spaceCount = lineCount/2;
		starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<starCount; j++) {
				System.out.print("*");
			}
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(" ");
			}
			
			if(i >= lineCount/2) {
				spaceCount += 1;
				starCount -= 2;
			} else {
				spaceCount -= 1;
				starCount += 2;
			}
			System.out.println();
		}
	}
}
