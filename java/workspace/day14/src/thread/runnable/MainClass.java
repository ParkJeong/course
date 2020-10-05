package thread.runnable;

public class MainClass {
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		
		Thread thread = new Thread(t, "쓰레드1"); // 동작시킬 클래스, 이름
		thread.start(); // 쓰레드 시작
		
		System.out.println("메인종료~~~");
	}
}
