package codingtest.highscorekit;

import java.util.Arrays;

public class StockPrice {
	public static void main(String[] args) {
		int[] test = {1, 2, 3, 2, 3};
		
		System.out.println(Arrays.toString(solution(test)));
	}
	
	public static int[] solution(int[] prices) {
		boolean isDown;		
        int count;
        int index = 0;
        int length = prices.length;
        
        int[] answer = {};
        answer = new int[length];
        
        for(int i = 0 ; i < length; i++){
            count = 0;
            isDown = false;
            while(!isDown){
                if(i == length - 1){
                    break;
                }
                int j = i + 1;
                int val = prices[i];
                count++;
                
                while(val <= prices[j]) {
                	j++;
                	count++;
                	if(j == length) { 
                		count--;
                		break;
                	}
                }
                isDown = true;
            }
            answer[index] = count;
            index++;
        }
        
        
        return answer;
	}

}

