package practice;

public class Q6 {
	
	static String[] name = {"A기둥", "B기둥", "C기둥"};
	
	static void move(int no, int x, int y) {
		
		if(no > 1) {
			move(no - 1 , x, 6 - x - y);
		}
		
		System.out.println("원반[" + no + "]을" + name[x - 1] + "기둥에서 " + name[y - 1] + "기둥으로 옮김");
		
		if(no > 1) {
			move(no - 1 , 6 - x - y, y);
		}
		
	}
}
