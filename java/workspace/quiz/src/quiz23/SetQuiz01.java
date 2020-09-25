package quiz23;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuiz01 {
	/*
	 * 1. Random 객체를 이용해서 1~45 랜덤수를 만들고
	 * 2. set을 이용해서 6개의 로또번호를 만들어라.
	 */

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Random ran = new Random();
		
		while(set.size() < 6) {
			set.add(ran.nextInt(45)+ 1);
		}
		
		System.out.println(set.toString());
	}

}
