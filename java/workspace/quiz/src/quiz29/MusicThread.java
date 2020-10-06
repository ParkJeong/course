package quiz29;

public class MusicThread implements Runnable{
	@Override
	public void run() {
		System.out.println("음악을 15초간 재생합니다.");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("음악 재생이 끝났습니다.");
		
	}
}
