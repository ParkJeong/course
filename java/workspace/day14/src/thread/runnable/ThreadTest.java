package thread.runnable;

public class ThreadTest implements Runnable{

	// Runnable 인터페이스 구현
	// 쓰레드의 기능을 사용하고 싶다면,
	// Thread 클래스의 static메서드 사용
	
	@Override
	public void run() {
		// 현재 실행중인 쓰레드의 이름
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("쓰레드 시작1");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			} // ms단위이다. 1000ms = 1s
		}
		
		System.out.println("쓰레드 종료1");
	}
	
}
