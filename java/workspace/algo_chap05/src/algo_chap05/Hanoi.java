package algo_chap05;

public class Hanoi {
	// 기둥의 합이 6이므로 시작 기둥, 목표 기둥이 어느 기둥이더라도 중간 기둥은 6 - x - y로 구할 수 있다.
	static void move(int no, int x, int y) {
		if(no > 1) {
			move(no - 1, x, 6 - x - y);
		}
		
		System.out.println("원반[" + no + "]을" + x + "기둥에서  " + y + "기둥으로 옮김");
		
		if(no > 1) {
			move(no - 1, 6 - x - y, y);
		}

	}

}
