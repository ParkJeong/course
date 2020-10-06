package quiz30;

import java.util.Random;

public class ThreadLocation extends Thread{
	
	int vote = 0;
	StringBuilder voteImage;
	
	@Override
	public void run() {
		while(vote < 100) {
			Random rand = new Random();
			vote += rand.nextInt(5) + 5;
			
			if(vote > 100) {
				vote = 100;
			}
			
			
			voteImage = new StringBuilder();
			for(int i = 0; i < vote; i++) {
				voteImage.append("*");
			}
			System.out.println(getName() + " 개표율 " + vote + "%: " + voteImage);

		}
		System.out.println(getName() + "의 개표가 완료되었습니다.");
	}
}
