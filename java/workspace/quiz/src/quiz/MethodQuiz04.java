package quiz;

import java.util.Arrays;

public class MethodQuiz04 {
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,3,4
				};
		
		System.out.println(Arrays.equals(arr1, arr2));
		
	}
	
	static int[] lottoNum() {
		
		int[] arr = new int[6];
		
		int index = 0;
		while(true) {
			if(index >= 6) {
				break;
			}
			int num = (int)(Math.random() * 45) + 1;
			
			//중복검사
			
			
			arr[index] = num;
			index++;
		}
		
		return arr;
	}
}
