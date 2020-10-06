package quiz29;

public class MainClass {
	public static void main(String[] args) {
		MusicThread musicThread = new MusicThread();
		VideoThread videoThread = new VideoThread();
		
		Thread thread1 = new Thread(musicThread, "music1");
		Thread thread2 = new Thread(videoThread);
		
		thread2.setName("video2");
		
		thread1.start();
		thread2.start();
		
		System.out.println("메인 종료");
	}
}
